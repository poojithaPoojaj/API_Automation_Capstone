package integrationtests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.create.CreatePostRequestBody;
import ultralesson.capstone.apiautomation.users.response.create.post.CreatePostResponse;
import ultralesson.capstone.apiautomation.users.response.get.post.GetDeletedPostResponse;

public class PostsTests {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldAbleToCeatePostAndDeleteIt(){
        CreatePostRequestBody requestBody=new CreatePostRequestBody.Builder().build();
        CreatePostResponse createPostResponse= usersService.createPost(requestBody);
        createPostResponse.assertPost(requestBody);
        GetDeletedPostResponse getDeletePostResponse=usersService.deletePostByIdAndGet(createPostResponse.getId());
        getDeletePostResponse.assertDeletePostByid(createPostResponse.getId());
    }
}
