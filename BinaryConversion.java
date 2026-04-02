import java.util.*;
public class BinaryConversion {
    public static void main(String[] args) {
        int num= 89;
        int a[]=new int[15];
        int i=0;
        while(num>0){
            int right=num%2;
            a[i]=right;
            i++;
            num=num/2;
        }
        int left =0;
        int right=i-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
            System.out.println(Arrays.toString(a));
        }
    }
    
