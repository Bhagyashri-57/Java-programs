
import java.util.Scanner;

public class WeatherSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     WEATHER CONDITION APP");
        System.out.println("================================");

        System.out.print("Enter temperature in Celsius: ");
        double temperature = sc.nextDouble();

        System.out.println("\n--- Weather Report ---");
        System.out.println("Temperature: " + temperature + " °C");

        if (temperature < 0) {
            System.out.println("Weather: Freezing Cold");
            System.out.println("Suggestion: Wear thick winter clothes!");
        } 
        else if (temperature < 10) {
            System.out.println("Weather: Very Cold");
            System.out.println("Suggestion: Wear a warm jacket.");
        } 
        else if (temperature < 20) {
            System.out.println("Weather: Cool");
            System.out.println("Suggestion: Carry a light jacket.");
        } 
        else if (temperature < 30) {
            System.out.println("Weather: Pleasant");
            System.out.println("Suggestion: Enjoy your day!");
        } 
        else if (temperature < 40) {
            System.out.println("Weather: Hot");
            System.out.println("Suggestion: Drink plenty of water.");
        } 
        else {
            System.out.println("Weather: Extremely Hot");
            System.out.println("Suggestion: Avoid prolonged outdoor activity.");
        }

        System.out.println("================================");
        System.out.println("Thank you for using Weather App!");

        sc.close();
    }
}
