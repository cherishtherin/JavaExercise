
import java.util.*;

public class test3 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double a, b, c;
        a = cin.nextDouble();
        b = cin.nextDouble();
        c = cin.nextDouble();

        if (a == 0 || b == 0 || c == 0) {

        } else {
            if (b < 0 && c < 0) {
                System.out.println(a + "x+" + b + "y" + c + "=0");
            } else if (b < 0 || c < 0) {
                if (b < 0) {
                    System.out.println(a + "x" + b + "y+" + c + "=0");
                } else if (c < 0) {
                    System.out.println(a + "x+" + b + "y" + c + "=0");
                }
            } else {
                System.out.println(a + "x+" + b + "y+" + c + "=0");
            }
        }
        System.out.println("input a (x,y) point:");
        double x, y, d, e, f;
        x = cin.nextDouble();
        y = cin.nextDouble();
        e = a * x + b * y + c;
        f = Math.sqrt(a * a + b * b);
        if (e <= 0) {
            d = -e / f;
            if(d==0){
                System.out.println("("+x+","+y+") is on the line");
            }
            else{
                System.out.println("distance of ("+x+","+y+") to the line is "+d);
            }

        } else {
            d = e / f;
            if(d==0){
                System.out.println("("+x+","+y+") is on the line");
            }
            else{
                System.out.println("distance of ("+x+","+y+") to the line is "+d);
            }
        }

    }
}
