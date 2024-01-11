import java.util.*;
   
public class TestArea {
    public static void main(String[] args) {
// …使用者輸入三角形三頂點座標 -2 1 5 1 1 7 
    double x1=-2,y1=1, x2=5, y2=1, x3=1, y3=7;
    double a = dist(x1,y1,x2,y2), b=dist(x2,y2,x3,y3), c=dist(x3,y3,x1,y1) ;

    double area = triangleArea(a,b,c) ; // 海龍公式計算面積
    System.out.println("area="+area) ;
}
// DIY here, dist(), triangleArea()
    public static double dist(double x1,double y1, double x2, double y2){
        double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return d;
    }
    public static double triangleArea( double a, double b, double c){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}


