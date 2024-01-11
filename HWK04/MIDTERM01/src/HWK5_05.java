class Point {
    int x, y;
    void set(int a, int b) {
        this.x = a;      this.y = b;
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

public class HWK5_05 {
    public static void main(String[] args) {
        int[] x = {2, 5, 7, 6, 1};
        int[] y = {1, 1, 4, 5, 3};
        Point[] points = new Point[5]; // 儲存多邊形的各頂點
        // ----- 多邊形頂點(2,1), (5,1), …  -----
        for (int i=0; i<points.length; i++){
             points[i]= new Point();
        }
        initPolygon(points, x, y); // 利用x[],y[]設定多邊形
        printPolygon(points);
        double boundary = polygonBoundary(points);
        System.out.println("boundary=" + boundary);
    }

    public static void initPolygon(Point[] ps, int[] x, int[] y) { // 4%
        for (int i=0; i<ps.length;i++){
            ps[i].set(x[i],y[i]);
        }
    }
    public static void printPolygon(Point[] points) { // 5%
        // DIY here
        for (int i=0; i<points.length; i++){
            if (i==points.length-1)System.out.println(points[i]);
            else System.out.print(points[i]+",");
        }
    }
    public static double polygonBoundary(Point[] points) { // 7%
        // 計算多邊形的週長，DIY here
        double tot=0;
         for (int i=0; i<points.length; i++){
             tot+= Math.sqrt(Math.pow(points[i].x-points[(i+1)%points.length].x,2)+Math.pow(points[i].y-points[(i+1)%points.length].y,2));
             
         }

        return tot;
    }
}
/* [程式輸出]
(2,1)(5,1)...
boundary=??? (自己算，互相對答案)
*/
