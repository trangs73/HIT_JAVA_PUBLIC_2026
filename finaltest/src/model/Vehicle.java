package model;

public abstract class Vehicle {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private Manufacturer manufacturer;

    public Vehicle(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public Vehicle() {
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
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public abstract double getDiscountPrice();

    public void displayInfo() {
        System.out.println("Mã sản xuất: " + id);
        System.out.println("Tên phương tiện: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Nhà sản xuất: " +manufacturer);
    }
}
