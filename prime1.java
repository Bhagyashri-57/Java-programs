import java.util.Scanner;
public class prime1{
    public static void main(String[]args){
        int n,m,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println("It is not a Prime Number ");
        
        }
        else{
            for(int i=2;i<m;i++){
                if(n%i==0){
                    System.out.println("It is not a prime number ");
                    flag=1;
                    break;
                }
            }
        if(flag==0){
        System.out.println("It is a prime number ");
    }
}
}
}