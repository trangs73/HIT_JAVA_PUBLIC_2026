import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập cạnh b: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập cạnh c: ");
        int c = Integer.parseInt(sc.nextLine());

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            }
            else if (a == b || b == c || c == a) {
                System.out.println("Đây là tam giác cân.");
            }
            else System.out.println("Đây là tam giác thường.");

            int chuVi = a + b + c;
            double p = chuVi / 2.0;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi: " + chuVi);
            System.out.printf("Diện tích: %.2f %n", dienTich);
        }

        else {
            System.out.println("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ.");
        }
    }
}
