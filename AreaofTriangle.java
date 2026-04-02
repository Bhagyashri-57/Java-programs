import java.util.Scanner;
public class AreaofTriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the triangle");
        float length = sc.nextFloat();
        System.out.print("Enter the height of the Triangle");
        float height = sc.nextFloat();
        float area = (length*height)/2;
        System.out.println("Area of the Triangle:"+area);

    }
    } 

    

