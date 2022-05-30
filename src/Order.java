import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private LocalDateTime placement;
    private int table;
    private ArrayList<Product> items;
    private BigDecimal total;

    private boolean delivery;
    private Customer costumer;
}
