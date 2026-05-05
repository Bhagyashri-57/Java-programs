class Demo {

    public void playing() {
        System.out.println("Playing the Music");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";

        return "Nothing";
    }
}

public class Computer {
    public static void main(String[] args) {

        Demo obj = new Demo(); 
        obj.playing();

        String str = obj.getMeAPen(2);
        System.out.println(str);
    }
}