import java.util.Scanner;
public class Calculator2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Operator: ");
        char operator=sc.next().charAt(0);
        System.out.println("Enter the first operand: ");
        double first=sc.nextDouble();
        System.out.println("Enter the second operand: ");
        double second=sc.nextDouble();
        double result=0;
        switch(operator){
            case'+':
            result=first+second;
            System.out.println("Result ="+result);
            break;
            case'-':
            result=first-second;
            System.out.println("Result = "+result);
            break;
            case '*':
                result=first*second;
                System.out.println("Result ="+result);
                break;
                case '/':
                    result=first/second;
                    System.out.println("Result = "+result);
                    break;
        }


    }
    
}
