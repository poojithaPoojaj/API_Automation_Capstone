package create;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.create.CreateUserRequestBody;
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
        String firstName = "pojitha";
        String lastName = "Doe";

        CreateUserRequestBody requestBody=new CreateUserRequestBody(firstName,lastName,email);
       userClient.createUser(requestBody).then().log().body()
                .body("data.email", Matchers.equalTo("Email already used"));

    }
}
