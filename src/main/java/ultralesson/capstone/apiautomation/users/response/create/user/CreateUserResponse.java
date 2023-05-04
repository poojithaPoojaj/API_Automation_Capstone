package ultralesson.capstone.apiautomation.users.response.create.user;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;
@Getter
public class CreateUserResponse {
    @Setter
    private int statusCode;
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String registerDate;
    private String updatedDate;



    public void assertUser(CreateUserRequestBody requestBody) {
        Assert.assertEquals(this.getStatusCode(),200);
        Assert.assertNotNull(this.getId());
        Assert.assertEquals(requestBody.getEmail(),this.email);
        Assert.assertEquals(requestBody.getFirstName(),this.firstName);
        Assert.assertEquals(requestBody.getLastName(),this.lastName);
    }
}
