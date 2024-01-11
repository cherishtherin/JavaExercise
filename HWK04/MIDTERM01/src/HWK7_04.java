
import java.awt.*;

class ColorPoint {

    int x, y;
    Color c;

    ColorPoint() {
        this(0,0);
    }

    ColorPoint(int a, int b) {
        x = a;
        y = b;
        c = new Color(0, 0, 0);

    }
    ColorPoint(Point p){
        
    }
    ColorPoint(Point p, Color c) {

    }

    ColorPoint(ColorPoint cp) {

    }

    public String toString() {
        return "{(x,y)=" + x + "," + y + "), rgb=(" + c.getRed() + "," + c.getGreen() + "," + c.getBlue();
    }

}

public class HWK7_04 {

    public static void main(String[] args) {
        Point p = new Point(5, 3);
        ColorPoint[] cps = {
            new ColorPoint(), new ColorPoint(5, 3), new ColorPoint(p), new ColorPoint(p, Color.RED)};
        ColorPoint cp = new ColorPoint(cps);
        System.out.println(cp);

    }

    public static void printColorPoint() {

    }
}
