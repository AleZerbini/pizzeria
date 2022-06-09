package repository;

import dominios.Customer;
import dominios.Pizza;
import dominios.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public abstract class ProductRepository {

    private static ArrayList<Pizza> pizzas;
    private static ArrayList<Product> beverages;
    private static ArrayList<Product> desserts;

    public static void populateForTest(){
        if (Objects.isNull(beverages)){
            beverages = new ArrayList<>();
        }
        beverages.add(new Product("Cerveja", BigDecimal.valueOf(14), BigDecimal.valueOf(20)));
        beverages.add(new Product("Agua", BigDecimal.valueOf(1), BigDecimal.valueOf(4)));
        beverages.add(new Product("Suco", BigDecimal.valueOf(7), BigDecimal.valueOf(15)));
    }

    public static Product getProduct(String title){
        for (Product product : beverages){
            if(product.getTitle().equals(title)){
                return product;
            }
        }
        return null;
    }
}
