package screens;

import dominios.Waiter;
import repository.Admin;

import java.util.Scanner;

public class StandBy {

    public static void home(Scanner scanner){
        String userName = "";
        String pass = "";

        while (!userName.equals("0")){
            System.out.println("-------------------------");
            System.out.println("Digite seu CPF (ou 0 para sair): ");
            userName = scanner.nextLine();

            if (userName.equals("0"))break;


            System.out.println("Digite sua senha: ");
            pass = scanner.nextLine();

            Waiter user = null;

            try{
                user = Admin.login(userName, pass);
                System.out.println("Seja bem vindo "+user.getName());

            }catch(Exception e){
                System.err.println("Erro ao fazer login");
                System.err.println(e.getMessage());
            }
            if (user != null) {
                EmployeeScreen.openScreen(scanner, user);
            }
        }
    }
}
