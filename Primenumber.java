import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            if(num %i==0)
                count++;
        }
            if(count==2)
                System.out.println("It is a prime number");
            
            else
                System.out.println("It is not a prime number");
            
        
    }}
    

