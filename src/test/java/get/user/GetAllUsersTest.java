package get.user;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.response.get.user.GetAllUsersResponse;

public class GetAllUsersTest {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldGetAllUsers(){
      GetAllUsersResponse getAllUsersResponse= usersService.getAllUsers();
      getAllUsersResponse.assertAllUsers();
    }
    @Test
    public void shouldGetAllUsersWithLimit(){
        int limitValue=10;
        GetAllUsersResponse getAllUsersResponse= usersService.getAllUsersResponseWithLimit(limitValue);
        getAllUsersResponse.assertAllUsersWithLimit(limitValue);
    }
    @Test
    public void shouldAbleToGetAllUsersCreatedInOurAccount(){
        GetAllUsersResponse getAllUsersResponse= usersService.getAllUsersInOurAccount();
        Assert.assertEquals(getAllUsersResponse.getStatusCode(),200);
    }
}
