import java.util.*;
public class HWK1_409630497_05 {
      public static void main (String []args){
          Scanner cin= new Scanner(System.in);
          double a,b,c,s,area;
        
          System.out.println("Lenght of three edges=");
          a = cin.nextDouble();
          b = cin.nextDouble();
          c = cin.nextDouble();
          s = (a+b+c)/2;
          area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println("Area=" + area);
      }
}
