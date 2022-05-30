import java.math.BigDecimal;

public class Product {
    protected String title;
    protected BigDecimal cost;
    protected BigDecimal price;

    public Product(String title) {
        this.title = title;
        this.cost = new BigDecimal("0");
        this.price = BigDecimal.ZERO; //the same as above, just for the sake of learning
    }
}
