package in.suryaumapathy.netlifytracker.dto;

public class LoginDTO {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDTO [password=" + password + ", username=" + username + "]";
    }

    private String username;

    private String password;

}
