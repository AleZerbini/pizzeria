package domains;

public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }

    public boolean validate(String login, String senha) {
        return this.username.equals(login) && this.password.equals(senha);
    }
}
