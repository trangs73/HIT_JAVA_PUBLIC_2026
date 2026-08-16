package Bai3;

public class VipAccount extends Account {
    private int points;

    public VipAccount(String username, String email, Address address, int points) {
        super(username, email, address);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int point) {
        boolean truoc = points < 1000;
        points += point;
        boolean sau = points >= 1000;
        System.out.println("Cộng " + point + " điểm cho " + username);
        if (truoc && sau) {
            System.out.println("Chúc mừng " + username + " đã được nâng hạng");
        }
    }

    @Override
    public double getDiscount() {
        if (points >= 1000) {
            return 0.15;
        }
        else {
            return 0.1;
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Points: " + points);
        System.out.println("Discount: " + (getDiscount() * 100) + "%");
    }
}
