/*
//import domain.Customer;
import domain.Product;
import domain.TablesManager;
import repository.Admin;
import repository.Repository;
import repository.Test;
import screens.StandBy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Repository <Customer> customerRepository = new Repository<>();
//        Repository <Product> productRepository = new Repository<>();
//        CustomerRepository.populateForTest();
//        ProductRepository.populateForTest();

        Admin.populateForTest();
        Test.populate();

        TablesManager.init();

        //Waiter garcom1 = new Waiter("666", "123");
        //garcom1.takeOrder();

        //loop menu
        //input: cpf funcionario, senha
        //opçoes de acordo com o funcionario (manager garçom)



        Scanner scanner = new Scanner(System.in);
        StandBy.home(scanner);

        // comentário testegit
    }
}

*/
