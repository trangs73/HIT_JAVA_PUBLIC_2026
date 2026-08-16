package Bai2;

public class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return price;
    }

    public void showInfo() {
        System.out.println(id + " - " + name + " - " + String.format("%,.0f", price) + "VNĐ");
    }
}
