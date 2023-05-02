package create;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.UserClient;

public class CreateUserNegativeTest {
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
       new UserClient().createUser(body).then().log().body()
                .body("data.email", Matchers.equalTo("Email already used"));

    }
}
