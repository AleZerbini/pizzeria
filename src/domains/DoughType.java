package domains;

import java.math.BigDecimal;

public enum DoughType {
    NEAPOLITAN (new BigDecimal("2.50"), new BigDecimal("500")),
    NEWYORK (new BigDecimal("4.50"), new BigDecimal("600")),
    SICILIAN (new BigDecimal("7"), new BigDecimal("1000"));

    private BigDecimal cost;  //ingredient cost in BRL
    private BigDecimal weight;//ingredient weight in grams

    DoughType(BigDecimal cost, BigDecimal weight) {
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

