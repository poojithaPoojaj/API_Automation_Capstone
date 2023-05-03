package ultralesson.capstone.apiautomation.users.response.get.user;

import ultralesson.capstone.apiautomation.users.create.CreateUserRequestBody;

import static org.testng.Assert.assertEquals;

public class GetUserResponse {
    private int statusCode;
    public String id;

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String title;

    public int getStatusCode() {
        return statusCode;
    }

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

    public String getEmail() {
        return email;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public String firstName;
    public String lastName;
    public String email;
    public String registerDate;
    public String updatedDate;

    public void assertUser(CreateUserRequestBody requestBody) {
        assertEquals(this.firstName,requestBody.getFirstName());
        assertEquals(this.lastName,requestBody.getLastName());
        assertEquals(this.email,requestBody.getEmail());
    }
}
