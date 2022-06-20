package domains;

public abstract class Person {
    protected String name;
    protected String surname;
    protected String cpf;

    public Person(String name, String surname, String cpf) {
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCpf() {
        return cpf;
    }
}
