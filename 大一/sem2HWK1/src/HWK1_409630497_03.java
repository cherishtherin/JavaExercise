import java.util.*;
public class HWK1_409630497_03 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        int a,b,c;
        
        System.out.println("input triangle sides:");
        a= cin.nextInt();
        b=cin.nextInt();
        c=cin.nextInt();
        double area = areaTriangle(a,b,c);
        System.out.println("area = "+area);
        
    
    }
    public static double areaTriangle(int a,int b,int c){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
}
