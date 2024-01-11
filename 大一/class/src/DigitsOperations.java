
import java.util.*;

public class DigitsOperations {

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
        int[] rlt = new int[x1.length + 1];
        int extra = 0;
        for (int i = 0; i < rlt.length; i++) {
            if (i == rlt.length - 1) {
                rlt[i] = extra;
            } else {
                rlt[i] = (x1[i] + x2[i] + extra) % 10;
                extra = (x1[i] + x2[i] + extra) / 10;
            }
        }
        return rlt;
    }

    public static int[] mul(int[] x1, int[] x2) {
        // 模仿手算乘法，進行x1[], x2[]的相乘
        //           485  j
        //         x 679  i
        //     ------------
        //          4365
        //         3395
        //        2910
        //     -------------
        //        329315
        int[] rlt = new int[x1.length * 2];
        int extra = 0;
        for (int i = 0; i < x2.length; i++) {
            int index = i;
            for (int j = 0; j < x1.length; j++) {
                    rlt[index] += (x1[j] * x2[i] + extra) % 10;
                    extra = (x1[j] * x2[i] + extra) / 10;
                     
                    if(rlt[index]>=10){
                        rlt[index+1]+=rlt[index]/10;
                        rlt[index]=rlt[index]%10;
                    }
                    index++;
            }
           rlt[index]+=extra;
           extra=0;
            
        }

        return rlt;
    }
}
/* [程式輸出]
x1[]=[5, 8, 4]
x2[]=[9, 7, 6]
sum(x1,x2)=[4, 6, 1, 1]    (485+679=1164)
mul(x1,x2)=[5, 1, 3, 9, 2, 3]  (485*679=329315)
 */
