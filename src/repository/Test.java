package repository;

import domains.*;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;

public abstract class Test {
    private static Repository repository = Repository.getInstance();

    public static void populateRepository() {
//        Set<Product> products = Set.of(
        Collections.addAll(repository.getMenu()
            , new Product("Cerveja"             , "B1", BigDecimal.valueOf(14), BigDecimal.valueOf(20), ProductType.BEVERAGE)
            , new Product("Água"                , "B2", BigDecimal.valueOf( 1), BigDecimal.valueOf( 4), ProductType.BEVERAGE)
            , new Product("Suco"                , "B3", BigDecimal.valueOf( 3), BigDecimal.valueOf( 9), ProductType.BEVERAGE)
            , new Product("Pudim"               , "S1", BigDecimal.valueOf( 7), BigDecimal.valueOf(15), ProductType.DESSERT)
            , new Product("Sorvete"             , "S2", BigDecimal.valueOf( 5), BigDecimal.valueOf(13), ProductType.DESSERT)
            , new Product("Torta de Chocolate"  , "S3", BigDecimal.valueOf( 6), BigDecimal.valueOf(18), ProductType.DESSERT)

            , new Pizza("Muçarela"  , "P1"
                , Set.of(
                      Toppings.MOZZARELLA
                    , Toppings.GREEN_OLIVES
                    , Toppings.TOMATO_SAUCE
                )
                , DoughType.NEWYORK
            )
            , new Pizza("Pepperoni" , "P2"
                , Set.of(
                      Toppings.MOZZARELLA
                    , Toppings.PEPPERONI
                    , Toppings.TOMATO_SAUCE
                )
                , DoughType.NEAPOLITAN)
            , new Pizza("Portuguesa", "P3"
                , Set.of(
                      Toppings.HAM
                    , Toppings.MOZZARELLA
                    , Toppings.TOMATO_SAUCE
                    , Toppings.GREEN_OLIVES
                )
                , DoughType.SICILIAN
            )
        );

        Collections.addAll(repository.getEmployees()
            , new Employee("Jorge", "Silva", "12345678901", new Account("jorgeS", "123"))
            , new Employee("Maria", "Alberdines", "12345678911", new Account("MariaAlber", "123"))
            , new Employee("Pedro", "Gonzalez", "12345678912", new Account("pedrinho", "123"))
        );

    }

/*
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        populateRepository();
        repository.getMenu().forEach( e -> System.out.println(e.getTitle()) );
        System.out.println();
        repository.getEmployees().forEach( e -> System.out.println(e.getName()) );

        Product result = repository.find("menu", "title", "Portuguesa");
    }
*/
}
