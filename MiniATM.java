
import java.util.Scanner;

public class MiniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        while (true) {
            System.out.println("\n--- MINI ATM ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Enter a valid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Withdrawal amount: ");
                    double amount = sc.nextDouble();

                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Invalid amount or insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Mini ATM!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
