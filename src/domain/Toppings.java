package domain;

import java.math.BigDecimal;

public enum Toppings {
    MOZZARELLA(new BigDecimal("1.5"), new BigDecimal("200")),
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
}

