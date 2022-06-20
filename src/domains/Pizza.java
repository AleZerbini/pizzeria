package domains;

import java.math.BigDecimal;
import java.util.Set;

public class Pizza extends Product {
    private Set<Toppings> toppings;
    private DoughType dough;

    public Pizza(String title, String id, Set<Toppings> toppings, DoughType dough) {
        super(title, id);
        this.type = ProductType.PIZZA;

        this.toppings = toppings;
        this.dough = dough;

        this.cost = dough.getCost();
        for (Toppings topping : toppings) {
            this.cost = this.cost.add(topping.getCost());
        }
        this.price = cost.multiply(new BigDecimal("1.5"));
    }
}
