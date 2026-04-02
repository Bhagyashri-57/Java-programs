
public class BinaryFunction {
    public static int[] toBinary(int dec){
        int bin[]=new int[15];
        int i=0;
        while(dec>0){
            int r=dec%2;
            bin[i]=r;
            i++;
            dec=dec/2;
        }
        int l=0;
        int r=i-1;
        while(l<r){
            int t=bin[l];
            bin[l]=bin[r];
            bin[r]=t;
            l++;
            r--;
        }
        int finalBinary[]=new int[i];
        for(int k=0;k<i;k++){
            finalBinary[k]=bin[k];
        }
        return finalBinary;
    }
    public static void main(String[]args){
        int num=10;
        int a[]=new int[15];
        int result[]= toBinary(num);
        System.out.println(result);

    }
}
