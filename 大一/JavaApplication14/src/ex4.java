import java.util.*;
public class ex4 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        int a,b,min, gcd=0, lcm;
        System.out.println("input a,b:");
         a= cin.nextInt();
         b= cin.nextInt();
         if (a<b){ min=a;}
            else {min=b;}
            
         for (int i=1; i<=min; i++){
             if(a%i==0 &&b%i==0)
                gcd=i;
            
         }
                    lcm= a*b/gcd;
                    System.out.println("gcd= "+gcd+"lcm"+lcm);
    }
}
