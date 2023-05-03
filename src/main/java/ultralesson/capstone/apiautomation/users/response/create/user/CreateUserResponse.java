package ultralesson.capstone.apiautomation.users.response.create.user;

import org.testng.Assert;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;

public class CreateUserResponse {
    private int statusCode;
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    private String registerDate;
    private String updatedDate;

    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    public void assertUser(CreateUserRequestBody requestBody) {
        Assert.assertEquals(this.getStatusCode(),200);
        Assert.assertNotNull(this.getId());
        Assert.assertEquals(requestBody.getEmail(),this.email);
        Assert.assertEquals(requestBody.getFirstName(),this.firstName);
        Assert.assertEquals(requestBody.getLastName(),this.lastName);
    }
}
