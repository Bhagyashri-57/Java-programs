
import java.util.Random;
import java.util.Scanner;

public class MemoryChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int number = 1000 + r.nextInt(9000);

        System.out.println("MEMORY CHALLENGE");
        System.out.println("Remember this number: " + number);
        System.out.println("Press Enter when ready.");
        sc.nextLine();

        System.out.print("\nEnter the remembered number: ");
        int answer = sc.nextInt();

        if (answer == number) {
            System.out.println("Amazing memory! 🎉");
        } else {
            System.out.println("Not quite! The number was " + number);
        }

        sc.close();
    }
}
