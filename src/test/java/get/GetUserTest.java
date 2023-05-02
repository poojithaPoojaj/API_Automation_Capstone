package get;

import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.users.UserClient;

import static io.restassured.RestAssured.given;

public class GetUserTest {
    private UserClient userClient;
    @BeforeClass
    public void beforeClass(){
        userClient=new UserClient();
    }

    @Test
    public void shouldGetUserById(){
        String id="60d0fe4f5311236168a109cb";
        given()
                .when()
                .header("app-id","644a5bc4aa25ea9dea306cf4")
                .get("https://dummyapi.io/data/v1/user/"+id)
                .then()
                .statusCode(200)
                .log().body();

    }
    @Test
    public void shouldGetAllUsers(){
       userClient. getAllUsers()
                .then()
                .statusCode(200)
                .log().body();
    }


}
