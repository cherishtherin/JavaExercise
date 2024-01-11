import java.util.*;
public class hwk1_03 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        while(true){
            int a,b,c;
            System.out.print("input a, b, c : ");
            a= cin.nextInt();
            b = cin.nextInt();
            c = cin.nextInt();
            double area= area(a,b,c);
            System.out.println("area : "+area);
        }
    }
    public static double area(int a, int b, int c){
        double s=( a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
