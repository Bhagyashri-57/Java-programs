import java.util.Scanner;
public class Program12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Its Even number ");
        }
        else
            System.out.println("Its odd number ");

    }
    
}
