package domains;

import java.math.BigDecimal;

public class Product {
    public String title;
    public String id;
    protected BigDecimal cost;
    protected BigDecimal price;
    protected ProductType type;

//    public Product(String title, BigDecimal cost, BigDecimal price) {
//        this.title = title;
//        this.cost = cost;
//        this.price = price;
//    }

    public Product(String title, String id){
        this.title = title;
        this.id = id;
        this.cost = BigDecimal.ZERO;
        this.price = BigDecimal.ZERO;
        this.type = ProductType.OTHER;
    }

    public Product(String title, String id, BigDecimal cost, BigDecimal price, ProductType type) {
        this.title = title;
        this.id = id;
        this.cost = cost;
        this.price = price;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id != null ? id.equals(product.id) : product.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
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

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
