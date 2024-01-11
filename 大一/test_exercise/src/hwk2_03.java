import java.util.*;
public class hwk2_03 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        System.out.print("input c, k: ");
        int c, k;
        c= cin.nextInt();
        k= cin.nextInt();
        double cnk= cnk(c,k);
        System.out.println("Cnk :"+cnk);
    }
    public static double cnk(int c, int k){
        int up=1, down=1;
        for (int i=c; i>c-k; i--){
            up*=i;
        }
        for(int i=1; i<=k; i++){
            down*=i;
        }
        return up/down;
    }
}
