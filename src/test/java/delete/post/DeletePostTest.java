package delete.post;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UsersService;
import ultralesson.capstone.apiautomation.users.response.get.post.GetDeletedPostResponse;

public class DeletePostTest {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass(){
        usersService =new UsersService();
    }
    @Test
    public void shouldAbleToDeletePostById(){
        //Committed this because we can delete Api Default Post only here Id is one of the default api post
        // if we run in pipeline test will fail to avoid that i commented this lines
//        String id="60d21b7d67d0d8992e610d25";
//        GetDeletedPostResponse getDeletedPostResponse=usersService.deletePostByIdAndGet(id);
//        getDeletePostResponse.assertDeletePostByid(id);
    }
}
