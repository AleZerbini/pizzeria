package domain;

import java.math.BigDecimal;

public class Product {
    protected String title;
    protected BigDecimal cost;
    protected BigDecimal price;

    public Product(String title, BigDecimal cost, BigDecimal price) {
        this.title = title;
        this.cost = cost;
        this.price = price;
    }

    public Product(String title){
        this.title = title;
        this.cost = new BigDecimal("0");
        this.price = BigDecimal.ZERO; //same as above, just for the sake of learning
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
