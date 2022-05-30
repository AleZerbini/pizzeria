package dominios;

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
