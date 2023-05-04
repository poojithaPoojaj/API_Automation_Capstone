package ultralesson.capstone.apiautomation.users.response.get.post;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

import java.util.ArrayList;
@Getter
public class GetPostResponse {
    @Setter
    public int statusCode;
        public String id;
        public String image;
        public int likes;
        public String link;
        public ArrayList<String> tags;
        public String text;

        public String publishDate;
        public Owner owner;

    public void assertPostById(String id) {
        Assert.assertEquals(this.getStatusCode(),200);
        Assert.assertNotNull(this.getId());
        Assert.assertEquals(this.id,id);
    }

    public class Owner{
        public String id;
        public String title;
        public String firstName;
        public String lastName;
        public String picture;
    }

}
