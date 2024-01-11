
class Frac {

    int up, down;

    static int gcd(int a, int b) {
        
        int less = a;
        if (b < a) {
            less = b;
        }
        int gcd = 1;
        for (int i = 2; i <= less; i++) {
            if (a % i == 0 & b % i == 0) {
                gcd = i;
            }
        }
        return gcd; // DIY 
    }
    // DIY here, 以靜態函數定義 set(), reduce(), print()
}

public class HWK4_03 {

    public static void main(String[] args) {
        Frac f1 = new Frac();
        set(f1, 15, 30);
        print("f1=", f1); // 印出f1=15/30

        reduce(f1);
        print("f1=", f1); // 印出f1=1/2
    }

    static void set(Frac f, int a, int b) {
        f.up = a;
        f.down = b;
    }

    static void print(String s, Frac f) {
        System.out.println(s + f.up + "/" + f.down);
    }
    static int gcd(int a, int b) {
        
        int less = a;
        if (b < a) {
            less = b;
        }
        int gcd = 1;
        for (int i = 2; i <= less; i++) {
            if (a % i == 0 & b % i == 0) {
                gcd = i;
            }
        }
        return gcd; // DIY 
    }
    static void reduce(Frac f) {
        int gcd= gcd(f.up,f.down);
        f.up/=gcd;
        f.down/=gcd;
    }
    // 完成set(), reduce(), print()
}
