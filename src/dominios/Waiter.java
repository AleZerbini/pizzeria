package dominios;

import repository.CustomerRepository;
import repository.OrderRepository;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Waiter extends Person implements Employee{
    private String password;

    public Waiter(String cpf, String password, String name) {
        this.password = password;
        super.cpf = cpf;
        super.name = name;
    }

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a mesa que deseja fazer pedido, ou 0 para delivery:");
        Integer mesa = Integer.parseInt(scanner.nextLine());
        Order order = new Order(mesa);

        System.out.println("Informe o CPF do cliente:");
        String cpf = scanner.nextLine();
        Customer customer = CustomerRepository.getCustomer(cpf);
        order.setCustomer(customer);

        ArrayList<Product> items = new ArrayList<>();
        String temp = "";
        do{
            System.out.println("Informe o produto a acrescentar no pedido, ou 0 para finalizar:");
            temp = scanner.nextLine();
            if (temp.equals("0")){
                continue;
            }
            items.add(ProductRepository.getProduct(temp));
        }while (!temp.equals("0"));

        order.setItems(items);

        OrderRepository.addOrder(order);
        System.out.println(order);
        System.out.println("Pedido criado!");

    }

    public void showTable(){
        Scanner scanner = new Scanner(System.in);
        Integer table = null;
        do{
            System.out.println("Informe o numero da mesa que deseja consultar");
            try{
                table = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.err.println("Numero de mesa invalido!");
            }
        }while (table == null);
        ArrayList<Order> orders = OrderRepository.getOrdersByTable(table);
        if (orders != null) {
            System.out.println("Mesa "+table+"\n"+"Itens:");
            for (Order order: orders){
                for(Product product : order.getItems()){
                    System.out.println(product.getTitle());
                }
            }
        }else {
            System.out.println("Sem pedidos para essa mesa");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
