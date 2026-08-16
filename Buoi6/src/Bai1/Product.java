package Bai1;

public class Product {
    private String id;
    private String nameProduct;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.nameProduct = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String name) {
        this.nameProduct = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return price * quantity;
    }
}
