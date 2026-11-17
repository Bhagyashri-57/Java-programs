import java.util.Scanner;

enum GameState {
    PLAYING
}

public class GameFSM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GameState state = GameState.PLAYING;

        while (state == GameState.PLAYING) {

            System.out.println("ROCK PAPER SCISSORS");

            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();


            String computer = "Rock";

            if (choice == 1) {
                System.out.println("Draw!");
            } 
            else if (choice == 2) {
                System.out.println("You Win!");
            } 
            else if (choice == 3) {
                System.out.println("Computer Wins!");
            } 
            else {
                System.out.println("Invalid choice!");
            }

            break;
        }

        System.out.println("Game Completed!");
        sc.close();
    }
}