import java.util.Scanner;
public class Program27 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks=sc.nextInt();
        if(marks<100 && marks>=90){
            System.out.println("Grade A ");
        }
        else if(marks<90 && marks>=80){
            System.out.println("Grade B");

        }
        else if(marks<80 && marks>=70){
            System.out.println("Grade C");
        }
        else if(marks<70 && marks>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Low Grade");
        }


        }
    }
    
