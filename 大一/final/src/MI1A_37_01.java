
import java.util.*;

public class MI1A_37_01 {

    public static void main(String[] args) {
        System.out.println("------- gcd(a,b) --------- 5%");
        int x = 2 * 3 * 5 * 7 * 17, y = 2 * 3 * 7 * 11 * 23;
        System.out.printf("gcd(%d,%d)=%d\n", x, y, gcd(x, y));

        System.out.println("------- ordering(a,b,c) --------- 5%");
        ordering(5, 3, 4);
        ordering(9, 7, 2);

        System.out.println("------- printComma(d[]) --------- 6%");
        int[] d1 = {1, 2, 3, 4, 5, 8, 9, 0}; //代表數字12345890
        int[] d2 = {3, 4, 5, 8, 9, 0}; //代表數字345890
        int[] d3 = {2, 5, 7}; // 數字257
        printComma(d1);
        printComma(d2);
        printComma(d3);

        System.out.println("------- findMutualPrime(a[]) --------- 6%");
        int[] a = {38, 54, 66, 92, 18, 16, 40, 44, 75};
        System.out.println("a[]=" + Arrays.toString(a));
        findMutualPrime(a);

        System.out.println("--------- lcm(b[]) --------- 7%");
        int[] b = {2 * 3 * 5 * 7 * 11, 3 * 5 * 7 * 13, 2 * 3 * 5 * 7 * 17, 2 * 3 * 5 * 7 * 23};
        System.out.println("b[]=" + Arrays.toString(b));
        System.out.println("lcm of b[]=" + lcm(b));
    }

    public static int gcd(int a, int b) { // 5%
        int least = a;
        if (b < a) {
            least = b;
        }
        int gcd = 0;
        for (int i = 2; i < least; i++) {
            if (least % i == 0) {
                gcd = i;
            }

        }
        return gcd; // DIY
    }

    public static void ordering(int a, int b, int c) { // 5%
        // [功能]: 依序將a,b,c由小到大印出
        int[] x = {a, b, c};
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        int mid=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > mid&&x[i]<max) {
                mid = x[i];
            }
        }
        int min=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != mid&&x[i]!=max) {
                min = x[i];
            }
        }
        System.out.println("["+min+","+mid+","+max+"]");
    }

    public static void printComma(int[] v) { // 6%
        // [功能]: 將v[]所代表數字印出，但要加上千分位(,)
        // [範例]: 例如，v[]={1,2,4,5,6,7,8,9} -> 印出 12,456,789
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
        }
        System.out.print(" -> ");
       for (int i =0; i >v.length; i--) {
           if(i%3==0)System.out.print(",");
            System.out.print(v[i-v.length-1]);
        }
            
        System.out.println("");
    }

    public static void findMutualPrime(int[] a) { // 6%
        // [功能]: 找出a[]中互質(二數之gcd為1)的整數對，並將其印出
        // [範例]: 若 a[]={38, 54, 66, 92}
        //        先比較(38,54)(38,66)(38,92)是否互質，
        //        之後比較(54,66)(54,92)，最後比較(66,92) 
        // [提示]: 本題須使用雙層for-loop
        // DIY here
        
    
    }

    public static int lcm(int[] a) { // 7%
        // [功能]:　找出a[]中所有正整數的最小公倍數
        // [提示]: 請先求出a[]所有整數的最大公因數
        int lcm=0;
        for (int i=0; i<a.length; i++){
            if(i==a.length-1)lcm=a[i];
            int gcd =gcd(a[i],a[i+1]);
             lcm= a[i]*a[i+1]/gcd;
            a[i+1]=lcm;
            
        }

        return lcm;  // 自行修改
    }
}
/* [程式輸出]
------- gcd(a,b) --------- 5%
gcd(3570,10626)=42
------- ordering(a,b,c) --------- 5%
ordreing 5,3,4 -> 3,4,5
ordreing 9,7,2 -> 2,7,9
------- printComma(d[]) --------- 6%
12345890 -> 12,345,890
345890 -> 345,890
257 -> 257
------- findMutualPrime(a[]) --------- 6%
a[]=[38, 54, 66, 92, 18, 16, 40, 44, 75]
Mutual prime pair =(38,75)(92,75)(16,75)(44,75)
--------- lcm(b[]) --------- 7%
b[]=[2310, 1365, 3570, 4830]
lcm of b[]=46966920
 */


