
import java.util.Scanner;

public class TypingSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target = "Java makes programming interesting";
        System.out.println("Type this sentence:");
        System.out.println(target);

        long start = System.currentTimeMillis();
        String typed = sc.nextLine();
        long end = System.currentTimeMillis();

        double seconds = (end - start) / 1000.0;
        int words = typed.trim().isEmpty()
                ? 0 : typed.trim().split("\\s+").length;

        if (seconds > 0) {
            double wpm = words * 60.0 / seconds;
            System.out.printf("Time: %.2f seconds%n", seconds);
            System.out.printf("Typing speed: %.2f WPM%n", wpm);
            System.out.println("Exact sentence match: "
                    + typed.equals(target));
        } else {
            System.out.println("Try again; typing time was too short.");
        }

        sc.close();
    }
}
