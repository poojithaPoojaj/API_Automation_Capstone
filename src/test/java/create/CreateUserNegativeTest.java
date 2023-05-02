package create;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UserClient;

public class CreateUserNegativeTest {
    private UserClient userClient;
    @BeforeClass
    public void beforeClass(){
        userClient=new UserClient();
    }
    @Test
    public void shouldNotAllowToCreateUserWithInvalidEmail(){
        String email= "poojitha"+"@gmail.com";
        String body = "{\n" +
                "  \"id\": \"123\",\n" +
                "  \"firstName\": \"ppojitha\",\n" +
                "  \"lastName\": \"Doe\",\n" +
                "  \"picture\": \"https://example.com/profile.jpg\",\n" +
                "  \"email\": \"" + email + "\",\n" +
                "  \"gender\": \"male\"\n" +
                "}";
       userClient.createUser(body).then().log().body()
                .body("data.email", Matchers.equalTo("Email already used"));

    }
}
