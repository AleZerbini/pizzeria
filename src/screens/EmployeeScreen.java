package screens;

import domains.Employee;
import services.ShowTable;
import services.TakeOrder_old;

import java.util.Scanner;

public class EmployeeScreen {

    public static void init(Scanner scanner, Employee employee) {
        String option = "";
        do {
            System.out.println("----------------------------------");
            System.out.println("Digite 1 para fazer um pedido.");
            System.out.println("Digite 2 para consultar uma mesa.");
            System.out.println("Digite 3 para fechar uma conta.");
            System.out.println("Digite 0 para sair.");
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    TakeOrder_old.execute(employee);
                    break;
                case "2":
                    ShowTable.execute(employee);
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
