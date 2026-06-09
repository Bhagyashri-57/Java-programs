import java.util.Random;
public class PasswordGenerator {
    public static void main(String[] args) {
        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"0123456789"+"@#$%^&*";

        int length=8;
        Random random=new Random();

        StringBuilder password = new StringBuilder();
        for(int i=0;i<length;i++){
            int index=random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }
        System.out.println("Generate Password"+password);

        
    }
}
    
