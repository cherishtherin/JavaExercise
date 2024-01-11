
import java.util.*;

public class P05_EX_Discount {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the price:");
        double x = cin.nextDouble();
        System.out.println("discount("+x+")="+discount(x)) ;
    }
    public static double discount (double x){
        if(x<500)return x;
        else if(x>=500&&x<1000)return 0.95*x;
        else if(x>=1000&&x<3000)return 0.90*x;
        else return x*0.8;
    }

}
