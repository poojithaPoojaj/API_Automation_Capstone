package ultralesson.capstone.apiautomation.users.response.get.post;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
@Getter
public class GetDeletedPostResponse {
    @Setter

    private int statusCode;

    private String id;


    public void assertDeletePostByid(String id) {
        Assert.assertEquals(this.statusCode,200);
        Assert.assertEquals(this.id,id);
    }
}
