package Bai2;

public class Electronic extends Product {
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscountedPrice() {
        return price * 1.05;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thời gian bảo hành: " + warrantyMonths + " tháng");
        System.out.printf("Giá + phụ phí: %,.0f VNĐ%n", getDiscountedPrice());
    }
}
