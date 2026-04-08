public class Program10 {
    public void Write(){
        System.out.println("Writing the program");
    }
    public void Read(){
        System.out.println("Reading the Program");
    }

    }
class Subject extends Program10{
    public static void main(String[]args){
        Subject S1=new Subject();
        S1.Write();
        S1.Read();
    }

}
