package repository;

import domain.DoughType;
import domain.Pizza;
import domain.Product;
import domain.Toppings;

import java.math.BigDecimal;
import java.util.*;

public abstract class Test {

    public static void populate() {
//        Stream.of("AK", "AL", "..").collect(Collectors.toSet());
        Product[] products = {
                new Product("Cerveja", "B1", BigDecimal.valueOf(14), BigDecimal.valueOf(20))
                , new Product("Água", "B2", BigDecimal.valueOf(1), BigDecimal.valueOf(4))
                , new Product("Suco", "B3", BigDecimal.valueOf(7), BigDecimal.valueOf(15))
                , new Product("Pudim", "S1", BigDecimal.valueOf(7), BigDecimal.valueOf(15))
                , new Product("Sorvete", "S2", BigDecimal.valueOf(7), BigDecimal.valueOf(15))
                , new Product("Torta", "S3", BigDecimal.valueOf(7), BigDecimal.valueOf(15))
        };

        Toppings[] mucarela = {Toppings.MOZZARELLA, Toppings.GREEN_OLIVES, Toppings.TOMATO_SAUCE};

        Product[] pizzas = {
                  new Pizza( "Muçarela", "P1", new Toppings[] {Toppings.MOZZARELLA, Toppings.GREEN_OLIVES, Toppings.TOMATO_SAUCE}, DoughType.NEWYORK)
                , new Pizza("Pepperoni", "P2", new Toppings[] {Toppings.MOZZARELLA, Toppings.PEPPERONI, Toppings.TOMATO_SAUCE}, DoughType.NEAPOLITAN)
                , new Pizza("Portuguesa", "P3", new Toppings[] {Toppings.HAM, Toppings.MOZZARELLA, Toppings.TOMATO_SAUCE, Toppings.GREEN_OLIVES}, DoughType.SICILIAN)
        };


        Collections.addAll(Repository.getInstance().getMenu(), pizzas);
        Collections.addAll(Repository.getInstance().getMenu(), products);
    }
}
