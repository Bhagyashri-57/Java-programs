import java.util.Scanner;
public class Program18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt();
        for(int i=0;i<students;i++){
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the USN: ");
        String usn = sc.next();
        System.out.println("Enter the Branch: ");
        String branch =sc.next();
        System.out.println("Enter the Section: ");
        String section = sc.next();
        System.out.println(students+" "+name+" "+usn+" "+branch+" "+section);


    }
}
}

