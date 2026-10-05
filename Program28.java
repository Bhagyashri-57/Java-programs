import java.util.Scanner;
public class Program28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second Number: ");
        int b=sc.nextInt();
        int sum=a+b;
        int subtraction=a-b;
        int multiplication=a*b;
        int division=a/b;
        System.out.println("Sum = "+sum);
        System.out.println("Subtraction = "+subtraction);
        System.out.println("Multiplication = "+multiplication);
        System.out.println("Division = "+division);

    }
    
}


