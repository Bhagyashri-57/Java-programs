
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            int original = number;
            int reverse = 0;

            while (number > 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }

            if (original == reverse) {
                System.out.println("Palindrome number!");
            } else {
                System.out.println("Not a palindrome.");
            }
        }

        sc.close();
    }
}
