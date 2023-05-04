package ultralesson.capstone.apiautomation.users.response.get.post;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
public class GetAllPostsResponse {
    @Setter
    public int statusCode;
    public ArrayList<Data> data;


    public int total;
    public int page;



    public int limit;
    public static class Data{
        public String id;



        public String image;
        public int likes;
        public ArrayList<String> tags;
        public String text;
        public String publishDate;
        public Owner owner;

        public  static class Owner{
            public String id;
            public String title;
            public String firstName;
            public String lastName;



            public String picture;
        }
    }
}
