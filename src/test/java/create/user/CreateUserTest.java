package create.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UsersClient;
import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;
import ultralesson.capstone.apiautomation.users.response.create.user.CreateUserResponse;


import static io.restassured.RestAssured.given;

public class CreateUserTest {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldAbleToCreateUser(){
        CreateUserRequestBody requestBody=new CreateUserRequestBody.Builder().build();
        CreateUserResponse createUserResponse= usersService.createUser(requestBody);
        createUserResponse.assertUser(requestBody);

    }


}
