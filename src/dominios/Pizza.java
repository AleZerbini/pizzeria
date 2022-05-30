package dominios;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pizza extends Product{
    private String flavor;
    private DoughType dough;
    private ArrayList ingredients;

    public Pizza(String title, BigDecimal cost, BigDecimal price) {
        super(title, cost, price);
    }
}
