package create.post;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.create.CreatePostRequestBody;
import ultralesson.capstone.apiautomation.users.response.create.post.CreatePostResponse;


public class CreatePostTest {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldAbleToCreatePost(){
        CreatePostRequestBody requestBody=new CreatePostRequestBody.Builder().build();
        CreatePostResponse createPostResponse= usersService.createPost(requestBody);
        createPostResponse.assertPost(requestBody);
    }
}
