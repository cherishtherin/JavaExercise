
import java.util.*;

public class ex21 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int no = cin.nextInt();
        int[] a = new int[no];
        for (int i = 0; i <= a.length-1; i++) {
            a[i] = i * 2 + 10;
            System.out.print(a[i] + "  ");
        }
        System.out.println("");
        int[] b = new int[no];
        for (int i = 0; i <= b.length-1; i++) {
            b[i] = 100 - i * 3;
            System.out.print(b[i] + "  ");
        }
        System.out.println("");

        double[] c = new double[no];
        for (int i = 0; i <= a.length-1; i++) {
            c[i] = (a[i] + b[i]) / 2;
            System.out.print(c[i] + "  ");
        }
    }
}
