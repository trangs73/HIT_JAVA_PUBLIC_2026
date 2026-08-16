package Bai3;

public class NormalAccount extends Account {

    public NormalAccount(String username, String email, Address address) {
        super(username, email, address);
    }

    @Override
    public double getDiscount() {
        return 0.05;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Discount: " + (getDiscount() * 100) + "%");
    }
}
