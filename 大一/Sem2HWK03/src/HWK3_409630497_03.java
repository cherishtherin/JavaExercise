import java.util.*;
import java.util.Arrays;
public class HWK3_409630497_03 {
    public static void main (String[]args){
        Scanner cin = new Scanner(System.in);
        System.out.print("input n: ");
        int n= cin.nextInt();
        System.out.print("fib("+n+") :");
        
        fib(n);
        
    }
    public static void fib(int n){
        int []a= new int[n+1];
        a[0]=0;a[1]=1;a[2]=1;
        for(int i=3;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(a[n]);
        
    }
}
