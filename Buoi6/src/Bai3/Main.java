package Bai3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new NormalAccount("Nguyễn Văn A", "nguyenvana@gmail.com",
                new Address("123 Dai Dong", "Hanoi", "000001")));
        VipAccount vipThuong = new VipAccount("Nguyễn Văn B", "nguyenvanb@gmail.com",
                new Address("345 Le Loi", "Hanoi", "000001"), 880);
        accounts.add(vipThuong);
        accounts.add(new VipAccount("Nguyễn Văn C", "nguyenvanc@gmail.com",
                new Address("1 Nhon", "Hanoi", "000001"), 2000));

        double orderValue = 2000000;

        for (Account acc : accounts) {
            double discount = acc.getDiscount();
            double total = orderValue * (1 - discount);

            acc.showInfo();
            System.out.printf("Đơn hàng: %,.0f VNĐ | Giảm: %.0f%% | Phải trả: %,.0f VNĐ%n%n",
                    orderValue, discount * 100, total);
        }

        vipThuong.addPoints(300);
        double totalSauNangHang = orderValue * (1 - vipThuong.getDiscount());
        System.out.printf("Đơn hàng %,.0f VNĐ sau khi nâng hạng, phải trả: %,.0f VNĐ%n", orderValue, totalSauNangHang);
    }
}
