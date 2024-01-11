class Point { 
    int x, y ; 
    void set(int a, int b) {this.x=a; this.y=b; }
    double dist(Point p2) { //計算本物件(this)與p2的距離
        return Math.sqrt((this.x-p2.x)*(this.x-p2.x)+(this.y-p2.y)*(this.y-p2.y));
    }
    public String toString() {	return "("+this.x+","+this.y+")";}	
}

class Polygon { 
    Point[] ps ; //記錄多邊形的頂點座標
    void init(int[] x, int[] y){ //利用(x[0],y[0]),(x[1],y[1])… 設定頂點
        ps= new Point[x.length];
        for (int i=0; i<ps.length; i++){
            ps[i]=new Point();
            ps[i].set(x[i],y[i]);
        }
    } 
    double circumference() {
        int sum=0; 
        
    for (int i=0; i<ps.length; i++){
        sum+=ps[i].dist(ps[(i+1)%ps.length]);
    }
        return sum ;
    }
    double area() { // DIY: 計算此多邊形面積, 9%
        double total=0;
        double [] a=  new double[ps.length-2];
        for (int i=0; i<a.length; i++){
            
                double d1,d2,d3;
                d1=ps[0].dist(ps[i]);
                d2=ps[i].dist(ps[(i+1)%ps.length]);
                d3=ps[(i+1)%ps.length].dist(ps[0]);
            double s=d1+d2+d3/2;
            a[i]=Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
        }
        for (int i=0; i<a.length; i++){
            total+=a[i];
        }
        return total ;
    }
    void display(String header) { // DIY: 印出多邊形header:(x0,y0)(x1,y1)…
        // DIY, 4%
        System.out.print(header);
        for(int i=0; i<ps.length; i++){
            System.out.print(ps[i].toString()+" ");
        }
        System.out.println("");
        
        
    }
} 
public class HWK6_409630497_02 {
    public static void main(String[] args) {
        Polygon pg = new Polygon() ;
        int[] x = {2, 5, 7, 6, 1} ;
        int[] y = {1, 1, 4, 5, 3} ; 
        pg.init(x,y) ; // 利用(x[0],y[0]),(x[1],y[1])… 設定頂點
        pg.display("pg=") ;
        double border = pg.circumference() ;
        System.out.println("border of pg="+border) ;
        System.out.println("area of pg ="+pg.area()) ;
    }
}


