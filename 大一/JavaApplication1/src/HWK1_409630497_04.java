import java.util.*;
public class HWK1_409630497_04 {
    public static void main (String []args){
        Scanner cin = new Scanner(System.in);
        double a,b,c;
        System.out.println("Input a, b, c:");
        a=cin.nextDouble();
        b=cin.nextDouble();
        c=cin.nextDouble();
        double d,x1,x2;
        if (b*b-4*a*c <=0){
            System.out.println("x為虛數");
        }
        else {
        d=Math.sqrt(b*b-4*a*c);
        x1=(-b+d)/(2*a);
        x2=(-b-d)/(2*a);
        System.out.println("x1=" + x1 +"\t"+"x2=" + x2);
        }
    }
    
}
