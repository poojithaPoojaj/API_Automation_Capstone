package integrationtests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;

public class UsersTest {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldCreateAndGetUser(){
        CreateUserRequestBody requestBody=new CreateUserRequestBody.Builder().build();
        String id= usersService.createUser(requestBody).getId();
        usersService.getUser(id).assertUser(requestBody);

    }
}
