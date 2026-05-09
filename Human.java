class Demo{
    private int age;
    private String name;

    public int getAge()
{
    return age;
}
public String getName(){
    return name;
}

public void setAge(int a){
    age =a;
    
}
public void setName(String n){
    name =n;
}
}
public class Human {
    public static void main(String[]args){
        Demo obj = new Demo();
        obj.setAge(20);
        obj.setName("Bhagya");

        System.out.println(obj.getName()+ " "+obj.getAge());

    }
    
}
