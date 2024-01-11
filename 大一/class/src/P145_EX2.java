
class Frac {
    int up, down;
}
public class P145_EX2 {
    public static void main(String[] args) {
        // 產生兩個分數f1: 3/5與f2:10/9，計算並印出f1+f2的結果
        Frac f1 = new Frac(),f2=new Frac();
        f1.up=3;
        f1.down=5;
        f2.up=10;
        f2.down=9;
        System.out.println(f1.up+"/"+f1.down+"+"+f2.up+"/"+f2.down+"="+(f1.up/+f1.down)+(f2.up/f2.down));
    }
}
