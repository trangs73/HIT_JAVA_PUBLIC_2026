import java.util.Scanner;

public class ScoreManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(sc.nextLine());

        double[] scores = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
            scores[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Điểm cao nhất: " + findMax(scores));
        System.out.printf("Điểm trung bình lớp: %.2f %n", calculateAverage(scores));
        System.out.println("Số học sinh có điểm dưới trung bình (< 5.0): "  + countFailedStudents(scores));
    }

    public static double findMax(double[] arr) {
        double max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    public static int countFailedStudents(double[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5.0) count++;
        }

        return count;
    }
}
