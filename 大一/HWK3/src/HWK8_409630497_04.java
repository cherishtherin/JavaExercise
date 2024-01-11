
import java.util.*;

public class HWK8_409630497_04 {

    public static void main(String[] args) {
        int[] x1 = {5, 8, 4}; // 代表數字485
        int[] x2 = {9, 7, 6}; // 代表數字679
        System.out.println("x1[]=" + Arrays.toString(x1)); // 485
        System.out.println("x2[]=" + Arrays.toString(x2)); // 679

        int[] sum = add(x1, x2); // 回傳一個陣列(長度4)，內存x1[]+x2[]的結果
        System.out.println("sum(x1,x2)=" + Arrays.toString(sum)); // 485+679=1164

        int[] mul = mul(x1, x2); // 回傳一個陣列(長度6)，內存x1[]*x2[]的結果
        System.out.println("mul(x1,x2)=" + Arrays.toString(mul)); // 485*679=329315

    }

    public static int[] add(int[] x1, int[] x2) {
        int[] x = new int[x1.length + 1];
        int extra = 0;
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                x[i] = extra;
            } else {
                x[i] = (x1[i] + x2[i] + extra) % 10;
                extra = (x1[i] + x2[i] + extra) / 10;
            }
        }

        return x;
    }

    public static int[] mul(int[] x1, int[] x2) {
        int[] a = new int[x1.length + x2.length];
        for (int i = 0; i < x2.length; i++) {
            int extra = 0;
            int index=i;
            for (int j = 0; j < x1.length; j++) {
                a[index++] += (x1[j] * x2[i] + extra) % 10;
                extra = (x1[j] * x2[i] + extra) / 10;
                
            }
            a[index++]=extra;
        }
        int dex=0;
        for (int i=0; i<a.length; i++){
            if (a[i]>=10){
                a[i+1]+=(a[i]/10);
                a[i]=(a[i]%10);
            }
        }
        
                return a;

    }
}

/* [程式輸出]
x1[]=[5, 8, 4]
x2[]=[9, 7, 6]
sum(x1,x2)=[4, 6, 1, 1]    (485+679=1164)
mul(x1,x2)=[5, 1, 3, 9, 2, 3]  (485*679=329315)
 */
