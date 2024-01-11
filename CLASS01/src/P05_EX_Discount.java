import java.util.*;

public class P05_EX_Discount {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the price:");
        double x = cin.nextDouble();
        System.out.println("discount("+x+")="+discount(x)) ;
    }
    // DIY here, discount(x)
    public static double discount(double x){
        if(x>=3000)return 0.8*x;
        if(x>=1000)return 0.9*x;
        if(x>=500)return 0.95*x;
        return x;
    }
}
