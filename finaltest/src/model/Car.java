package model;

public class Car extends Vehicle {
    private boolean luxury;

    public Car(String id, String name, double price, int quantity, Manufacturer manufacturer, boolean luxury) {
        super(id, name, price, quantity, manufacturer);
        this.luxury = luxury;
    }

    public Car() {
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    @Override
    public double getDiscountPrice() {
        return getPrice();
    }

    public void logLuxury() {
        if (luxury) {
            System.out.println("Tên nhà sản xuất: " + getManufacturer());
        }
        else return;
    }
}
