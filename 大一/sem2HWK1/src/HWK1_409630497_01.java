import java.util.*;
public class HWK1_409630497_01 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        double x=1,y=1;
        
        while(x!=0&& y!=0){
        System.out.println("input x, y :");
        x= cin.nextDouble();
        y= cin.nextDouble();
        double z= formula(x,y);
            System.out.println("z = "+z);
        }
    }
    public static double formula(double x, double y){
        return Math.cbrt(Math.pow(Math.abs(x-y),3)+ Math.pow(Math.abs(x+y),3)  );
    }
    
}
