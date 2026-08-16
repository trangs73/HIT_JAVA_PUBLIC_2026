package Bai1;

import java.util.ArrayList;

public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> items;

    public Order(String orderId, Customer customer) {
        this.items = new ArrayList<>();
        this.orderId = orderId;
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getItems() {
        return new ArrayList<>(items);
    }

    public void addProduct(Product p) {
        items.add(p);
    }

    public double getTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.getSubtotal();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Thông tin khách hàng: " + customer.getName() + " - " +
                            customer.getPhone() + " - " + customer.getAddress());
        System.out.println("Sản phẩm: ");
        for (Product p : items) {
            System.out.println("- " + p.getNameProduct() + ": " + String.format("%,.0f", p.getPrice()) + "VNĐ, " + p.getQuantity());
        }
        System.out.printf("Tổng số tiền khách hàng phải trả: %,.0f VNĐ%n", getTotal());
    }
}
