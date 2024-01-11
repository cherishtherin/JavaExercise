
import java.util.Arrays;

public class HWK09_01 {

    public static void main(String[] args) {
        String s = "Peter,15,35,44,77\nMary,88,65\nPaul,45,63,85";
        String[] s1 = s.split("\n");
        for (String x : s1) {
            String[] s2 = x.split(",");
            System.out.print(s2[0]);
            double sum = 0;
            for (int i = 1; i < s2.length; i++) {
                System.out.print(s2[i] + " ");
                int tt = Integer.parseInt(s2[i]);
                sum += tt;
            }
            System.out.printf("(%.2f)\n", (sum / (s2.length - 1)));
        }

    }
}
/* [程式輸出]
Peter	15 35 44 77 (42.75)
Mary    88 65 (76.50)
Paul 	45 63 85 (64.33)
*/
