package screens;

import dominios.Waiter;

import java.util.Scanner;

public class EmployeeScreen {

    public static void openScreen(Scanner scanner, Waiter waiter) {
        String option = "";
        do {
            System.out.println("-------------------------");
            System.out.println("Digite 1 para fazer um pedido.");
            System.out.println("Digite 2 para consultar uma mesa.");
            System.out.println("Digite 3 para fechar uma conta.");
            System.out.println("Digite 0 para sair.");
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    waiter.takeOrder();
                    break;
                case "2":
                    waiter.showTable();
                    break;
                case "3":
                    System.out.println("Em desenvolvimento...");
                    break;
                case "0":
                    break;
            }
        } while (!option.equals("0"));
    }

}