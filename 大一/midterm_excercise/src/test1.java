
public class test1 {

    public static void main(String[] args) {
        double dist = dist(1, 1, 3, 3); // (1,1),(3,3)之距離
        System.out.printf("dist=%.3f\n", dist);

        // 三角形三頂點: (-1,1),(3,1),(0,8)，計算其面積
        double area3 = triArea(-1, 1, 3, 1, 0, 5);
        System.out.printf("triArea=%.3f\n", area3);
        // 四邊形四頂點: (-4,1)(5,1)(2,6)(-2,6)，計算其面積
        double area4 = quadArea(-4, 1, 5, 1, 2, 6, -2, 6);
        System.out.printf("quadArea=%.3f\n", area4);
    }

    public static double dist(int x1, int y1, int x2, int y2) {
        int x, y;
        x = x2 - x1;
        y = y2 - y1;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double triArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a, b, c;
        a = dist(x1, y1, x2, y2);
        b = dist(x1, y1, x3, y3);
        c = dist(x3, y3, x2, y2);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b )* (s - c));
    }

    public static double quadArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double s1, s2;
        s1 = triArea(x1, y1, x2, y2, x3, y3);
        s2 = triArea(x1, y1, x4, y4, x3, y3);
        return s1 + s2;
    }
}
