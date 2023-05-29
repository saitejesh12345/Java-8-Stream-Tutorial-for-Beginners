package java8tutorial.sorting_mappingUsingStreamapi;


//Here we dont want to sent password to client ie USER DTO so this is Usecase,so Iam going to
//remove password field
public class UserDTO {
    private int id;
    private String userName;

    private String email;

    public UserDTO(int id, String userName, String email) {

        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
