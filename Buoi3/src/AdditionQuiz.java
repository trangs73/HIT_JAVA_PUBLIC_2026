import java.util.Scanner;
import java.util.Random;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(201);

        System.out.println(a + " + " + b + " = " + c);

        String userAnswer = sc.nextLine().trim();

        if ((a + b == c && userAnswer.equalsIgnoreCase("phép tính đúng"))
                || (a + b != c && userAnswer.equalsIgnoreCase("phép tính sai"))) {
            System.out.println("Bạn đã trả lời đúng");
        }
        else {
            System.out.println("Bạn đã trả lời sai");
        }
    }
}
