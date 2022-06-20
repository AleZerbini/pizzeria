package repository;

import domain.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repository {
    private Set<Product> menu;
    private Set<Person> employees;
    private List<Order> orders;

//    Set<Customer> customers;

    private static Repository repository;

    private Repository() {}

    public static synchronized Repository getInstance() {
        if (repository == null)
            repository = new Repository();
        return repository;
    }

    public Set<Product> getMenu() {
        return menu;
    }

    public Set<Person> getEmployees() {
        return employees;
    }

    public List<Order> getOrders() {
        return orders;
    }
}








