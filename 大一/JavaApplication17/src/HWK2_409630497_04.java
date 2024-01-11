import java.util.*;
public class HWK2_409630497_04 {
    public static int []monthDays= {0,31,28,31,30,31,30,31,31,30,31,30,31};    
    public static void main (String[]args){
        int diff= diffinDays(1998,7,7,2008,4,30);
        System.out.println("diff days = "+diff);
    }
    public static boolean isLeapYear(int year){
            return (year%400==0)||(year%4==0&&year%100!=0);
            
    }
    public static int DaysofTheYear(int y, int m, int d){
        int days=d;
        for(int i=1; i<m-1;i++) days+=monthDays[i];
        if(isLeapYear(y)&&m>2)days++;
        return days;
    }
    public static int diffinDays(int y1, int m1, int d1, int y2, int m2, int d2){
        int x,y,z;
        x=365-DaysofTheYear(y1,m1,d1);
        if(isLeapYear(y1))x++;
        z=DaysofTheYear(y2,m2,d2);
        
        int cntLeap=0;
        for (int i=y1+1; i<y2;i++){
            if(isLeapYear(i))cntLeap++;
        }
        y = 365*(y2-y1-1)+cntLeap;
        return x+y+z;
    }
}
