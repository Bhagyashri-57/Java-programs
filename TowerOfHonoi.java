
public class TowerOfHonoi{
    public static void toh(int n,char source,char destination,char auxiliary){
        if(n==1){
            System.out.println("Move disk 1 from " + source + " to "+ destination );
            return;
        }
        toh(n-1,source,auxiliary,destination);
        System.out.println("Move disk "+ n + "from "+ source +" to "+ destination);
        toh(n-1,auxiliary,destination,source);

    }
    public static void main(String[]args){
        int n = 3;
        char src='A';
        char dest='C';
        char aux='B';
        toh(n,src,dest,aux);


    }
}
