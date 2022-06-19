package repository;

import domain.Product;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class Test {

    public static void populate(){
//        Stream.of("AK", "AL", "..").collect(Collectors.toSet());
        Product[] products = {
              new Product("Cerveja", BigDecimal.valueOf(14), BigDecimal.valueOf(20))
            , new Product("Água"   , BigDecimal.valueOf( 1), BigDecimal.valueOf( 4))
            , new Product("Suco"   , BigDecimal.valueOf( 7), BigDecimal.valueOf(15))
        };

        Collections.addAll(Repository.getInstance().menu, products);
    }
}
