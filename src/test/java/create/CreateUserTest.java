package create;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import ultralesson.capstone.apiautomation.UserClient;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class CreateUserTest {
    @Test
    public void shouldAbleToCreateUser(){
        String email= UUID.randomUUID()+"@gmail.com";
        String body = "{\n" +
                "  \"id\": \"123\",\n" +
                "  \"firstName\": \"ppojitha\",\n" +
                "  \"lastName\": \"Doe\",\n" +
                "  \"picture\": \"https://example.com/profile.jpg\",\n" +
                "  \"email\": \"" + email + "\",\n" +
                "  \"gender\": \"male\"\n" +
                "}";
        new UserClient().createUser(body).then().log().body().statusCode(200)
                .body("id",Matchers.notNullValue())
                .body("email",Matchers.equalTo(email));
    }


}
