interface Resizable1{
    void resizable1Width(int width);
    void resizable1Height(int height);
}
class Rectangle implements Resizable1{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    @Override
    public void resizable1Width(int width){
this.width=width;
System.out.println("Width resizable to : "+this.width);
    }
    @Override
    public void resizable1Height(int height){
        this.height=height;
        System.out.println("Height resizable to : "+this.height);
    }
    public void display(){
        System.out.println("Rectangle[ Width:"+width+"Height"+height+"]");
    }

public static void main(String[]args){
Rectangle rect=new Rectangle(100,50);
rect.display();
rect.resizable1Width(150);
rect.resizable1Height(80);
rect.display();
}
}