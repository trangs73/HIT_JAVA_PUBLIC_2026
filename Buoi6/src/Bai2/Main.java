package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Book("B01", "Clean Code", 250000, "Martin Cỏtis", 464));
        products.add(new Book("B02", "Java cơ bản", 180000, "Nguyễn Văn X", 320));

        products.add(new Electronic("E01", "Bàn phím cơ", 890000, 12));
        products.add(new Electronic("E02", "Chuột wireless", 450000, 24));

        products.add(new Food("F01", "homework", 50000, "17 - 08 - 2026"));

        for (Product p : products) {
            System.out.println("-----------");
            p.showInfo();
        }

        double tongGoc = 0;
        double tongBan = 0;
        for (Product p : products) {
            tongBan += p.getDiscountedPrice();
            tongGoc += p.price;
        }

        System.out.printf("Tổng giá gốc: %,.0f VNĐ%n", tongGoc);
        System.out.printf("Tổng giá bán: %,.0f VNĐ%n", tongBan);
    }
}
