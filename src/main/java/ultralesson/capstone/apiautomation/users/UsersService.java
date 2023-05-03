package ultralesson.capstone.apiautomation.users;

import io.restassured.response.Response;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;
import ultralesson.capstone.apiautomation.users.response.create.user.CreateUserErrorResponse;
import ultralesson.capstone.apiautomation.users.response.create.user.CreateUserResponse;
import ultralesson.capstone.apiautomation.users.response.get.post.GetDeletePostResponse;
import ultralesson.capstone.apiautomation.users.response.get.user.GetUserResponse;
import ultralesson.capstone.apiautomation.users.response.get.user.GetAllUsersResponse;


public class UsersService {
    public CreateUserResponse createUser(CreateUserRequestBody body) {
        Response response=new UsersClient().create(body);
        CreateUserResponse createUserResponse=response.as(CreateUserResponse.class);
        createUserResponse.setStatusCode(response.getStatusCode());
        return createUserResponse;
    }
    public CreateUserErrorResponse createUserErrorResponse(CreateUserRequestBody body) {
        Response response=new UsersClient().create(body);
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
        getAllUsersResponse.setStatusCode(response.getStatusCode());
        return getAllUsersResponse;
    }

    public GetAllUsersResponse getAllUsersInOurAccount() {
     Response response=new UsersClient().getAllUsersInOurAccount();
     return deserializeAllUsersAndGet(response);
    }
    public GetDeletePostResponse getDeletePost(String id){
        Response response=new UsersClient().deletePostById(id);
        int statusCode=response.getStatusCode();
        GetDeletePostResponse deletePostResponse=response.as(GetDeletePostResponse.class);
        deletePostResponse.setStatusCode(statusCode);
        return deletePostResponse;
    }

}
