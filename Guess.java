import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char decision = 'Y';

        while(decision =='Y'){
        System.out.println("Enter the colour: \n1.Black \n2.Red \n3.White \n4.Pink  ");
        int dec = sc.nextInt();

        if(dec==1){
            System.out.println(" You selected Black ");
        }
        else if(dec==2){
            System.out.println(" You selected Red");
        }
        else if(dec==3){
            System.out.println(" You selected White");
        }
        else{
            System.out.println(" You selected Pink ");
        }
        System.out.println("Do you want to Continue[Y/N]");
        decision = sc.next().charAt(0);
    }
}
}
