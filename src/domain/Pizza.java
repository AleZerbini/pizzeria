package domain;

import java.math.BigDecimal;

public class Pizza extends Product {
    private Toppings[] toppings;
    private DoughType dough;

    public Pizza(String title, String id, Toppings[] toppings, DoughType dough) {
        super(title, id);

        this.toppings = toppings;
        this.dough = dough;

        super.cost = dough.getCost();

        for (Toppings topping : toppings) { //calculate Pizza cost
            super.cost = super.cost.add(topping.getCost());
        }
        super.price = cost.multiply(new BigDecimal("1.5")); //voces querem fazer uma variavel aqui?

    }

    public Pizza(String title, String id, BigDecimal cost, BigDecimal price) {
        super(title, id, cost, price);
    }
}
