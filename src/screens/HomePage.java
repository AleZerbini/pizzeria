package screens;


import domains.Account;
import domains.Employee;
import services.Authentication;

import java.util.Scanner;

public class HomePage {

    public static void init(Scanner scanner){
        String username;
        String password;

        Account account = null;

        while (account == null){
            System.out.println("-------------------------------------------");
            System.out.println("Digite seu nome de usuário (ou 0 para sair): ");
            username = scanner.nextLine();

            if (username.equals("0")) break;

            System.out.println("Digite sua senha: ");
            password = scanner.nextLine();

            try{
                Employee employee = Authentication.execute(username, password);
                account = employee.getAccount();
                System.out.printf("Seja bem vindo, %s! %n", employee.getName());
                EmployeeScreen.init(scanner, employee);
            } catch(Exception e){
                System.err.println(e.getMessage());
                System.err.println("Erro ao fazer login. Tente novamente.");
            }
        }
    }
}
