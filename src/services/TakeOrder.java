package services;

import domain.Customer;
import domain.Order;
import domain.Product;
import domain.Waiter;
import repository.CustomerRepository;
import repository.OrderRepository;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeOrder {
    public static void execute (Waiter waiter) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Informe a mesa que deseja fazer pedido, ou 0 para delivery:");

        //fazer tratamento de erro para outras entradas que nao sejam Integer
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
            items.add(ProductRepository.getProduct(temp));
        } while (!temp.equals("0"));

        order.setItems(items);

        OrderRepository.addOrder(order);
        System.out.println(order);
        System.out.println("Pedido criado!");

    }
}
