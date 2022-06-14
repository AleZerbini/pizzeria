package repository;

import domain.Order;

import java.util.ArrayList;
import java.util.Objects;

public abstract class OrderRepository {
    private static ArrayList<Order> orders;
    public OrderRepository() {
    }

    public static void addOrder(Order order){
        if(Objects.isNull(orders)){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }

    public static ArrayList<Order> getOrdersByTable(Integer table){
        ArrayList<Order> filteredOrders = new ArrayList<>();
        for (Order order:orders){
            if(order.getTable() == table){
                filteredOrders.add(order);
            }
        }
        if (filteredOrders.isEmpty()){
            return  null;
        }
        return filteredOrders;
    }
}
