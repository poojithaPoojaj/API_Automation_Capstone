package ultralesson.capstone.apiautomation;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {
    public Response createUser(String body) {
        return given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("app-id", "644a5bc4aa25ea9dea306cf4")
                .body(body)
                .when()
                .post("https://dummyapi.io/data/v1/user/create");
    }

}
