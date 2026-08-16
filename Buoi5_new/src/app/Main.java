package app;

import java.io.PrintStream;
import java.util.ArrayList;
import model.Customer;
import model.Smartphone;
import model.Store;

public class Main {
    public static void main(String[] args) {
        System.out.println("======BÀI1======");
        Smartphone sp1 = new Smartphone("iPhone17", (double)2.5E7F, 7);
        Smartphone sp2 = new Smartphone("iPhone16", (double)2.3E7F, 15);
        Smartphone sp3 = new Smartphone("iPhone15", (double)2.0E7F, 10);
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);
        PrintStream var10000 = System.out;
        int var10001 = Smartphone.getTotalPhones();
        var10000.println("Tổng số điện thoại: " + var10001);
        System.out.println("======BÀI2======");
        Customer customer = new Customer("Nguyễn Văn A");
        customer.addPhone(sp1);
        customer.addPhone(sp2);
        var10000 = System.out;
        var10001 = customer.getCart().size();
        var10000.println("Số sản phẩm ban đầu: " + var10001);
        ArrayList<Smartphone> cart = customer.getCart();
        cart.clear();
        var10000 = System.out;
        var10001 = customer.getCart().size();
        var10000.println("Số sản phẩm sau khi clear: " + var10001);
        System.out.println("======BÀI3======");
        Store store = new Store();
        Smartphone p1 = new Smartphone("iPhone 15", (double)2.0E7F, 10);
        Smartphone p2 = new Smartphone("iPhone 15 Pro Max", (double)3.5E7F, 3);
        Smartphone p3 = new Smartphone("Samsung Galaxy S24", (double)1.8E7F, 7);
        Smartphone p4 = new Smartphone("Xiaomi 14", (double)1.2E7F, 15);
        Smartphone p5 = new Smartphone("Oppo Find X7", (double)1.6E7F, 6);
        store.addPhoneToStore(p1);
        store.addPhoneToStore(p2);
        store.addPhoneToStore(p3);
        store.addPhoneToStore(p4);
        store.addPhoneToStore(p5);
        Smartphone found = store.search(p1.getId());
        var10000 = System.out;
        String var35 = p1.getId();
        var10000.println("Tìm id " + var35 + ": " + String.valueOf(found != null ? found : "không tìm thấy"));
        ArrayList<Smartphone> priceRange = store.search((double)1.7E7F, (double)2.7E7F);
        System.out.println("Điện thoại có mức giá khoảng 17tr - 27tr: ");

        for(Smartphone sp : priceRange) {
            System.out.println(String.valueOf(sp) + " ");
        }

        ArrayList<Smartphone> byName = store.search("iPhone", true);
        System.out.println("Các loại iPhone: ");

        for(Smartphone sp : byName) {
            System.out.println(String.valueOf(sp) + " ");
        }

        System.out.println("======BÀI4======");
        Store store1 = new Store();
        Customer customer1 = new Customer("Nguyễn Văn Mười");
        Smartphone iphone15 = new Smartphone("iPhone15", (double)2.0E7F, 1);
        store1.addPhoneToStore(iphone15);
        System.out.println("Trước khi bán: " + String.valueOf(iphone15));
        store1.sellPhone(customer1, iphone15.getId());
        Smartphone trongKho = store1.search(iphone15.getId());
        trongKho.setPrice((double)2.5E7F);
        System.out.println("Sau khi tăng giá: " + String.valueOf(trongKho));
        ArrayList<Smartphone> gioKhachB = customer1.getCart();
        var10000 = System.out;
        var35 = customer1.getCustomerName();
        var10000.println("Giá iPhone 15 trong giỏ hàng của " + var35 + ": " + String.format("%,.0f", ((Smartphone)gioKhachB.get(0)).getPrice()) + " VNĐ");
        System.out.println("======BÀI5======");
        Store store2 = new Store();
        Customer customer2 = new Customer("Lê Văn T");
        Smartphone p10 = new Smartphone("Samsung Galaxy S24", (double)1.8E7F, 7);
        Smartphone p11 = new Smartphone("Xiaomi 14", (double)1.2E7F, 15);
        Smartphone p12 = new Smartphone("Oppo Find X7", (double)1.6E7F, 6);
        store2.addPhoneToStore(p10);
        store2.addPhoneToStore(p11);
        store2.addPhoneToStore(p12);
        store2.sellPhone(customer2, p10.getId());
        store2.sellPhone(customer2, p11.getId());
        store2.sellPhone(customer2, p12.getId());
        System.out.printf("Tổng số tiền khách hàng phải trả: %,.0f VNĐ %n", customer2.calculateTotalBill());
        System.out.printf("Tổng giá trị của kho hàng: %,.0f VNĐ %n", store2.calculateInventoryValue());
        System.out.println("Sau khi giảm thuế VAT");
        Smartphone.setVatTax(0.08);
        System.out.printf("Tổng số tiền khách hàng phải trả: %,.0f VNĐ %n", customer2.calculateTotalBill());
        System.out.printf("Tổng giá trị của kho hàng: %,.0f VNĐ %n", store2.calculateInventoryValue());
    }
}
