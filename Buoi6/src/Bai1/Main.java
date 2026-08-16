package Bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Lê Văn Tê", "0912345678", "123 Lê Lợi, TPHCM");

        Order order = new Order("OR001", customer);
        order.addProduct(new Product("SP01", "Bàn phím cơ", 750000, 1));
        order.addProduct(new Product("SP03", "Tai nghe Bluetooth", 890000, 1));
        order.addProduct(new Product("SP02", "Chuột không dây", 350000, 2));

        order.printInvoice();
    }
}