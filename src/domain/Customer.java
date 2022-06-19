package domain;

public class Customer extends Person { //ignorar tambem
    private Address address;
    private String cellphone;

    public Customer(String name, String cpf, String cellphone) {
        //this.address = address;
        this.cellphone = cellphone;
        super.name = name;
        super.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public String getCellphone() {
        return cellphone;
    }
}
