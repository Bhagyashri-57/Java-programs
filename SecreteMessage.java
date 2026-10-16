```java
import java.util.Scanner;

public class SecreteMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        String secret = "";

        for (int i = 0; i < message.length(); i++) {
            secret += (char)(message.charAt(i) + 3);
        }

        System.out.println("Secret Message: " + secret);
        sc.close();
    }
}
```