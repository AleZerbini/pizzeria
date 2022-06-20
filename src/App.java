import domains.Product;
import domains.TablesManager;
import repository.Test;
import screens.HomePage;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Test.populateRepository();

//        TablesManager.init();

        Scanner scanner = new Scanner(System.in);
        HomePage.init(scanner);

    }
}

