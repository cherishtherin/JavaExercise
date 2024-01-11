

import java.util.* ;
public class P03_EX_TestArea{
    public static void main(String[] args) {
//	 …使用者輸入三角形三頂點座標 -2 1 5 1 1 7 
Scanner cin =new Scanner (System.in);
         int[] d = new int[6] ; 
	 double x1, y1, x2, y2, x3, y3; 
         System.out.println("input (x1, y1) :");
         x1=cin.nextDouble();
         y1=cin.nextDouble();
         x2=cin.nextDouble();
         y2=cin.nextDouble();
         x3=cin.nextDouble();
         y3=cin.nextDouble();
	 double a,b,c;
         a = dist(x1,y1,x2,y2); b=dist(x2,y2,x3,y3); c=dist(x3,y3,x1,y1);
	 double area = triangleArea(a,b,c) ; // 海龍公式計算面積
	 System.out.println("area="+area) ;
    }
    // DIY here, dist(x1,y1,x2,y2)
    public static double dist(double x1, double y1, double x2, double y2){
        double x,y;
        x= x2-x1;
        y= y2-y1;
        return Math.sqrt(Math.pow (x,2)+Math.pow(y,2));
        
    }
    public static double triangleArea(double a , double b, double c){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
     
}
