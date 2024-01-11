
public class HWK2_02 {
    public static void main(String[] args) {
        printGCD(98, 28, 84, 182); // GCD=14, 印出4個數的gcd，不用回傳結果

        int[] counts = {3, 2, 6, 4, 3, 5, 1};
        char[] symbol = {'+', '-', '@'};
        printSymbol(counts, symbol); // 印出+++--@@@@@@++++---@@@@@+
    }
    public static void printGCD(int a, int b, int c, int d) {
        System.out.println(gcd(gcd(a,b),gcd(c,d)));
    }
    public static int gcd(int x, int y){
        int gcd=1;
        int less= x; 
        if (y<x)less=y;
        for (int i=2; i<=less; i++){
            if(x%i==0&&y%i==0)gcd=i;
        }
        return gcd;
    }
    public static void printSymbol(int[] counts, char[] symbol) {
//        int dex=0;
//        for (int i=0; i<counts.length; i++){
//            int times=counts[i];
//            if(dex>=symbol.length)dex=0;
//            while(times>0){
//            System.out.print(symbol[dex]);
//            times--;
//        }
//            dex++;
//    }  
            for (int i=0; i<counts.length ; i++){
                for (int j=0; j<counts[i];j++){
                    System.out.print(symbol[i%3]);
                }
            }
    }
}
