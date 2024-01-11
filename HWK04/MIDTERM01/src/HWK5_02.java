 class Time { // 24小時進制的時間
    int h, m, s ; // h: 0~23: m, s: 0~59
   
    public void set(int a, int b, int c) {
        if (a<0 || a>23 || b<0 || b>59 || c<0 ||c>59)
            h=m=s=0 ;
        else h=a;m=b;s=c;
    }
    void print(String t){
        System.out.println(t+h+":"+m+":"+s);
    }
    void inc(int x){
        int hr, min, sec;
        hr=x/3600;
        min=x%3600/60;
        sec=x%3600%60;
        h+=hr;
        m+=min;
        s+=sec;
        if(s>=60){
            s-=60;
            m++;
        }
        if(m>=60){
            m-=60;
            h++;
        }
        
    }
    int diff(Time t2){
        if(t2.s<s){
            t2.s+=60;
            t2.m--;
        }
        if(t2.m<m){
            t2.m+=60;
            t2.h--;
        }
        if(t2.h<h){
            t2.h+=24;
        }
        return (t2.h-h)*3600+(t2.m-m)*60+(t2.s-s);
    }
    // DIY here, 請依照main()中要求，完成print(), inc(), diff()
    // inc(): 5%
    // diff(): 6%
    // print(): 4%   
}
public class HWK5_02{
    public static void main(String[] args) {
        Time t1 = new Time(), t2 = new Time() ; 
        t1.set(17, 20, 30) ;		
        t2.set(6, 35, 45) ;
        t1.print("t2="); t2.print("t2=") ;
        t2.inc(5000) ; //將t2的時間向前撥5000秒
        t2.print("t2=") ; 
        int diff = t1.diff(t2) ; 
        System.out.println("diff of t1 and t2="+diff+" sec(s)") ; 
    }
}
/*[程式輸出] : t1.diff(t2): 若t1<t2，則計算t2-t1秒差，若t1>t2, 表示t2是明天的時間
t1 = 17:20:30
t2 = 06:35:45
t2 = 07:59:05
diff of t1 and t2 = 52715 sec(s) 
*/
