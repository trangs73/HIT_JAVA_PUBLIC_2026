import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String cleanedStr = str.trim();

        String reverse = "";
        for (int i = cleanedStr.length() - 1; i >= 0; i--) {
            reverse += cleanedStr.charAt(i);
        }

        if (cleanedStr.equals(reverse)) {
            System.out.println(str.toUpperCase() + " chuỗi này đối xứng");
        }
        else {
            System.out.println(str.toLowerCase() + " chuỗi này không đối xứng");
        }
    }
}
