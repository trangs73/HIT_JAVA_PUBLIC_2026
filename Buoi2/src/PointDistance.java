import java.util.Scanner;

public class PointDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập x1: ");
        int x1 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập y1: ");
        int y1 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập x2: ");
        int x2 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập y2: ");
        int y2 = Integer.parseInt(sc.nextLine());

        double distanceEuclidean = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Khoảng cách giữa hai điểm A và B là: %.2f %n", distanceEuclidean);
    }
}