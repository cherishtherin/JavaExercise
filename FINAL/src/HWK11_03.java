
import java.awt.Point ;
class Shape {
    protected Point p ; // 記錄形狀的左上角座標
    protected double w, h ;
    void set(Point ul, double w, double h) {
        // DIY, 設定左上座標與w,h, ul: up-left
        this.p=ul;
        this.w=w;
        this.h=h;
    } 
    // 二個無用的函數，需要後代類別來覆蓋(Override)
    double calArea() { return -1 ; } // 不知道是何形狀，所以回傳-1
    
    @Override
    public String toString() { return p+","+w+","+h ; }
} 
class Ellipse extends Shape { // 橢圓形
    // DIY here, toString(), calArea()
    void set(Point ul, int w, int h){
        super.set(ul, w, h);
    }
    @Override
    public double calArea(){
        return Math.PI*this.h/2*this.h/2;
    }
    @Override
    public String toString(){
    return "center:("+this.p.x+", "+this.p.y+") , r1= "+this.w/2+", r2= "+this.h/2;

    }
}
public class HWK11_03 {
    public static void main(String[] args) {
        Ellipse e = new Ellipse() ;
        e.set(new Point(5, 10), 8, 10) ; 
        System.out.println("e="+e); // 印出e= center:(9,15), r1=4, r2=5
        System.out.println("area of c ="+e.calArea()) ; // 印出面積
    }
}



