
import static java.lang.System.out;

public class P135_EX1_SumAvg {

    public static void main(String[] args) {
        double total = 0, avg = 0;
        total = sum(1, 2, 3, 4);
        avg = average(1, 2, 3, 4);
        out.println(total + "," + avg);
        total = sum(1, 2, 3, 4, 5, 6);
        avg = average(1, 2, 3, 4, 5, 6);
        out.println(total + "," + avg);
    }

    public static int sum(int... a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];

        }
        return total;
    }
    public static int average(int ...a){
        int total=sum(a);
        return total/a.length;
    }
}
