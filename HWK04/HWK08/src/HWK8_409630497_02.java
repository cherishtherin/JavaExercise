
import java.util.*;

public class HWK8_409630497_02 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (true) {
            System.out.println(">command = ");
            String opr = cin.next();
            double x1 = cin.nextDouble();
            double x2 = cin.nextDouble();

            if (opr.equalsIgnoreCase("mul")) {
                System.out.println(x1 + "*" + x2 + " = " + (x1 * x2));
            } 
            else if (opr.equalsIgnoreCase("div")) {
                System.out.println(x1 + "/" + x2 + " = " + (x1 / x2));
            } 
            else if (opr.equalsIgnoreCase("sum")) {
                System.out.println(x1 + "+" + x2 + " = " + (x1 + x2));
            } 
            else if (opr.equalsIgnoreCase("sub")) {
                System.out.println(x1 + "-" + x2 + " = " + (x1 - x2));
            } 
            else {
                System.out.println("error");
            }

        }
    }
}
