import domain.Customer;
import domain.Product;
import repository.Admin;
import repository.CustomerRepository;
import repository.ProductRepository;
import repository.Repository;
import screens.StandBy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Repository <Customer> customerRepository = new Repository<>();
//        Repository <Product> productRepository = new Repository<>();



        CustomerRepository.populateForTest();
        ProductRepository.populateForTest();
        Admin.populateForTest();

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

