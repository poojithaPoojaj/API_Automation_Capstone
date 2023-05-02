import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class SampleTest {
    @Test
    public void shouldGetAllUsers(){
        //1.Arrange
        //2.Act
        //3.Assert
        given()
                .when()
                .header("app-id","644a5bc4aa25ea9dea306cf4")
                    .get("https://dummyapi.io/data/v1/user")
                .then()
                    .statusCode(200)
                    .log().body();
    }
}
