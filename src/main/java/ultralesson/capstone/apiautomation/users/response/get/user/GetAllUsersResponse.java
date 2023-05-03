package ultralesson.capstone.apiautomation.users.response.get.user;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;

import java.util.ArrayList;

public class GetAllUsersResponse {
    private int statusCode;
    public ArrayList<Data> data;

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int total;

    public int getStatusCode() {
        return statusCode;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public int getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getLimit() {
        return limit;
    }

    public int page;
    public int limit;
    public static class Data{
        public String id;
        public String title;
        public String firstName;
        public String lastName;
        public String picture;

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPicture() {
            return picture;
        }

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
