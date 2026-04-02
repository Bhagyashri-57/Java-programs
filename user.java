import java.util.InputMismatchException;
import java.util.Scanner;
public class user {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the username:");
        String username = sc.next();
        System.out.println("Enter the Email of the user:");
        String email = sc.next();
        System.out.println("Enter the Phone Number:");
        long phone = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the Password:");
        int password = sc.nextInt();
        System.out.println("Enter the age of the user:");
        int age = sc.nextInt();
        System.out.println(username+ " " +email+ " "+phone+ " "+ password+ " "+ age+" ");
        } catch(InputMismatchException e){
            System.out.println("Enter the valid number ");
            sc.nextLine();
        }
        
    }
}
