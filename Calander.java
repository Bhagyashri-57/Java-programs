import java.util.Calendar;

public class Calander{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("Date: " + c.get(Calendar.DATE));
        System.out.println("Month: " + (c.get(Calendar.MONTH)+1));
        System.out.println("Year: " + c.get(Calendar.YEAR));
    }
}