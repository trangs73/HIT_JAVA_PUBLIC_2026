import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> cart = new ArrayList<>();

        cart.add(new Ebook("eBook", 100000, "PDF"));
        cart.add(new Book("Book", 75000, "Nguyễn Văn Tê", 0.3));
        cart.add(new Electronic("Electronic", 500000, 12, 0.5));

        for (Product p : cart) {
            p.showInfo();
            System.out.println("--------");
        }
    }
}