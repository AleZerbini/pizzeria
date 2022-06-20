/*
package repository;

import domains.Employee;

import java.util.ArrayList;

public abstract class Admin {

    private static ArrayList<Employee> employees;


    public static Employee login(String cpf, String senha) throws Exception{
        for (Employee employee : employees){
            if (employee.getCpf().equals(cpf)){
                if (employee.getPassword().equals(senha)){
                    return employee;
                }else{
                    throw new Exception("Senha invalida, tente novamente");
                }
            }
        }
        throw new Exception("Usuario nao encontrado.");
    }
}
*/
