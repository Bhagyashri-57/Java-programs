import java.util.Scanner;

public class PersonalityAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Please enter a name.");
        } else {
            int score = name.length() % 3;

            if (score == 0)
                System.out.println("You are a Creative Thinker!");
            else if (score == 1)
                System.out.println("You are a Natural Leader!");
            else
                System.out.println("You are an Explorer!");

            System.out.println("Have a wonderful day, " + name + "!");
        }

        sc.close();
    }
}
