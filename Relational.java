import java.util.Scanner;
public class Relational {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cgpa:");
        float cgpa = sc.nextFloat();
        if(cgpa>=9.0f){
            System.out.print("Student Obtained Grade A");
        }
        else if(cgpa>=8.0f && cgpa<9.0f){
            System.out.print("Student Obtained Grade B");
        }
        else if(cgpa>=7.0f && cgpa<8.0f){
            System.out.print("Student Obtained Grade C");
        }
        else{
            System.out.print("Student has Failed");
        }

    }

    
}
