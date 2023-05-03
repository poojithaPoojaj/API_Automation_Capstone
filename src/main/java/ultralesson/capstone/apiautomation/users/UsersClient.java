package ultralesson.capstone.apiautomation.users;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;
import ultralesson.capstone.apiautomation.users.response.create.user.CreateUserResponse;

import static io.restassured.RestAssured.given;

public class UsersClient {


    public  Response create(CreateUserRequestBody body) {
        Response reponse = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .body(body)
                .when()
                .post("https://dummyapi.io/data/v1/user/create");
        reponse.then().log().body();
        return reponse;
    }



    Response getAllUsers() {
        Response response=given()
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .when()
                .get("https://dummyapi.io/data/v1/user");

        response.then().log().body();
        return response;
    }

    private  Response getAllPosts() {
        Response response=given()
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .when()
                .get("https://dummyapi.io/data/v1/post");
        return  response;
    }


    Response getUser(String id) {
        Response response=given()
                .pathParam("id", id)
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .when()
                .get("https://dummyapi.io/data/v1/user/{id}");
        response.then().log().body();
        return response;
    }
    Response getAllUsersWithLimit(int limit){
        Response response=given()
                .pathParam("limit",limit)
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .when()
                .get("https://dummyapi.io/data/v1/user?limit={limit}");

        response.then().log().body();
        return response;
    }

    public Response getAllUsersInOurAccount() {
        Response response=given()
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .when()
                .get("https://dummyapi.io/data/v1/user?created=1");
        response.then().log().body();
        return response;
    }
    public Response deletePostById(String id){
        Response response=given()
                .pathParam("id", id)
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .when()
                .delete("https://dummyapi.io/data/v1/post/{id}");
        response.then().log().body();
        return response;
    }
}
