import java.util.Scanner;
public class program1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char hackathon = 'Y';

    while( hackathon == 'Y'){
        System.out.println("Enter the match name: \n 1.Cricket, \n 2.Badminton, \n 3.Hockey, \n 4.Football");
        int hack = sc.nextInt();
        if(hack==1){
            System.out.println(" Selected Cricket");
        }
        else if(hack ==2){
            System.out.println("selected Badminton");
        }
        else if(hack ==3){
            System.out.println("Selected Hockey");
        }
        else{
            System.out.println("Selected Football");
        }
        System.out.println("Do you want to Continue[Y/N]");
        hackathon = sc.next().charAt(0);
        
    }
}}
    
