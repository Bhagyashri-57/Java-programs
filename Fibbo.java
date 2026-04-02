import java.util.Scanner;
public class Fibbo {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the Total numbers:");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int sum = a+b;
            System.out.print( " "+ sum);
            a=b;
            b=sum;

        }

    }
    
}
