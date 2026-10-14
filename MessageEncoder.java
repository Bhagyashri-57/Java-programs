
import java.util.Scanner;

public class MessageEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your secret message: ");
        String message = sc.nextLine();

        StringBuilder encrypted = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + 3) % 26);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + 3) % 26);
            }
            encrypted.append(ch);
        }

        System.out.println("Encrypted message: " + encrypted);
        sc.close();
    }
}
