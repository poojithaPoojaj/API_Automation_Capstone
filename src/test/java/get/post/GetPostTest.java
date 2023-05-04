package get.post;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.response.create.post.CreatePostResponse;
import ultralesson.capstone.apiautomation.users.response.get.post.GetPostResponse;

public class GetPostTest {

    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldAbleToGetPostById(){
        String id="60d21bd767d0d8992e610e31";
        GetPostResponse getPostResponse= usersService.getPost(id);
        getPostResponse.assertPostById(id);

    }
}
