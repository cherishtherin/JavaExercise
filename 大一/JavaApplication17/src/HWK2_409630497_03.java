import java.util.*;
public class HWK2_409630497_03 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        System.out.println("input n, k: ");
        int n,k;
        n= cin.nextInt();
        k= cin.nextInt();
        int cn = formula(n,k);
        System.out.println("Cn = "+cn);
    }
    
    public static int formula(int n, int k){
        int up=1, down=1;
        for (int i=0; i<k; i++){
            up*=(n-i);
            down*=(k-i);
        }
        return up/down;
    }
}
