import java.util.Scanner;
public class BMICalculator {
    static double calculateBMI(double weight,double height){
        return weight/(height*height);

    }
    static void showResult(double bmi){
        System.out.println("BMI is:"+bmi);

        if(bmi<18.5)
            System.out.println("It is Underweight");
            else if(bmi<25)
                System.out.println("It is Normal Weight");
            else if(bmi<30)
                System.out.println("It is Over Weight");
            else 
                System.out.println("It is Obese");
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter the Weight:");
            double weight = sc.nextDouble();
            System.out.println("Enter the height:");
            double height = sc.nextDouble();
            double bmi = calculateBMI(weight,height);
            System.out.println(bmi);

        }}
    
    

