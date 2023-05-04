package ultralesson.capstone.apiautomation.users.response.get.user;

import lombok.Getter;
import lombok.Setter;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;

import static org.testng.Assert.assertEquals;

@Getter
public class GetUserResponse {
    @Setter
    private int statusCode;
    public String id;


    public String title;

    public String firstName;
    public String lastName;
    public String email;
    public String registerDate;
    public String updatedDate;

    public void assertUser(CreateUserRequestBody requestBody) {
        assertEquals(this.firstName,requestBody.getFirstName());
        assertEquals(this.lastName,requestBody.getLastName());
        assertEquals(this.email,requestBody.getEmail());
    }
}
