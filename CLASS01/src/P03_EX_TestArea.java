
import java.util.* ;
public class P03_EX_TestArea{
    public static void main(String[] args) {
	// …使用者輸入三角形三頂點座標 -2 1 5 1 1 7  
         int[] d = new int[6] ; 
	 double x1=-2, y1=1, x2=5, y2=1, x3=1, y3=7; 
	 double a = dist(x1,y1,x2,y2), b=dist(x2,y2,x3,y3), c=dist(x3,y3,x1,y1) ;
	 double area = triangleArea(a,b,c) ; // 海龍公式計算面積
	 System.out.printf("area= %.2f" ,area) ;
    }
    // DIY here, dist(x1,y1,x2,y2)
    
    public static double dist(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y2-y1),2));
    }
    public static double triangleArea(double a, double b, double c){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    // triangleArea(a,b,c)
    // triangle(x1,y1,x2,y2,x3,y3)
    // triangle(int[] pp) // pp[0]:x1, pp[1]:y1, .... ,pp[5]:y3
    // triangle(Point[] ps) // (ps[0].x, px[0].y), (ps[1].x, ps[1].y), (ps[2].x, ps[2].y)
}
