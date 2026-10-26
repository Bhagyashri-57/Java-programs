
import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String correctPin = "2468";
        boolean success = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter demo PIN: ");
            String pin = sc.nextLine();

            if (pin.equals(correctPin)) {
                System.out.println("PIN accepted!");
                success = true;
                break;
            } else {
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: " + (3 - i));
            }
        }

        if (!success) {
            System.out.println("Access blocked for this demo.");
        }

        sc.close();
    }
}
