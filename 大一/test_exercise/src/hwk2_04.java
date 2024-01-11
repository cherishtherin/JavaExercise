import java.util.*;
public class hwk2_04 {
    public static int[] monthDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public static void main (String[]args){
        int diff= diffInDays(1998,7,7,2008,4,30);
        System.out.println("diff in Days:"+diff);
        
    }
    public static boolean isLeapYear(int year){
        return (year%4==0 &&year%100!=0)|| (year%400==0);
    }
    public static int dayofYear(int y, int m, int d){
        int days=0;
        for (int i=0; i<m; i++){
            days+=monthDays[i];
        }
        if(m>2&&isLeapYear(y))days++;
        return days+=d;
        
    }
    public static int diffInDays(int y1, int m1, int d1, int y2, int m2, int d2){
        int beg, mid=0, end;
        end=dayofYear(y2,m2,d2);
        for(int i=y1; i<=y2; i++){
            if(isLeapYear(i))mid++;
        }
        mid=mid+(y2-y1-1)*365;
        
        beg =365-dayofYear(y1,m1,d1);
        if(isLeapYear(y1)&&m1>2)beg++;
        return beg+mid+end;
    }
}
