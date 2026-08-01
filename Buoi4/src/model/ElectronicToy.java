package model;

public class ElectronicToy extends Toy {
    private int warranty;

    public ElectronicToy(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public ElectronicToy() {
        super();
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public double calculateDiscount() {
        if (getPrice() > 500.0) {
            return getPrice() * 0.05;
        }

        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Thời gian bảo hành: " + warranty + " tháng");
        System.out.println("Số tiền được giảm giá: " + calculateDiscount());
    }
}
