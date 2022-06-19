package repository;

import domain.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repository {
    Set<Product> menu;
    Set<Person> employees;
    List<Order> orders;

//    Set<Customer> customers;

    private static Repository repository;

    private Repository() {}

    public static synchronized Repository getInstance() {
        if (repository == null)
            repository = new Repository();
        return repository;
    }
}








