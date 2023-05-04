package ultralesson.capstone.apiautomation.users.response.get.user;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

import java.util.ArrayList;
@Getter
public class GetAllUsersResponse {
    @Setter
    private int statusCode;
    public ArrayList<Data> data;
    public int total;
    public int page;
    public int limit;
    public static class Data{
        public String id;
        public String title;
        public String firstName;
        public String lastName;
        public String picture;
    }
    public void assertAllUsersWithLimit(int limit){
        Assert.assertEquals(this.statusCode,200);
        Assert.assertEquals(this.limit,limit);
    }
    public void assertAllUsers(){
        Assert.assertEquals(this.statusCode,200);
        Assert.assertEquals(this.limit,20);
    }

}
