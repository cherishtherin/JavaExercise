import java.util.*;
public class hwk1_01 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
       
        int x, y;
         while(true){
        System.out.print(" input x, y: ");
        x= cin.nextInt();
        y= cin.nextInt();
        if(x==0 && y==0)break;
        double z= Math.cbrt(Math.pow(Math.abs(x-y),3)+Math.pow(Math.abs(x+y),3));;
             System.out.printf("%.3f\n",z);
         }
        
    }
}
        
