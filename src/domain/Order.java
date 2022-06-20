package domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private LocalDateTime placement;
    private int table;
    private ArrayList<Product> items;
    private BigDecimal total;

    //private boolean delivery;
//    private Customer customer;

    public Order(int table) {
        this.placement = LocalDateTime.now();
//        if (table == 0){
//            delivery = true;
//        }else {
//            delivery = false;
//        }
//        this.table = table;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public void setItems(ArrayList<Product> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String ret = "";
        ret = "Mesa = " + this.table + "\n";
//        ret += "Cliente = " + this.customer.getName() + "\n";
        ret += "Produtos: " + "\n";
        for (Product product : items) {
//            ret += product.getQuantity() + " ";
            ret += product.getTitle() + "\n";
        }
        ret += "___FIM DO PEDIDO___" + "\n";
        return ret;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }
}
