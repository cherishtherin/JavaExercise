package Test;
import java.util.Arrays;

public class q4 {

    public static void main(String[] args) {
        int n = cnk(8, 3);
        // 撰寫一遞迴函數cnk，計算8取3的有多少種類。
        System.out.println("cnk(8,3)=" + n);// ans=14    
        int[] a = {5, 3, 4, 1, 6, 7};
        int min = min(a);

//找出a[]中的最小值    
        System.out.println("min of a[] = " + min);
        System.out.println("fibonnaci(3) "+fibonnaci(3));
    }

    public static int cnk(int n, int k) {
        if(k==0)return 1;
        if(k==n)return 1;
        if(k>n)return 0;
        return cnk(n-1,k-1)+cnk(n-1,k);
    }

    public static int min(int[] a) {
        if(a.length==1)return a[0];
        if(a[a.length-1]<a[0])a[0]=a[a.length-1];
        a=Arrays.copyOf(a, a.length-1);
        return min(a);
    }
    public static int fibonnaci(int x){
        if(x==0)return 0;
        if(x==1)return 1;
        return fibonnaci(x-1)+fibonnaci(x-2);
    }
}
// DIY here, 使用遞迴概念完成cnk(n,k)與min(a)函數, 6%, 6%}

/* [程式輸出]cnk(8,3)=14min of a[] = 1*/
