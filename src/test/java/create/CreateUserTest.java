package create;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.create.CreateUserRequestBody;
import ultralesson.capstone.apiautomation.users.UserClient;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class CreateUserTest {
    private UserClient userClient;
    @BeforeClass
    public void beforeClass(){
        userClient=new UserClient();
    }
    @Test
    public void shouldAbleToCreateUser(){
        String email= UUID.randomUUID()+"@gmail.com";
        String firstName= "pojitha";
        String lastName = "Doe";
        CreateUserRequestBody requestBody=new CreateUserRequestBody(firstName,lastName,email);
        userClient.createUser(requestBody).then().log().body().statusCode(200)
                .body("id",Matchers.notNullValue())
                .body("email",Matchers.equalTo(email));
    }


}
