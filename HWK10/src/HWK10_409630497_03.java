
import java.awt.Point;

class Shape {

    private Point p1; //形狀的左上角座標，或多邊形的第一個點

    protected void set(Point p) {
        this.p1 = p;
    }

    protected Point get() {
        return p1;
    }

}

class Circle {
    // DIY: 變數宣告

    // DIY: 函數定義
    int x, y, r;

    void set(Point p, int d) {
        this.x = p.x;
        this.y = p.y;
        this.r = d/2;

    }
    double calArea(){
        
        return Math.PI*r*r;
    }
    public String toString(){
       
        return "center:("+(x+r)+","+(y+r)+"), r="+r;
    }
}
class Triangle {
        // DIY: 變數宣告

        // DIY: 函數定義
    Point p1,p2,p3;
    
    void set(Point [] ps){
        p1=ps[0];
        p2=ps[1];
        p3=ps[2];
        
    }
    double calArea(){
        double s1,s2,s3,s;
        s1=Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
        s2=Math.sqrt(Math.pow(p3.x-p2.x,2)+Math.pow(p3.y-p2.y,2));
        s3=Math.sqrt(Math.pow(p3.x-p1.x,2)+Math.pow(p3.y-p1.y,2));
        s=(s1+s2+s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    public String toString(){
        
        return "{("+p1.x+","+p1.y+"), ("+p2.x+","+p2.y+"), ("+p3.x+","+p3.y+")}";
    }
    }
public class HWK10_409630497_03 {

        public static void main(String[] args) {
            Circle c = new Circle();
            c.set(new Point(10, 10), 8);
            System.out.println("Circle Area=" + c.calArea());
            System.out.println(c); // center:(14,14), r=4

            Triangle t = new Triangle();
            Point[] ps
                    = {new Point(-3, 0), new Point(2, 0), new Point(1, 7)};
            t.set(ps);
            System.out.println("Triangle Area=" + t.calArea());
            System.out.println(t); // {(-3,0)(2,0)(1,7)}
        }
    }

