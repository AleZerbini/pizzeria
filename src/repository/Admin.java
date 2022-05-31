package repository;

import dominios.Customer;
import dominios.Waiter;
import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.Objects;

public class Admin {

    private static ArrayList<Waiter> employees;

    public static void populateForTest(){
        if (Objects.isNull(employees)){
            employees = new ArrayList<>();
        }
        employees.add(new Waiter("666", "678", "Jorge"));
        employees.add(new Waiter("333", "345", "Maria"));
        employees.add(new Waiter("111", "123", "Pedro"));
    }

    public static Waiter login(String cpf, String senha) {
        for (Waiter employee : employees){
            if (employee.getCpf().equals(cpf)){
                if (employee.getPassword().equals(senha)){
                    return employee;
                }
            }
        }
        return null;
    }
}
