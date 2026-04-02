import java.util.Scanner;
public class numbers {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the start:");
        int start = sc.nextInt();
        System.out.println("Enter the stop:");
        int stop = sc.nextInt();
        System.out.println("Enter the increment value:");
        int n = sc.nextInt();

        for(int i=start; i<=stop; i=i+n){
            System.out.println(i);

        }
    }
    
}
