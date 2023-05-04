package ultralesson.capstone.apiautomation.users.create;

import lombok.Getter;

@Getter
public class CreatePostRequestBody {
    private String owner;
    public CreatePostRequestBody(Builder builder) {
        this.owner=builder.owner;
    }
    public static class Builder{
      private String owner;
      public Builder(){
          this.owner="60d0fe4f5311236168a109cd";
      }
      public Builder ownerId(String ownerId){
          this.owner=ownerId;
          return this;
      }
      public CreatePostRequestBody build(){
          CreatePostRequestBody createPostRequestBody=new CreatePostRequestBody(this);
          return createPostRequestBody;
      }
    }
}
