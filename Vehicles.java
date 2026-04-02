public class Vehicles {
    public void drive(){
        System.out.println("Person is driving");
    }
    public void exchange(){
        System.out.println("Person exchange Vehicle");
    }
    
    
}
class Car extends Vehicles{

public static void main(String[]args){
    Car C1 = new Car();
    Car c2 = new Car();
    C1.exchange();
    c2.drive();
}
}