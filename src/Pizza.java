import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pizza extends Product{
    private List<Toppings> toppings;
    private DoughType dough;


    public Pizza(String title, List<Toppings> toppings, DoughType dough) {
        super(title);
        this.toppings = toppings;
        this.dough = dough;

        for(Toppings topping: toppings){ //calculate Pizza cost
            super.cost = super.cost.add(topping.getCost());
        }
        super.cost = super.cost.add(dough.getCost());

        super.price = cost.multiply(new BigDecimal("1.5")); //voces querem fazer uma variavel aqui?
    }

    public static Pizza mozzarellaPizza () {
        List<Toppings> toppingsMozzarella = new ArrayList<>();
        toppingsMozzarella.add(Toppings.MOZZARELLA);
        toppingsMozzarella.add(Toppings.GREEN_OLIVES);
        toppingsMozzarella.add(Toppings.TOMATO_SAUCE);
        return new Pizza("Mozzarella Pizza", toppingsMozzarella, DoughType.NEWYORK);
    }
}