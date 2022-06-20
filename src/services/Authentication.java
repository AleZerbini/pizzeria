package services;

import domains.Account;
import domains.Employee;
import repository.Repository;

public class Authentication {
    public static Employee execute(String username, String password) {
        for (Employee employee : Repository.getInstance().getEmployees()) {
            Account account = employee.getAccount();
            if (account.getUsername().equals(username)) {
                if (account.validate(username, password)) {
                    return employee;
                };
                System.out.println("Senha incorreta.");
                return null;
            };
        }
        System.out.println("Nome de usuário inexistente.");
        return null;
    }
}
