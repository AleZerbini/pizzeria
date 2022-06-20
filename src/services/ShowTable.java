package services;
/*
import domain.Order;
import domain.Product;
import domain.Waiter;
import repository.OrderRepository;
import repository.Repository;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowTable {
    public static void execute (Waiter waiter) {
        Scanner scanner = new Scanner(System.in);
        Integer table = null;
        do {
            System.out.println("Informe o numero da mesa que deseja consultar");
            try {
                table = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Numero de mesa invalido!");
            }
        } while (table == null);

        ArrayList<Order> orders = Repository.getInstance().getOrders().getOrdersByTable(table);
        if (orders != null) {
            System.out.println("Mesa " + table + "\n" + "Itens:");
            for (Order order : orders) {
                for (Product product : order.getItems()) {
                    System.out.println(product.getTitle());
                }
            }
        } else {
            System.out.println("Sem pedidos para essa mesa");
        }

    }
}
*/