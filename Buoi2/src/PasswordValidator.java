import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        String cleanedPassword = password.trim();
        int length = cleanedPassword.length();

        boolean hasDigital = false;
        boolean hasUpper = false;

        for (int i = 0; i < length; i++){
            char c = cleanedPassword.charAt(i);
            if (c >= '1' && c <= '9') {
                hasDigital = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
        }

        if (length >= 8 && hasDigital && hasUpper) {
            System.out.println("Mật khẩu hợp lệ!");
        }
        else {
            System.out.println("Mật khẩu không hợp lệ!");

            if (length < 8) {
                System.out.printf("- Mật khẩu phải có độ dài tối thiểu là 8 ký tự (Độ dài hiện tại sau khi cắt khoảng trắng: %d). %n", length);
            }
            if (!hasDigital) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ số.");
            }
            if (!hasUpper) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }
        }
    }
}
