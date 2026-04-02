import java.util.Scanner;
public class Swap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=10, b=20,temp;
        temp = a;
        a =b;
        b =temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
