
public class HWK2_409630497_02 {
    public static void main(String[] args) {
        printGCD(98, 28, 84, 182); // GCD=14, 印出4個數的gcd，不用回傳結果

        int[] counts = {3, 2, 6, 4, 3, 5, 1};
        char[] symbol = {'+', '-', '@'};
        printSymbol(counts, symbol); // 印出+++--@@@@@@++++---@@@@@+
    }
    public static void printGCD(int a, int b, int c, int d) {
        int gcd1 = 0,gcd2=0, gcd=0;
        
        int less=a;
        if(b<a)less=b;
        for (int i=2; i<=less; i++){
            if(a%i==0&&b%i==0)gcd1=i;
        }
        less=c;
        if(d<c)less=d;
        for (int i=2; i<=less; i++){
            if(c%i==0&&d%i==0)gcd2=i;
        }
        less=gcd1;
        if(gcd2<gcd1)less=gcd2;
        for (int i=2; i<=less; i++){
            if(gcd1%i==0&&gcd2%i==0)gcd=i;
        }
        System.out.println(gcd);
    }
    public static void printSymbol(int[] counts, char[] symbol) {
        for (int i=0; i<counts.length; i++){
            
            for (int j=0; j<counts[i]; j++){
                int x=i;
                while(x>=symbol.length){
                    x=i-symbol.length;
                }
                System.out.print(symbol[x]);
            }
        }
    }  
}
