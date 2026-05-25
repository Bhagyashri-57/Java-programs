import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units: ");
        int units = sc.nextInt();

        double bill;

        if(units <= 100)
            bill = units * 2;
        else if(units <= 200)
            bill = units * 3;
        else
            bill = units * 5;

        System.out.println("Total Bill: Rs." + bill);

        sc.close();
    }
}