import java.util.*;
public class HWK2_409630497_02 {
    public static void main (String[]args){
    Scanner cin = new Scanner(System.in);
        System.out.print("input x :");
        int x=cin.nextInt();
        double fx= formula(x);
        System.out.print("f("+x+") :"+fx);
    }
    public static double formula(int x){
        double fx;
        if(x>3){
            fx=x*x;
        }
        else if(x<-3){
            fx= Math.pow(x,5)+2*Math.pow(x,4);
        }
        else{
            fx= Math.sqrt(Math.abs(x));
        }
        return fx;
    }
}
