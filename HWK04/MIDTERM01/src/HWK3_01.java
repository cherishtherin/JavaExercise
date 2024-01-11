
import java.util.Random;

public class HWK3_01 {

    public static void main(String[] args) {
        int[] data = {88, 72, 45, 99, 85, 43, 37, 51};
        int min = minOf(data);
        System.out.println("minOf(data)=" + min); // 43

        int max2 = max2Of(data);
        System.out.println("max2Of(data)=" + max2); // 88

        Random r = new Random(1);
        int[] a = new int[888], b = new int[999];
//         將[0,100]之間的亂數整數填入a[]與b[]中        
        randomlyFill(a, 0, 100, r);
        randomlyFill(b, 0, 100, r);

        int sim1 = same(a, b), sim2 = same(b, a);
        System.out.println("same(a,b)=" + sim1 + "\nsame(b,a)=" + sim2);

    }

    public static int minOf(int[] a) {
        int minIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return a[minIndex];
    }

    public static int max2Of(int[] a) {
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        int max2Index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max2Index] && a[i] < a[maxIndex]) {
                max2Index = i;
            }
        }

        return a[max2Index];
    }

    public static void randomlyFill(int[] a, int lb, int ub, Random r) {
        for (int i = 0; i < a.length; i++) {
            a[i] = lb + r.nextInt(ub - lb + 1);
        }
    }

    public static int same(int[] a, int[] b) {
        int same=0;
    
        int less= a.length;
        if(b.length<a.length)less=b.length;
        for (int i=0; i<less; i++){
            if(a[i]==b[i])same++;
        }
            
        
    return same;
    }
}
        
    /* [程式輸出]
minOf(data)=43
max2Of(data)=88
same(a,b)=6
same(b,a)=6
     */
