package ultralesson.capstone.apiautomation.users.response.create.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.http.util.Asserts;
import org.testng.Assert;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Getter
public class CreateUserErrorResponse {
    @Setter
    private int statusCode;

    @JsonProperty("error")
    private String error;
    @JsonProperty("data")
    private Map<String,String> dataList;

    public void assertHasError(String field, String message) {

        if (dataList.get(field).startsWith(message)) {
            Assert.assertEquals(dataList.size(), 1);
        } else {
            Assert.assertFalse(true, "No Error message came related to this");
        }
    }
}
