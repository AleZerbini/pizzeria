package repository;

import dominios.Customer;

import java.util.ArrayList;
import java.util.Objects;

public class CustomerRepository {
    private static ArrayList<Customer> customers;
    public CustomerRepository() {
    }

    public static void populateForTest(){
        if (Objects.isNull(customers)){
            customers = new ArrayList<>();
        }
        customers.add(new Customer("Eder","12345678900", "41987456123"));
        customers.add(new Customer("Joao","12345678910", "41987452536"));
        customers.add(new Customer("Paulo","12345678920", "41987414578"));
        customers.add(new Customer("Pedro","12345678930", "41987412345"));
        customers.add(new Customer("Abdenego","12345678940", "41987258923"));
    }

    public static Customer getCustomer(String cpf){
        for (Customer customer : customers){
            if(customer.getCpf().equals(cpf)){
                return customer;
            }
        }
        return null;
    }



}
