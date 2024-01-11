
class Point {

    int x, y;

    void set(int a, int b) {
        this.x = a;
        this.y = b;
    }

    double dist(Point p2) { //計算本物件(this)與p2的距離
        return Math.sqrt((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y));
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

class Polygon {

    Point[] ps; //記錄多邊形的頂點座標

    void init(int[] x, int[] y) { //利用(x[0],y[0]),(x[1],y[1])… 設定頂點
        ps = new Point[x.length];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new Point();
            ps[i].x = x[i];
            ps[i].y = y[i];
        }
    }
// DIY, 6%

    double circumference() {  // DIY: 計算此多邊形週長, 7%
        double cir = 0;
        for (int i = 0; i < ps.length; i++) {
            cir += Math.sqrt(Math.pow(ps[i].x - ps[(i + 1) % ps.length].x, 2) + Math.pow(ps[i].y - ps[(i + 1) % ps.length].y, 2));
        }
        return cir;
    }

    double area() { // DIY: 計算此多邊形面積, 9%
        double area = 0;
        int tri = ps.length - 2;
        for (int i = 0; i < tri; i++) {
            double a, b, c, s;
            a = Math.sqrt(Math.pow(ps[0].x - ps[i].x, 2) + Math.pow(ps[0].y - ps[i].y, 2));
            b = Math.sqrt(Math.pow(ps[i].x - ps[(i + 1) % ps.length].x, 2) + Math.pow(ps[i].y - ps[(i + 1) % ps.length].y, 2));
            c = Math.sqrt(Math.pow(ps[0].x - ps[(i + 1) % ps.length].x, 2) + Math.pow(ps[0].y - ps[(i + 1) % ps.length].y, 2));
            s= a+b+c/2;
            area+=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        }

        return area;
    }

    void display(String header) { // DIY: 印出多邊形header:(x0,y0)(x1,y1)…
        System.out.print(header);
        for (int i = 0; i < ps.length; i++) {
            System.out.print("(" + ps[i].x + "," + ps[i].y + ")  ");

        }
        System.out.println("");
// DIY, 4%
    }
}

public class HWK6_02 {

    public static void main(String[] args) {
        Polygon pg = new Polygon();
        int[] x = {2, 5, 7, 6, 1};
        int[] y = {1, 1, 4, 5, 3};
        pg.init(x, y); // 利用(x[0],y[0]),(x[1],y[1])… 設定頂點
        pg.display("pg=");
        double border = pg.circumference();
        System.out.printf("border of pg= %.2f%n", border);
        System.out.printf("area of pg =%.2f%n", pg.area());
    }
}
