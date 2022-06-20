package repository;

import domains.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

public class Repository {
    private Set<Product> menu;
    private Set<Employee> employees;
    private List<Order> orders;

    // Singleton sctructure
    private static Repository repository;
    private Repository() {
        this.menu = new HashSet<>();
        this.employees = new HashSet<>();
        this.orders = new ArrayList<>();
    }
    public static synchronized Repository getInstance() {
        if (repository == null)
            repository = new Repository();
        return repository;
    }

/*
    public <T> T find(String repositoryFieldName, String attributeFieldName, String text)
            throws NoSuchFieldException, IllegalAccessException {
        Collection repositoryAttribute =
                (Collection) Repository.class.getDeclaredField(repositoryFieldName).get(repository);
        for (Object element : repositoryAttribute) {
            Class elementClass = element.getClass();
            if (elementClass.classisMemberClass()) {
                elementClass = elementClass.getSuperclass();
            }
            if (elementClass.getDeclaredField(attributeFieldName).get(element) == text) {
                return (T) element;
            }
        }
        return null;
    }
*/

    // Getters
    Set<Product> getMenu() { return menu; }
    Set<Employee> getEmployees() { return employees; }
    List<Order> getOrders() { return orders; }

    // Setters
    void setMenu(Set<Product> menu) { this.menu = menu; }
    void setEmployees(Set<Employee> employees) { this.employees = employees; }
    void setOrders(List<Order> orders) { this.orders = orders; }
}








