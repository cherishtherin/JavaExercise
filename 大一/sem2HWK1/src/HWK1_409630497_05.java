import java.util.*;
public class HWK1_409630497_05 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        int n,k;
        String ask="y";
        while(ask.equals("y")){
        System.out.print("n, k:");
        n= cin.nextInt();
        k= cin.nextInt();
        double val= cnk(n,k);
        System.out.println("Cnk ("+n+","+k+") = "+val);
        System.out.print("Continue(y,n)? ");
        ask=cin.next();
        
        }
        System.out.println("Bye!");
        
    }
    public static double cnk(int n, int k){
        int nval=1, kval=1;
        for(int i=0; i<k; i++){
            nval*=(n-i);
            kval*=(k-i);
        }
        return nval/kval;
    }
}
