import java.util.*;
public class ex34 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        int []monthDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int y,m,d,date=0;
        System.out.print("input year, month, date: ");
        y= cin.nextInt();
        m=cin.nextInt();
        d=cin.nextInt();
        
        for(int i=1;i<m;i++){
            date+= monthDays[i];
        }
        date= date+d;
        System.out.println("day "+ date);
    }
}
