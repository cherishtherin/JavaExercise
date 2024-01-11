import java.awt.Point ;
class Shape { 
	private Point p1 ; //形狀的左上角座標，或多邊形的第一個點
	protected void set(Point p) { this.p1 = p ;}
	protected Point get() { return p1 ; }
        @Override
        public String toString(){
            return "("+this.p1.x+","+this.p1.y+")";
        }
}
class Circle     extends Shape            { 
    // DIY: 變數宣告
    private int r;
    private Point center;
    public void set (Point p, int d){
        super.set(p);
        r= d/2;
        
    }
    public double calArea(){
        
        return Math.PI*r*r;
    }
    public String toString(){
        Point cent=super.get();
        return "center:"+super.toString()+"  r: "+r;
    }
    // DIY: 函數定義

}
class Triangle       extends Shape            { 
    // DIY: 變數宣告
    Point p1, p2;
    public void set(Point[] p){
        super.set(p[0]);
        p1=p[1];
        p2=p[2];
    }
    public double calArea(){
        Point pp= super.get();
        
        double a=Math.sqrt(((pp.x-this.p1.x)*(pp.x-this.p1.x))+((pp.y-this.p1.y)*(pp.y-this.p1.y)));
        double b=Math.sqrt(((this.p2.x-this.p1.x)*(this.p2.x-this.p1.x))+((this.p2.y-this.p1.y)*(this.p2.y-this.p1.y)));
        double c=Math.sqrt(((pp.x-this.p2.x)*(pp.x-this.p2.x))+((pp.y-this.p2.y)*(pp.y-this.p2.y)));
        double s=(a+b+c)/2;

        return Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    }
    // DIY: 函數定義
    @Override
    public String toString(){
        return super.toString()+"\t("+p1.x+","+p1.y+")"+"\t"+"("+p2.x+","+p2.y+")";
    }
	
}
public class HWK10_03 {
    public static void main(String[] args) {
	Circle c = new Circle() ;
	c.set(new Point(10,10), 8) ;
	System.out.println("Circle Area="+c.calArea());
	System.out.println(c) ; // center:(14,14), r=4
        
	Triangle t = new Triangle() ;
	Point[] ps = 
		{new Point(-3,0), new Point(2,0), new Point(1,7)}; 
	t.set(ps) ;
	System.out.println("Triangle Area="+t.calArea());
	System.out.println(t) ; // {(-3,0)(2,0)(1,7)}
    }
}
