import java.util.Scanner;
public class Operation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
    
}
