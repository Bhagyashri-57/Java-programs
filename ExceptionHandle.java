import java.util.Scanner;
public class ExceptionHandle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        try {
            if(b==0){
                throw new ArithmeticException("Division by zero is not possible: ");
            }
            int result=a/b;
            System.out.println("Result ="+result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error "+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
}
