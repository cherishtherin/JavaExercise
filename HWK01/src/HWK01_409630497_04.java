import java.util.*;

public class HWK01_409630497_04 {
    public static int[] monthDays={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        System.out.print("First does, y/m/d=");
        int y,m,d;
        y=cin.nextInt();
        m=cin.nextInt();
        d=cin.nextInt();
        int y2=y,m2=m,d2;
        d2=d+56;
        d2=d2-(monthDays[m]-d);
         m2++;
         if(m2==13){
                m2=1;
                y2=y+1;
            }
         while( d2>monthDays[m2]){
            d2=d2-monthDays[m2];
            m2++;
            if(m2==13){
                m2=1;
                y2=y+1;
            }
        }
        System.out.print("Date of second dose:");
        System.out.print(y2+" "+m2+" "+d2);
    }
}
