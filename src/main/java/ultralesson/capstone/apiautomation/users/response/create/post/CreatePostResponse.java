package ultralesson.capstone.apiautomation.users.response.create.post;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
import ultralesson.capstone.apiautomation.users.create.CreatePostRequestBody;
import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;

import java.util.ArrayList;
@Getter
public class CreatePostResponse {
    @Setter
    private int statusCode;
    public String id;
    public String image;
    public int likes;
    public String link;
    public ArrayList<Object> tags;
    public String text;
    public String publishDate;
    public String updatedDate;
    public Owner owner;

    public class Owner{
        public String id;
        public String title;
        public String firstName;
        public String lastName;
        public String picture;
    }
    public void assertPost(CreatePostRequestBody requestBody) {
        Assert.assertEquals(this.getStatusCode(),200);
        Assert.assertNotNull(this.getId());
        Assert.assertEquals(this.owner.id,requestBody.getOwner());
    }
}
