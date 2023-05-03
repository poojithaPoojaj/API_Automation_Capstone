package create.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.response.create.user.CreateUserErrorResponse;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;

import static org.testng.AssertJUnit.assertEquals;

public class CreateUserNegativeTest {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldNotAllowToCreateUserWithInvalidEmail(){

        CreateUserRequestBody requestBody=new CreateUserRequestBody.Builder().email("poojitha@gmail.com").build();
        CreateUserErrorResponse errorResponse= usersService.createUserErrorResponse(requestBody);
        errorResponse.assertHasError("email","Email already used");
    }
    @Test
    public void shouldNotAllowToCreateUserWithBlankFirstName(){
        CreateUserRequestBody requestBody=new CreateUserRequestBody.Builder().firstName("").build();
        CreateUserErrorResponse errorResponse= usersService.createUserErrorResponse(requestBody);
        errorResponse.assertHasError("firstName","Path `firstName` is required.");
    }
    @Test
    public void shouldNotAllowToCreateUserWithBlankLastName(){
        CreateUserRequestBody requestBody=new CreateUserRequestBody.Builder().lastName("").build();
        CreateUserErrorResponse errorResponse= usersService.createUserErrorResponse(requestBody);
        errorResponse.assertHasError("lastName","Path `lastName` is required.");
    }

}
