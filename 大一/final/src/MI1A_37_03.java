
import java.util.*;

public class MI1A_37_03 {

    public static void main(String[] args) {
        System.out.println("------ randomFill(a,lb,ub) ------ 3%");
        int[] a = new int[50];
        int lb = -4, ub = 6;
        randomFill(a, lb, ub);
        System.out.println("a[]=\n" + Arrays.toString(a));

        System.out.println("------ shuffle(a[],times) ------ 6%");
        shuffle(a, 100);
        System.out.println("after shuffling, a[]=\n" + Arrays.toString(a));

        System.out.println("------ count(a[], lb, ub) ------ 5%");
        int[] cnt = count(a, lb, ub);
        System.out.println("cnt[]=" + Arrays.toString(cnt));

        System.out.println("------ darwBarChart(a[], lb, ub, sym) ------ 6%");
        drawBarChart(cnt, lb, ub, '#');

        System.out.println("-------- fillData(source,times)------ 7%");
        int[] source = {1, 2, 3, 4, 5, 6};
        int[] times = {4, 6, 3, 5, 3, 1};
        int[] data = fillData(source, times);
        System.out.println("data[]=" + Arrays.toString(data));
    }

    public static void randomFill(int[] a, int lb, int ub) { // 3%
        // [功能]: 將[lb,ub]中的整數亂數填入a[], 亂數種子111
        Random r = new Random(111);
        for (int i = 0; i < a.length; i++) {
            a[i] = lb + r.nextInt(ub - lb + 1);
        }
        // DIY here
    }

    public static void shuffle(int[] a, int times) { // 6%
        // [功能]: 隨機抽選a[]中的二個數n1,n2，將n1與a[]第一個元素互換，n2則與最後一個元素互換
        //        將上述步驟進行times次 (亂數種子333)
        Random r = new Random(333);
        int temp1, temp2, n1, n2;
        for (int i = 0; i < times; i++) {
            n1 = r.nextInt(a.length);
            n2 = r.nextInt(a.length);

            temp1 = a[0];
            a[0] = a[n1];
            a[n1] = a[0];

            temp2 = a[a.length - 1];
            a[a.length - 1] = a[n2];
            a[n2] = a[0];
        }
        // DIY here
    }

    public static int[] count(int[] a, int lb, int ub) { // 5%
        // [功能]: 統計a[]中的整數出現的次數(整數的範圍為[lb,ub])，並將結果存於一陣列傳回
        // [說明]: 假設結果存於一陣列cnt[]，則
        //         cnt[0]儲存lb出現的次數，cnt[1]儲存(lb+1)出現的次數...類推 
        int x[] = new int[ub - lb + 1];
        for (int i = 0; i < x.length; i++) {
            x[i] = lb++;
        }
        int d[] = new int[x.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (a[i] == x[j]) {
                    d[j]++;
                }
            }
        }
        return d; // DIY, 自行修改
    }

    public static void drawBarChart(int[] count, int lb, int ub, char symbol) { // 6%
        // [功能]: 依照count[]中的次數，以symbol印出長條圖，請參考[程式輸出]
        // [說明]: count[0]儲存lb出現的次數，count[1]儲存lb+1出現的次數...類推
        // DIY here
        for (int i = 0; i < count.length; i++) {
            System.out.print((lb++) + ": ");
            for (int j = 0; j < count[i]; j++) {
                System.out.print(symbol);
            }
            System.out.println(count[i]);
        }
    }

    public static int[] fillData(int[] source, int[] times) { // 7%
        // [功能]: 依照times[]中所指定次數，擴展source[]中的元素
        // [範例]: 若source[]={2,5,7}, times[]={1,3,2}，則結果rlt[]將會是
        //        rlt[] = {2, 5, 5, 5, 7, 7} ;

        int cnt = 0;
        for (int i = 0; i < source.length; i++) {
            cnt += (source[i] * times[i]);

        }
        int[] rlt = new int[cnt];
        int cit=0;
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < times[i]; j++) {
                rlt[cit++]=source[i];
            }
        }

        return rlt; // DIY, 自行修改
    }
}
/* [程式輸出]
------ randomFill(a,lb,ub) ------ 3%
a[]=
[-2, 2, 1, 3, -1, -3, -2, 3, 6, 3, 4, 5, 4, 4, 1, -2, 5, -4, 1, 5, -1, 2, 6, 1, -2, 0, 5, 4, 4, -4, 0, -3, -1, -2, 5, -1, -1, 2, 4, -1, 5, -2, 3, 2, -4, -3, 6, -3, -3, -3]
------ shuffle(a[],times) ------ 6%
after shuffling, a[]=
[-2, -3, -4, -1, 6, 5, -4, 3, 1, 5, 4, 5, 4, 4, -1, -1, -1, 4, 2, 4, -2, -2, -3, -3, 5, -1, 1, 0, 5, -2, -2, -3, 2, 3, -3, 6, -2, 6, 3, -3, 4, 2, 1, -1, 3, -4, 5, 0, 1, 2]
------ count(a[], lb, ub) ------ 5%
cnt[]=[3, 6, 6, 6, 2, 4, 4, 4, 6, 6, 3]
------ darwBarChart(a[], lb, ub, sym) ------ 6%
-4:	###(3)
-3:	######(6)
-2:	######(6)
-1:	######(6)
0:	##(2)
1:	####(4)
2:	####(4)
3:	####(4)
4:	######(6)
5:	######(6)
6:	###(3)
-------- fillData(source,times)------ 7%
data[]=[1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6]
 */
