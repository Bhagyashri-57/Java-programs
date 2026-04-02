public class Icecreams {
    public void taste(){
        System.out.println("Hey I'm Tasty");
    }
    public void shape(){
        System.out.println("Hey I'm Cone");
    }
    class Butterscotch extends Icecreams{  
    public static void main(String[]args){

    Icecreams i1=new Icecreams();
    i1.shape();
    i1.taste();

}

}
}
