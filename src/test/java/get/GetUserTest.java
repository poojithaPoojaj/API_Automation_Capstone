package get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserTest {

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
}
