import dominios.Waiter;
import repository.Admin;
import repository.CustomerRepository;
import repository.ProductRepository;
import screens.StandBy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CustomerRepository.populateForTest();
        ProductRepository.populateForTest();
        Admin.populateForTest();

        Scanner scanner = new Scanner(System.in);
        StandBy.home(scanner);
    }
}
