package model;

public class Bicycle extends Vehicle {

    public Bicycle(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        super(id, name, price, quantity, manufacturer);
    }

    public Bicycle() {
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() * 0.85;
    }
}
