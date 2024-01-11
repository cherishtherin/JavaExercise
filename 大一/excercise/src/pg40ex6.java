import java.util.*;
public class pg40ex6 {
    public static void main(String[]args){
    Scanner cin= new Scanner(System.in);
    while (true){
    double r, t;
        System.out.println("本金,年利息,期數:");
         int a=cin.nextInt();
         r=cin.nextDouble();
         int p= cin.nextInt();
         t= a*Math.pow((1+r),p)-a;
         t=t/p;
         System.out.println("年利息收入:"+(int)t);
         System.out.println("===continue?(y/n)");
         String c=cin.next();
        if(c.equals("n"))break;
    
    }
    }
}
