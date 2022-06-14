package domain;

public class Waiter extends Person{
    private String password;

    public Waiter(String cpf, String password, String name) {
        this.password = password;
        super.cpf = cpf;
        super.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
