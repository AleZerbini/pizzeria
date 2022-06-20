
package services;

import domains.Employee;
import domains.Order;
import domains.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeOrder_old {
    public static void execute (Employee waiter) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Informe a mesa que deseja fazer pedido, ou 0 para delivery:");


        System.out.println("Informe a mesa que deseja fazer pedido");
        Integer mesa = Integer.parseInt(scanner.nextLine());


        Order order = new Order(mesa);

//        System.out.println("Informe o CPF do cliente:");
//        String cpf = scanner.nextLine();
//        Customer customer = CustomerRepository.getCustomer(cpf);
//        order.setCustomer(customer);

        ArrayList<Product> items = new ArrayList<>();
        String temp = "";
        do {
            System.out.println("Informe o produto a acrescentar no pedido, ou 0 para finalizar:");
            // print menu with indexes to simplify input
            // verificar se input corresponde a indice existente
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                continue;
            }
//            Product productOrdered = new Product();
//            productOrdered = ProductRepository.getProduct(temp);
//            items.add(productOrdered);
//            System.out.printf("Informe a quantidade de %s: ", productOrdered.getTitle());
//            productOrdered.setQuantity(scanner.nextInt());

        } while (!temp.equals("0"));

        order.setItems(items);

        OrderRepository.addOrder(order);
        System.out.println(order);
        System.out.println("Pedido criado!");

        scanner.close();

    }
}

