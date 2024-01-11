
import java.util.*;

public class HWK3_409630497_02 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("input w and h : ");
        int w, h;
        w = cin.nextInt();
        h = cin.nextInt();
        System.out.println("空或實 : ");
        
        char star = '*';
        drawRect(w, h, star, true);
        System.out.println("");
        drawRect(w, h, star, false);


    }

    public static void drawRect(int w, int h, char star, boolean fill) {

        if (!fill) {
            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= h; j++) {
                    if (i == 1 || i == w || j == 1 || j == h) {
                        System.out.print(star);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    System.out.print(star);
                }
                System.out.println("");
            }
        }
    }
}
