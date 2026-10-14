
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly budget: ");
        double budget = sc.nextDouble();

        System.out.print("Enter food expenses: ");
        double food = sc.nextDouble();

        System.out.print("Enter travel expenses: ");
        double travel = sc.nextDouble();

        System.out.print("Enter shopping expenses: ");
        double shopping = sc.nextDouble();

        double total = food + travel + shopping;
        double remaining = budget - total;

        System.out.println("\n===== MONTHLY REPORT =====");
        System.out.println("Budget: ₹" + budget);
        System.out.println("Total spent: ₹" + total);
        System.out.println("Remaining: ₹" + remaining);

        if (remaining < 0) {
            System.out.println("Warning: You exceeded your budget!");
        } else {
            System.out.println("Great! You stayed within budget.");
        }

        sc.close();
    }
}
