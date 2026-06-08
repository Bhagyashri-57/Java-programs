import java.util.Scanner;
class Exceptions{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a= sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b= sc.nextInt();
        try {
            if(b==0){
                throw new ArithmeticException("Division By Zero Not Possible ");
            }
            int result = a/b;
            System.out.println("Result of" + a + "/" +b + "is: " + result);  
        } catch (ArithmeticException e) {
            System.out.println("Error:"+e.getMessage());
        }
        finally{
            sc.close();
        }
    }

}