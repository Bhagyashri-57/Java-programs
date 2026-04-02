import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char shopping = 'Y';
        while(shopping == 'Y'){

        System.out.println("Select the city: \n 1.Bengaluru, \n 2.Hyderabad, \n 3.Chennai");
        int city = sc.nextInt();
    
            if(city ==1){
                System.out.println("Shopping is done in Bengaluru");
            }
            else if(city==2){
                System.out.println("Shopping is done in Hyderabad");
            }

            else
                System.out.println("Shopping is done in Chennai");
        
                System.out.println("Do you want to continue[Y/N]:");
                shopping = sc.next().charAt(0);
            }
        }


    }
    
