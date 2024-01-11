import java.util.*;
public class HWK1_409630497_03 {
    public static void main (String[]args){
         Scanner cin = new Scanner(System.in);
         System.out.println("input:");
         String num= cin.next();
         if(num.length()<6){
         String a=num.substring(0,1);
         String b=num.substring(1,3);
         String c=num.substring(3,5);
         System.out.println("0"+a+":"+b+":"+c);}
         else
         {
         String a=num.substring(0,2);
         String b=num.substring(2,4);
         String c=num.substring(4,6);
         System.out.println(a+":"+b+":"+c);
                 }
    }
    
}
