package ultralesson.capstone.apiautomation.users.create;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Data
public class CreateUserRequestBody {

    private String firstName;
    private String lastName;
    private String email;

    public CreateUserRequestBody(Builder builder) {
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.email=builder.email;
    }
    public static class Builder{
        private String firstName;
        private String lastName;
        private String email;
        public Builder(){
            this.firstName="poojitha";
            this.lastName="pooja";
            this.email= UUID.randomUUID()+"@gmail.com";
        }
        public Builder email(String email){
            this.email=email;
            return this;
        }
        public Builder firstName(String name){
            this.firstName=name;
            return this;
        }
        public Builder lastName(String name){
            this.lastName=name;
            return this;
        }
        public CreateUserRequestBody build(){
            CreateUserRequestBody createUserRequestBody=new CreateUserRequestBody(this);
            return createUserRequestBody;
        }

    }


}
