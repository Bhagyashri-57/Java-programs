class Car1{
    public void drive(){
        System.out.println("Driving the Car1");
    }

} 

class Car2{
    private void drive(){
        System.out.println("Driving the Car2");
    }
    public void getdrive(){
        drive();
    }
}
