import java.util.Scanner;
public class simplecalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= sc.nextInt();
        System.out.println("Enter the Second number:");
        int num2= sc.nextInt();
        int sum = num1+num2;
        int sub = num1-num2;
        int mul =num1*num2;
        int div =num1/num2;

        char operation = 'Y';
        while(operation == 'Y'){
            System.out.println("Enter the Operation: \n 1.Sum, \n 2.Sub, \n 3.Mul \n 4.Div");
        int operator = sc.nextInt();
        if(operator==1){
            System.out.println("Sum:"+sum);
            
        }
        else if(operator==2){
            System.out.println("Sub:"+sub);
        }
        else if(operator==3){
            System.out.println("Mul:"+mul);
        }
        else{
            System.out.println("Div:"+div);
        }
        System.out.println("Do you want to continue[Y/N]:");
        operation = sc.next().charAt(0);

        }

        }
    }
    

