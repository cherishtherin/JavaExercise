class Frac { 
    int up, down; 
    int gcd;
    static void set (Frac f, int u, int d){};
    static void print(String t, Frac f){};
    static void reduce (Frac f){};
    // DIY here, 以靜態函數定義 set(), reduce(), print()
}
public class HWK4_409630497_03 {
    public static void main(String[] args) {
        Frac f1 = new Frac();
         set(f1, 15, 30); 
         print( "f1=", f1) ; // 印出f1=15/30
        
         reduce(f1) ; 
         print( "f1=", f1) ; // 印出f1=1/2
    }
    // 完成set(), reduce(), print()
    static void set(Frac f,int u, int d){
        f.up=u;f.down=d;
    }
    static void print (String t, Frac f){
        System.out.println(t+"="+f.up+"/"+f.down);
    }
    static int gcd(int a, int b) { 
        int x= a;
        if(b<a)x=b;
        int t=3;
        for (int i=2; i<=x; i++){
            if (a%i==0&&b%i==0)t=i;
        }
        return t; 
    } 
    static void reduce (Frac f){
        f.gcd=gcd(f.up,f.down);
        f.up=f.up/f.gcd;
        f.down=f.down/f.gcd;
        
    }
}

