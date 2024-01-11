public class MI1A_XX_03 {
        public static void main(String[] args) {
        int diff1 = diffInDays(718, 125) ; // 7/18與1/25相差幾天
        int diff2 = diffInDays(1201, 201) ; // 12/01與2/01相差幾天
        System.out.println("----- diffInDays(date1, date2)--- 7%");
        System.out.println("Days between 07/18 and 1/25="+diff1);
        System.out.println("Days between 12/01 and 2/01="+diff2);
        
        System.out.println("----- dayOfTheWeek(m, d)--- 6%");
        System.out.println("2021/4/16 is "+dayOfTheWeek(4, 16));
        System.out.println("2021/12/25 is "+dayOfTheWeek(12, 25));
        
    }    
    public static int diffInDays(int date1, int date2) { 
        int [] monthDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int d1, d2, m1, m2;
        d1=date1%100;
        d2=date2%100;
        m1=date1/100;
        m2=date2/100;
        int a,b=0,c;
        a=monthDays[m2]-d2;
        for(var i=(m2+1); i<m1; i++){
            b+=monthDays[i];
        }
        c=d1;  
        return a+b+c; 
    }
    public static String dayOfTheWeek(int m, int d) { // 6%
        // 計算並傳回2021/m/d是星期幾，已知2021/1/3是星期天
        int date1=m*100+d,date2=103;
        int diff=diffInDays(date1, date2);
        String[] dayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"} ;
        int a=diff%7;
        
        return dayWeek[a]; // DIY 
    }
}
