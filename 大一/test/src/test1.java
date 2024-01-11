
import java.util.*;

public class test1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("input 2 non negative integer");
        int a, b, c, d;

        a = cin.nextInt();
        b = cin.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Error:divided by 0!");
        } else {
            if (a > b) {
                c = a / b;
                d = a % b;
                System.out.print(a + "/" + b + "=" + c + "..." + d);

            } else if (b > a) {
                c = b / a;
                d = b % a;
                System.out.print(b + "/" + a + "=" + c + "..." + d);
            }
        }
    }
}
