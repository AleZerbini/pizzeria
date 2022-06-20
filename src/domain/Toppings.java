package domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public enum Toppings {
    MOZZARELLA(new BigDecimal("1.5"), new BigDecimal("200")),
    PEPPERONI(new BigDecimal("3"), new BigDecimal("300")),
    HAM(new BigDecimal("2.2"), new BigDecimal("300")),
    GREEN_OLIVES (new BigDecimal("1"), new BigDecimal("100")),
    TOMATO_SAUCE (new BigDecimal("0.5"), new BigDecimal("150"));

    private BigDecimal cost; //ingredient cost in BRL
    private BigDecimal weight; //ingredient weight in grams

   Toppings(BigDecimal cost, BigDecimal weight){
        this.cost = cost;
        this.weight = weight;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public BigDecimal getWeight() {
        return weight;
    }

//    deletar
//    public static Pizza mucarela () {
//        List<Toppings> toppingsMozzarella = new ArrayList<>();
//        toppingsMozzarella.add(Toppings.MOZZARELLA);
//        toppingsMozzarella.add(Toppings.GREEN_OLIVES);
//        toppingsMozzarella.add(Toppings.TOMATO_SAUCE);
//        return new Pizza("Pizza de Muçarela", toppingsMozzarella, DoughType.NEWYORK);
//    }
}

