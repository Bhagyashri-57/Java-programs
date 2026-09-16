abstract class Shapes{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shapes{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    @Override
    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
class Triangle extends Shapes{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    double calculateArea(){
        double s=(side1+side2+side3)/2;
        return (s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    double calculatePerimeter(){
        return side1+side2+side3;
    }
}
public class Programm{
public static void main(String[] args){
Circle circle=new Circle(5);
Triangle triangle=new Triangle(3,4,5);
System.out.println("Circle Area = "+circle.calculateArea());
System.out.println("Circle Perimeter = "+circle.calculatePerimeter());
System.out.println("Triangle Area = "+triangle.calculateArea());
System.out.println("Triangle Perimeter = "+triangle.calculatePerimeter());
}
}