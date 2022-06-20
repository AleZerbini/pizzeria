package domains;

public class Employee extends Person{
    protected Account account;

    public Employee(String name, String surname, String cpf, Account account) {
        super(name, surname, cpf);
        this.account = account;
    }
}
