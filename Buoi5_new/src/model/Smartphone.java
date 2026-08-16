package model;

public class Smartphone {
    private static int totalPhones = 0;
    private String id;
    private String name;
    private double price;
    private int stock;
    private static double vatTax = 0.1;

    public Smartphone(String name, double price, int stock) {
        this.name = name;
        this.setPrice(price);
        this.setStock(stock);
        ++totalPhones;
        this.id = "SP" + totalPhones;
    }

    public String getId() {
        return this.id;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("ERROR!");
            this.stock = 0;
        }

        this.stock = stock;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < (double)0.0F) {
            System.out.println("ERROR!");
            this.price = (double)0.0F;
        }

        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotalPhones() {
        return totalPhones;
    }

    public static void setVatTax(double tax) {
        vatTax = tax;
    }

    public static double getVatTax() {
        return vatTax;
    }

    public double getFinalPrice() {
        return this.price + this.price * vatTax;
    }

    public String toString() {
        String var10000 = this.id;
        return "[" + var10000 + "] " + this.name + " - Giá gốc: " + String.format("%,.0f", this.price) + " VNĐ - Tồn kho: " + this.stock;
    }
}
