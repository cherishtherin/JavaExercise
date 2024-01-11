
import static java.lang.Math.*;

class Point { //平面上的一點

    double x, y; // 表示(x,y)座標

// 依照main()中的需求完成set(), distance(), onTheLine(), toString()函數
// 完成後，自行解開main()的註解
// set(x,y)設定點的座標, 3%
// distance(p2): 計算this與p2的距離, 5%
    void set(int a, int b) {
        this.x = a;
        this.y = b;
    }
    double distance(Point p){
        return Math.sqrt (Math.pow((p.x-this.x),2)+Math.pow(p.y-this.y,2));
    }
    boolean onTheLine(Point p2, Point p3) { // 7%

// 判別this, p2, p3這三個點是否在同一線上
// y=mx+b, m=(y2-y1)/(x2-x2), b = y-mx
    double m=(p3.y-p2.y)/(p3.x-p2.x);
    double b=p3.y-m*p3.x;
    
        return this.y==m*this.x+b; // DIY, 請修改本行

    }

    public String toString() { // 3%

// 依照程式輸出，回傳符合格式的<字串>
        return "(" + x + "," + y + ")"; // DIY

    }

}

public class MID2 { // XX是你的成績座號

    public static void main(String[] args) {

        System.out.println("== 測試set() === 3%");

        Point p1 = new Point(), p2 = new Point();

        p1.set(15, 13);
        p2.set(7, 5);
        System.out.println("== 測試toString()== 3%");

        System.out.println("p1=" + p1 + ", p2=" + p2);

        System.out.println("== 測試二點間的距離distance()== 5%");

        double dist = p1.distance(p2);
        System.out.printf("distance of p1 and p2= %.2f%n" , dist);
        System.out.println("== 測試三點共線 == 7%");

        Point p3 = new Point();

 p3.set(40, 38) ;
 System.out.println("p3(40,30).onTheLine(p1,p2)? "+p3.onTheLine(p1, p2));
 p3.set(48, 50);
 System.out.println("p3(48,50).onTheLine(p1,p2)? "+p3.onTheLine(p1, p2));
    }

}

/*

[程式輸出]:

== 測試set() === 3%

== 測試toString() == 3%

p1=(15.0,13.0), p2=(7.0,5.0)

== 測試二點間的距離distance()== 5%
distance of p1 and p2=11.313708498984761

== 測試三點共線 == 7%

p3(40,30).onTheLine(p1,p2)? true

p3(48,50).onTheLine(p1,p2)? false

 */
