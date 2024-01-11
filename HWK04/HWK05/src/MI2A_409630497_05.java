
import java.util.*;

class Point {

    int x, y;

    void set(int a, int b) {
        x = a;
        y = b;
    }

}

public class MI2A_409630497_05 {

    public static void main(String[] args) {
        int[] x = {2, 5, 7, 6, 1};
        int[] y = {1, 1, 4, 5, 3};
        Point[] points = new Point[5];
        for (int i=0;i<points.length; i++){
            points[i]=new Point();
        }
        // ----- 多邊形頂點(2,1), (5,1), …  -----
        initPolygon(points, x, y); // 利用x[],y[]設定多邊形
        printPolygon(points);
        double boundary = polygonBoundary(points);
        System.out.printf("boundary=%.2f" , boundary);
    }
    
    public static void initPolygon(Point[] p, int[] x, int[] y) { // 4%
        // 利用(x[0],y[0]),(x[1],y[1])...來初始化多邊形ps[]
        for (int i = 0; i < p.length; i++) {
            p[i].set(x[i], y[i]);

        }

    }

    public static void printPolygon(Point[] p) { // 5%
        for (int i = 0; i < p.length; i++) {
            System.out.printf("(%d,%d)", p[i].x, p[i].y);
        }
        System.out.println("");
    }

    public static double polygonBoundary(Point[] p) { // 7%
        // 計算多邊形的週長，DIY here
        double sum=0;
        for (int i=0; i<p.length; i++){
            if(i==p.length-1)sum+=Math.sqrt(Math.pow(p[i].x-p[0].x,2)+Math.pow((p[i].y-p[0].y),2));
            else sum+=Math.sqrt(Math.pow((p[i].x-p[i+1].x),2)+Math.pow((p[i].y-p[i+1].y),2));
        }
        return sum;
    }
}
/* [程式輸出]
(2,1)(5,1)...
boundary=??? (自己算，互相對答案)
 */
