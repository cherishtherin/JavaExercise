
import java.util.Arrays;

public class MI1A_37_01 {

    public static void main(String[] args) {
        int lb = 1, ub = 100; // 範圍: [1,100]
        int[] list35 = new int[100];
        int cnt = 0;
        for (int i = lb; i <= ub; i++) {
            if (i % 15 == 0) {
                cnt++;
            }
        }
        int[] newlist = new int[cnt];
        int index = 0;
        for (int i = lb; i <= ub; i++) {
            {
                if (i % 15 == 0) {
                    newlist[index++] = i;
                }
            }
        }
        System.out.println("list35=[" + Arrays.toString(newlist) + "]");
    }
}
/* [程式輸出]
list35=[15, 30, 45, 60, 75, 90]
 */
