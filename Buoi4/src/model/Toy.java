package model;

public class Toy {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Toy(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public Toy() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Giá bán không hợp lệ!");
            return;
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Số lượng không hợp lệ!");
            return;
        }
        this.quantity = quantity;
    }

    public double calculateDiscount() {
        return 0;
    }

    public void printInfo() {
        System.out.println("Mã: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giá: " + price);
        System.out.println("Số lượng: " + quantity);
    }
}
