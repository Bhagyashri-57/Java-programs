public class Program22 {
    public static void main(String[]args){

        AdvCalc obj = new AdvCalc();
        int r1= obj.add(3,4);
        int r2 = obj.sub(5,2);
        int r3 = obj.mul(2,8);
        int r4 = obj.div(6,2);
        double r5 = obj.power(4,3);

        System.out.println(r1 + " , "+r2+ " , "+r3+ " , "+r4+ " , "+r5);


    }
    
}
