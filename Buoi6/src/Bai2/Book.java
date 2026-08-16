package Bai2;

public class Book extends Product {
    private String author;
    private int pages;

    public Book(String id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public double getDiscountedPrice() {
        return price * 0.9;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Tác giả: " + author);
        System.out.println("Số trang: " + pages);
        System.out.printf("Giá sau khi giảm: %,.0f VNĐ%n", getDiscountedPrice());
    }
}
