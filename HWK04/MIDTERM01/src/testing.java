
class Color {

    int r, g, b;

    Color() {
        r = g = b = 0;
    }

    Color(int x, int y, int z) {
        r = x;
        g = y;
        b = z;
    }
    Color(Color p){
        r=p.r;
        g=p.g;
        b=p.b;
    }
    public String toString(){
        
        return "("+r+","+g+","+b+")";
    }
}
class ColorPoint{
    int x, y;
    Color p;
    ColorPoint(){
       x=y=0;
       p= new Color();
    }
    ColorPoint (int x, int y, int r, int g, int b){
      this.x=x;
      this.y=y;
      p =new Color(r,g,b);
    }
    ColorPoint( ColorPoint px){
      this.x=px.x;
      this.y=px.y;
      p = new Color(px.p);
      
    
    }
    public String toString(){
        return "("+x+","+y+") color :"+p;
    }
}

public class testing {
    public static void main (String[]args){
        ColorPoint p1= new ColorPoint();
        ColorPoint p2= new ColorPoint(5,3,255,0,0);
        ColorPoint p3= new ColorPoint(p2);
        System.out.println(p1+"\t"+p2+"\t"+p3);
    }
}
