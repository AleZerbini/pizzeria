package services;
/*
import domain.Order;
import domain.Product;
import domain.TablesManager;
import domain.Waiter;
import repository.OrderRepository;
import repository.ProductRepository;
import repository.Repository;

import java.util.*;

public class TakeOrder {
    public static void execute(Waiter waiter) {
        Scanner scanner = new Scanner(System.in);

        Integer mesa = 0;
        do {
            System.out.println("Informe a mesa que deseja fazer pedido");
            mesa = Integer.parseInt(scanner.nextLine());
        } while (mesa < 1 || mesa > TablesManager.getTablesLimit());

        if (Objects.isNull(TablesManager.tableStatus.get(mesa))) {
            TablesManager.tableStatus.put(mesa, new HashMap<>());
        }

        Order order = new Order(mesa);

        String temp = "";
        do {
            System.out.println("Informe o produto a acrescentar no pedido, ou 0 para finalizar:");
            //showMenu.print(); //print whole menu with ID
            // * verificar se input corresponde ao indice existente
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                continue;
            }

            Map<String, Integer> order = TablesManager.tableOrders(mesa);
            //Repository.getInstance().menu.equals()
            //String productName = ;
            //criar funcao pra pegar nome de produto a partir do identificador


            /* System.out.printf("Informe a quantidade de %s: ", productName;
            Integer productQty = scanner.nextInt());

            if (order.containsValue(productName)) {
                int newQty = order.get(productName) + productQty;
                order.put(productName, newQty);
            } else {
                order.put(productName, productQty);
            }

        } while (!temp.equals("0"));

        order.setItems(items);

        OrderRepository.addOrder(order);
        System.out.println(order);
        System.out.println("Pedido criado!");

        scanner.close();

    }
}
*/