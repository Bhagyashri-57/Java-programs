import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Items:");
        int item = sc.nextInt();
        int n =item;
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println(i);
            
        System.out.println("Enter the Product_id:");
        int id = sc.nextInt();
        System.out.println("Enter the Product type:");
        String type = sc.next();
        System.out.println("Enter the Product name:");
        String name =sc.next();
        System.out.println("Enter the Product Price:");
        float price = sc.nextFloat();
        System.out.println("Enter the discount amount:");
        float discount = sc.nextFloat();
        price=price-(price*discount);
        System.out.println(id+ " "+type+" "+name+" "+price+" "+discount);
        }
    }
    
}
