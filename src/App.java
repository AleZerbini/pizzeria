import dominios.Waiter;
import repository.Admin;
import repository.CustomerRepository;
import repository.ProductRepository;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CustomerRepository.populateForTest();
        ProductRepository.populateForTest();
        Admin.populateForTest();

        Scanner scanner = new Scanner(System.in);
        String userName = "";
        String pass = "";
        do{
            System.out.println("-------------------------");
            System.out.println("Digite seu CPF (ou 0 para sair): ");
            userName = scanner.nextLine();    //validar numero de digitos cpf
            if (userName.equals("0")){
                continue;
            }
            System.out.println("Digite sua senha: ");
            pass = scanner.nextLine();
            Waiter user = Admin.login(userName, pass);
            System.out.println("Seja bem vindo "+user.getName());

            //implementar menu
            String option = "";
            do{
                System.out.println("-------------------------");
                System.out.println("Digite 1 para fazer um pedido.");
                System.out.println("Digite 2 para consultar uma mesa.");
                System.out.println("Digite 3 para fechar uma conta.");
                System.out.println("Digite 0 para sair.");
                option = scanner.nextLine();
                switch (option){
                    case "1":
                        user.takeOrder();
                        break;
                    case "2", "3":
                        System.out.println("Em desenvolvimento...");
                        break;
                    case "0":
                        break;
                }

            }while (!option.equals("0"));


        }while (!userName.equals("0"));

    }
}
