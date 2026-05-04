import java.util.Scanner;
public class Program20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Colleges : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter the name of the college : ");
        String college = sc.next();
        System.out.println("Enter the address of the college : ");
        String add = sc.next();
        System.out.println("Enter the number of Students Studying in college : ");
        int st = sc.nextInt();
        System.out.println("Enter the ratings of that college : ");
        int rat = sc.nextInt();

        System.out.println("Name: " + college + " " + "Address :"+add+ " " + "Students :" + st + " "+ "Ratings:"+rat);


    }
    
}
}
