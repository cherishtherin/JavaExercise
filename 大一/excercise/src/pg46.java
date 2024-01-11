
import java.util.*;

public class pg46 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String choose = cin.next();
        if (choose.equals("a")) {
            System.out.print("r,c=");
            int r = cin.nextInt();
            int c = cin.nextInt();
            for (int rr = 1; rr <= r; rr++) {
                for (int cc = c; cc > 0; cc--) {
                    System.out.print(cc + " ");
                }
                System.out.println();
            }

        } else if (choose.equals("b")) {
            System.out.print("h=");
            int h = cin.nextInt();
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        } else if (choose.equals("c")) {
            System.out.print("h=");
            int h = cin.nextInt();
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= 6 - i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        } else if (choose.equals("d")) {
            System.out.print("h=");
            int h = cin.nextInt();
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= 4 - i; j++) {
                    System.out.print(" ");

                }
                for (int z = 1; z <= i; z++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
