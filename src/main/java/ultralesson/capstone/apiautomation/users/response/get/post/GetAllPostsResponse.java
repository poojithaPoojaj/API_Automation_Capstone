package ultralesson.capstone.apiautomation.users.response.get.post;

import java.util.ArrayList;

public class GetAllPostsResponse {
    public int statusCode;
    public ArrayList<Data> data;

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int total;
    public int page;

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

    public int limit;
    public static class Data{
        public String id;

        public String getId() {
            return id;
        }

        public String getImage() {
            return image;
        }

        public int getLikes() {
            return likes;
        }

        public ArrayList<String> getTags() {
            return tags;
        }

        public String getText() {
            return text;
        }

        public String getPublishDate() {
            return publishDate;
        }

        public Owner getOwner() {
            return owner;
        }

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

            public String picture;
        }
    }
}
