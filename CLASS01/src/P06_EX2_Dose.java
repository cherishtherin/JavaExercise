import java.util.*;
public class P06_EX2_Dose {
    public static int[] monthDays={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        int a, b;
        System.out.print("First does, y/m/d=");
        a= cin.nextInt();
        System.out.print("Date of second dose:");
        int d= a%100;
        int m= a/100%100;
         b=d+35;
        int d2=b-monthDays[m];
        int m2=m++;
        System.out.println(a/10000+" "+m2+" "+d2);
    }
}
