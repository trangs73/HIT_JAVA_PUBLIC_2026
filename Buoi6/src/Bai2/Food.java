package Bai2;

public class Food extends Product {
    private String expiryDate;

    public Food(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public double getDiscountedPrice() {
        return price;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ngày hết hạn: " +expiryDate);
        System.out.printf("Giá: %,.0f VNĐ%n", getDiscountedPrice());
    }
}
