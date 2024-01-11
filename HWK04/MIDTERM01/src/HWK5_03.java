
class Frac {

    int up, down;

    void set(int u, int d) {
        this.up = u;
        this.down = d;
    }

    int gcd() {
        int less = up;
        if (down < up) {
            less = down;
        }
        int gcd=1;
        for (int i = 2; i <= less; i++) {
            if (up % i == 0 && down % i == 0) {
                gcd = i;
            }
        }
        return gcd;

    }

    Frac add(Frac f2) {  // 5%
        // 回傳this, f2二個分數相加的結果，也是個分數物件
        // DIY here
        Frac x3 = new Frac();
        x3.up = (up * f2.down) + (down * f2.up);
        x3.down = down * f2.down;
        int gcd = x3.gcd();
        x3.up /= gcd;
        x3.down /= gcd;

        return x3; // 自行修改本行
    }

    Frac mul(Frac f2) { // 5%
        Frac f3 = new Frac();
        f3.up = f2.up * up;
        f3.down = f2.down * down;
        int gcd = f3.gcd();
        f3.up /= gcd;
        f3.down /= gcd;
        return f3; // 自行修改本行
    }

    void print(String header) {  // 3%
        System.out.println(header + up + "/" + down);
    }
}

public class HWK5_03 {

    public static void main(String[] args) {
        Frac f1 = new Frac(), f2 = new Frac();
        f1.set(3, 5);
        f2.set(10, 9); //f1=3/5,  f2=10/9
        f1.print("f1=");
        f2.print("f2=");
        Frac f3 = f1.add(f2); // f3 = f1+f2 
        Frac f4 = f1.mul(f2); // f4 = f1*f2
        if (f3 != null && f4 != null) {
            f3.print("f3=f1+f2=");
            f4.print("f4=f1*f2=");
        } else {
            System.out.println("f3, f4 is null!");
        }
    }
}
/* [程式輸出]
f1=3/5
f2=10/9
f3=f1+f2=77/45
f4=f1*f2=2/3
 */
