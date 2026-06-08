interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
    
}
class Rectangle implements Resizable{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    @Override
    public void resizeWidth(int width){
        this.width=width;
        System.out.println("Width resize to:"+this.width);
    }
    @Override
    public void resizeHeight(int height){
        this.height=height;
        System.out.println("Height resize to:"+this.height);
    }
    public void display(){
        System.out.println("Rectangle[Width:" + width + ",Height: "+ height + "]");
    }
    public static void main(String[]args){
        Rectangle rect = new Rectangle(100,50);
        rect.display();
        rect.resizeWidth(150);
        rect.resizeHeight(80);
        rect.display();
    }
}


