/* P.27 
EX3: 依照以下步驟撰寫程式(TestTime.java)
(1) 定義Time類別以記錄日期，類別中含有三個整數欄位，分別是h,m,s
(2) 產生二個Time物件t1與t2，分別記錄以下二個時間: 23:50:25, 9:30:45
(3) 印出這二個時間
	[輸出]: time1=23:20:25,  time2=09:30:45
(4) 再計算並印出這二個時間差多少? 仍以h:m:s格式輸出 (假設都是當天時間)
	[輸出]: difference between time1 and time2 is 13:49:40
 */
class Time {

    int h, m, s;

    Time(int a, int b, int c) {
        h = a;
        m = b;
        s = c;
    }
    

}

public class HWK4_01 {

    public static void main(String[] args) {
        Time t1 = new Time(23, 20, 25);
        Time t2 = new Time(9, 30, 45);
        System.out.printf("Time 1: %02d:%02d:%02d%n", t1.h, t1.m, t1.s);
        System.out.printf("Time 2: %02d:%02d:%02d%n", t2.h, t2.m, t2.s);
        Time t3=timeDiff(t1,t2);
        System.out.printf("difference between time1 and time2 is %02d:%02d:%02d%n", t3.h, t3.m, t3.s);
        
    }
    public static Time timeDiff(Time t1, Time t2){
       Time x= new Time(0,0,0);
       if(t1.s<t2.s){
           t1.s+=60;
           t1.m--;
       }
       if(t1.m<t2.m){
           t1.m+=60;
           t1.h--;
       }
       x.h=t1.h-t2.h;
       x.m=t1.m-t2.m;
       x.s=t1.s-t2.s;
       
        
       return x; 
    }
    
}
