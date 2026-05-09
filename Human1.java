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

public void setAge(int age,Demo obj){
    obj.age =age;
    
}
public void setName(String n){
    name =n;
}
}
public class Human1 {
    public static void main(String[]args){
        Demo obj = new Demo( );
        obj.setAge(20,obj);
        obj.setName("Bhagya");

        System.out.println(obj.getName()+ " "+obj.getAge());

    }
    
}
