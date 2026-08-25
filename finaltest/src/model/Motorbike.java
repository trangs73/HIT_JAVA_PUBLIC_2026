package model;

public class Motorbike extends Vehicle {

    public Motorbike(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        super(id, name, price, quantity, manufacturer);
    }

    public Motorbike(String number, String s, String string) {
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() * 0.9;
    }
}
