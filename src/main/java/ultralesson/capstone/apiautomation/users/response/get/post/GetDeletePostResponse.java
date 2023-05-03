package ultralesson.capstone.apiautomation.users.response.get.post;

import org.testng.Assert;

public class GetDeletePostResponse {
    private int statusCode;
    private String id;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getId() {
        return id;
    }

    public void assertDeletePostByid(String id) {
        Assert.assertEquals(this.statusCode,200);
        Assert.assertEquals(this.id,id);
    }
}
