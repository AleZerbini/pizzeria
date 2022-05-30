import dominios.Waiter;
import repository.CustomerRepository;
import repository.ProductRepository;

public class App {
    public static void main(String[] args) {
        CustomerRepository.populateForTest();
        ProductRepository.populateForTest();
        Waiter garcom1 = new Waiter();

        garcom1.takeOrder();
    }
}
