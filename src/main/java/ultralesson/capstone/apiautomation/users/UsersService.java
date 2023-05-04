package ultralesson.capstone.apiautomation.users;

import io.restassured.response.Response;
import ultralesson.capstone.apiautomation.users.create.CreatePostRequestBody;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;
import ultralesson.capstone.apiautomation.users.response.create.post.CreatePostResponse;
import ultralesson.capstone.apiautomation.users.response.create.user.CreateUserErrorResponse;
import ultralesson.capstone.apiautomation.users.response.create.user.CreateUserResponse;
import ultralesson.capstone.apiautomation.users.response.get.post.GetDeletedPostResponse;
import ultralesson.capstone.apiautomation.users.response.get.post.GetPostResponse;
import ultralesson.capstone.apiautomation.users.response.get.user.GetUserResponse;
import ultralesson.capstone.apiautomation.users.response.get.user.GetAllUsersResponse;


public class UsersService {
    public CreateUserResponse createUser(CreateUserRequestBody body) {
        Response response=new UsersClient().createUser(body);
        CreateUserResponse createUserResponse=response.as(CreateUserResponse.class);
        createUserResponse.setStatusCode(response.getStatusCode());
        return createUserResponse;
    }
    public CreateUserErrorResponse createUserErrorResponse(CreateUserRequestBody body) {
        Response response=new UsersClient().createUser(body);
        CreateUserErrorResponse createUserErrorResponse=response.as(CreateUserErrorResponse.class);
        createUserErrorResponse.setStatusCode(response.getStatusCode());
        return createUserErrorResponse;
    }
    public GetUserResponse getUser(String id){
        Response response = new UsersClient().getUser(id);
        int statusCode=response.statusCode();
        GetUserResponse getUserResponse=response.as(GetUserResponse.class);
        getUserResponse.setStatusCode(statusCode);
        return getUserResponse;
    }
    public GetAllUsersResponse getAllUsers() {
        Response response = new UsersClient().getAllUsers();
        return deserializeAllUsersAndGet(response);
    }
    public GetAllUsersResponse getAllUsersResponseWithLimit(int limitValue){
        Response response=new UsersClient().getAllUsersWithLimit(limitValue);
        return deserializeAllUsersAndGet(response);
    }
    public GetAllUsersResponse deserializeAllUsersAndGet(Response response){
        int statusCode=response.getStatusCode();
        GetAllUsersResponse getAllUsersResponse=response.as(GetAllUsersResponse.class);
        getAllUsersResponse.setStatusCode(statusCode);
        return getAllUsersResponse;
    }

    public GetAllUsersResponse getAllUsersInOurAccount() {
     Response response=new UsersClient().getAllUsersInOurAccount();
     return deserializeAllUsersAndGet(response);
    }
    public GetDeletedPostResponse deletePostByIdAndGet(String id){
        Response response=new UsersClient().deletePostById(id);
        int statusCode=response.getStatusCode();
        GetDeletedPostResponse deletePostResponse=response.as(GetDeletedPostResponse.class);
        deletePostResponse.setStatusCode(statusCode);
        return deletePostResponse;
    }
    public CreatePostResponse createPost(CreatePostRequestBody body){
        Response response=new UsersClient().createPost(body);
        CreatePostResponse createPostResponse=response.as(CreatePostResponse.class);
        createPostResponse.setStatusCode(response.getStatusCode());
        return createPostResponse;
    }
    public GetPostResponse getPost(String id){
        Response response = new UsersClient().getPost(id);
        int statusCode=response.statusCode();
        GetPostResponse getUserResponse=response.as(GetPostResponse.class);
        getUserResponse.setStatusCode(statusCode);
        return getUserResponse;
    }

}
