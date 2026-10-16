import java.util.Random;
import java.util.Scanner;

public class NumberMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100!");

        do {
            System.out.print("Your guess: ");
            guess = sc.nextInt();

            if (guess < secret)
                System.out.println("Too low!");
            else if (guess > secret)
                System.out.println("Too high!");
            else
                System.out.println("Correct! You won!");
        } while (guess != secret);

        sc.close();
    }
}
