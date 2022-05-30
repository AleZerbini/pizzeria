package repository;

import dominios.Order;

import java.util.ArrayList;
import java.util.Objects;

public class OrderRepository {
    private static ArrayList<Order> orders;
    public OrderRepository() {
    }

    public static void addOrder(Order order){
        if(Objects.isNull(orders)){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }
}
