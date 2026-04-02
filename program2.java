import java.util.Scanner;
public class program2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Start:");
        int start = sc.nextInt();
        System.out.println("Enter the stop:");
        int stop = sc.nextInt();
        for(int i=start; i<=stop; i++){
            System.out.println(i);
            int square = i*i;
            int cube = i*i*i;
            System.out.println("Square of"+i+"is"+square);
            System.out.println("Cube of"+i+"is"+cube);
        
        }
    }
    
    
}
