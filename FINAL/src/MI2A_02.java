

import static java.lang.Math.*;


class Point {
    int x,y ; // 代表平面上的點 (x,y)    
    Point() { }
    Point(int a, int b) {this.x = a ; this.y=b ;}    
    Point (Point p2) { 
        this.x = p2.x ; this.y = p2.y ;
    }
    double dist(Point p2) { // 4%
        // 計算本物件與p2的距離
      return Math.sqrt(Math.pow(p2.y-this.y, 2)+Math.pow(p2.x-this.x, 2));
    }
    boolean lowerRight(Point p2) { // 4%
        // 判別p2是否在本物件的右下方，如果是，回傳true，否則回傳false
        if (p2.x>this.x&&p2.y<this.y)return true;
        
        return false;
        
    }
    static Point[] createPointArray(int[] x, int[] y) { // 6%
        // [功能]: 將使用傳來的陣列轉換為Point物件陣列，並回傳此Point[]陣列參考變數
        //         第一個點的座標(x[0],y[0])第二個(x[1],y[1)...
       
            Point [] arr=  new Point [x.length];
            for (int i=0; i<arr.length; i++){
                arr[i]= new Point(x[i],y[i]);
            }
//            arr[i].x=x[i];
//            arr[i].y=y[i];
        
        return arr; //自行修改此行
    }
    // 依照輸出格式，自行加入toString()函數, 3%
    
    public String toString(){
        //(5,3)
        return "("+this.x+","+this.y+")";
    }
}
public class MI2A_02{
    public static void main(String[] args) {
        Point p1 = new Point(5,3), p2 = new Point(12,-7) ;
        System.out.println("p1="+p1+", p2="+p2);
        Point p3= new Point(p1) ;
        System.out.println("p3="+p3);
        
        System.out.println("distance of p1 and p2="+ p1.dist(p2)) ;        
        if (p1.lowerRight(p2)) {
           System.out.println("p2 is in the lower right area of p1");
        } else {
            System.out.println("p2 is not in the lower right area of p1");            
        }
        
        // 使用靜態函數，組裝產生Point[]
        int[] x = {5,3,-7,12} ;
        int[] y = {12,8,9,10} ;
        Point[] ps = Point.createPointArray(x, y) ; // (x[0],y[0])(x[1],y[1)...
        
        System.out.print("ps[]=") ; 
        for (int i = 0 ; i<ps.length; i++) 
            System.out.print(ps[i]) ;
        System.out.println() ;        
    }
}
/* [程式輸出]
p1=(5,3), p2=(12,-7)
p3=(5,3)
distance of p1 and p2=12.206555615733702
p2 is in the lower right area of p1
ps[]=(5,12)(3,8)(-7,9)(12,10)
*/