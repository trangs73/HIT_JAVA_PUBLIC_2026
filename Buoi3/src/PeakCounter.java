import java.util.Scanner;

public class PeakCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            n = Integer.parseInt(sc.nextLine());
        } while (n < 3);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int step = 0;
        int pre = 0;
        int cur = 0;

        for (int x : arr) {
            if (step == 0) {
                pre = x;
                step = 1;
            }
            else if (step == 1) {
                cur = x;
                step = 2;
            }
            else {
                if (cur > pre && cur > x) count++;

                pre = cur;
                cur = x;
            }
        }
        System.out.println(count);
    }
}
