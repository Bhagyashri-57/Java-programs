import java.util.Scanner;
public class Student3 {
    String usn,name,branch;
    long phone;
    void insertStudent3(String reg,String nm,String br,long ph){
        usn=reg;
        name=nm;
        branch=br;
        phone=ph;
    }
    void displayStudent3(){
        System.out.println("USN = "+usn);
        System.out.println("NAME ="+name);
        System.out.println("BRANCH = "+branch);
        System.out.println("PHONENUMBER ="+phone);

    }
    public static void main(String[]args){
        Student3 st[]=new Student3[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            st[i]=new Student3();
        for(int j=0;j<n;j++){
            System.out.println("Enter the USN: ");
            String usn=sc.next();
            System.out.println("Enter the name of the student: ");
            String name=sc.next();
            System.out.println("Enter the Branch: ");
            String branch=sc.next();
            System.out.println("Enter the phonenumber: ");
            long phone=sc.nextLong();
            st[j].insertStudent3(usn,name,branch,phone);
        }
        for(int i=0;i<n;i++){
            System.out.format("The Student %d details are \n ", i+1);
            st[i].displayStudent3();
        }
    }
    
}
