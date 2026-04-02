import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        char choice = 'y';

        while(choice == 'y'){
            try {
            System.out.println("Enter the first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number:");
            int num2 = sc.nextInt();
            int res = num1/num2;
            System.out.println("Result="+res);
        }catch( InputMismatchException i){
            System.out.println("Enter the valid Number");
            sc.nextLine();
            continue;
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero is not possible");
            continue;
        }
        System.out.println("Do you want to continue:[y/n]");
        choice = sc.next().charAt(0);
        
        
    }
    }
}
