import java.util.*;
public class pg23 {
    public static void main(String[]args){
        Scanner cin= new Scanner (System.in);
        int a,b,c;
        System.out.println("input a,b,c:");
        a =cin.nextInt();
        b =cin.nextInt();
        c =cin.nextInt();
         
        double x1,x2,d;
        d=b*b-4*a*c;
        if(d<0){
            x1= (-b+(Math.sqrt(-d)))/(2*a);
            x2= (-b-(Math.sqrt(-d)))/(2*a);
            System.out.println("x1="+x1+"i");
            System.out.println("x2="+x2+"i");
        }
        else{
            x1= (-b+(Math.sqrt(d)))/(2*a);
            x2= (-b-(Math.sqrt(d)))/(2*a);
            
           
             System.out.println("x1="+x1+"i");
            System.out.println("x2="+x2+"i");
           
        }
        
        
    } 
}
