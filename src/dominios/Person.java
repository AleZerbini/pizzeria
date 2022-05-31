package dominios;

public abstract class Person {
    protected String name;
    protected String surname;
    protected String cpf;

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
