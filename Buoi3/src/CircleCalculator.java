import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;

        double r;
        do {
            r = sc.nextDouble();
        } while (r <= 0 || r >= 1000);

        double c = 2 * PI * r;
        double s = r * r * PI;

        System.out.printf("%.3f %.3f", c, s);
    }
}