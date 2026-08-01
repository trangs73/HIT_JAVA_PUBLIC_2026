package model;

public class PlushToy extends Toy {
    private String material;

    public PlushToy(String id, String name, double price, int quantity, String material) {
        super(id, name, price, quantity);
        this.material = material;
    }

    public PlushToy() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Chất liệu: " + material);
        System.out.println("Số tiền được giảm giá: " + calculateDiscount());
    }
}
