package ultralesson.capstone.apiautomation.users.create;

import lombok.Getter;

import java.util.UUID;


public class CreateUserRequestBody {

    private String firstName;

    public CreateUserRequestBody(Builder builder) {
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.email=builder.email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    private String lastName;
    private String email;
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
