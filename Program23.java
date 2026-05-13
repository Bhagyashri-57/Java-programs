import java.util.Scanner;
public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Humans: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter the name of the Human : ");
        String name = sc.next();
        System.out.println("Enter the age of the Human: ");
        int age = sc.nextInt();
        System.out.println("Enter the Occupation of the Human: ");
        String occ = sc.next();
        System.out.println("Enter the salary of the Human: ");
        double sal = sc.nextDouble();

        System.out.println("Number: " +n);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Occupation: "+occ);
        System.out.println("Salary: "+sal);


        }
    }
}
    

