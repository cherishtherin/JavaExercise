
/*
(1) 定義Time類別以記錄時間，類別中含有三個整數欄位，分別是h, m與s
(2) 產生二個Time物件time1與time2，分別記錄以下二個時間: 17:30:30與5:45:55
(3) 印出這二個時間
	[輸出]: time1= 17:30:30	time2=5:45:55
(4) 再計算並印出這二個時間的差
	[輸出]: difference of time1 and time2 is 11:44:35

*/
class Time{
    int h,m,s;
}
public class P146_EX3_TestTime {
    public static void main(String[] args) {
        
        Time t1,t2,d;
        //: time1= 17:30:30 time2=5:45:55 diffs 11:44:35

        t1= new Time();
        t1.h=17;
        t1.m=30;
        t1.s=30;
        System.out.println("time 1 "+t1.h+":"+t1.m+":"+t1.s);
        t2= new Time();
        t2.h=5;
        t2.m=45;
        t2.s=55;
        System.out.println("time 2 "+t2.h+":"+t2.m+":"+t2.s);
        d= new Time();
        d.s=t1.s-t2.s;if(d.s<0){
            d.s+=60;
            t1.m-=1;
        }
        
        d.m=t1.m-t2.m;if(d.m<0){
            d.m+=60;
            t1.h-=1;
        }
        
        d.h=t1.h-t2.h;
        
        
        System.out.println("time diff "+d.h+":"+d.m+":"+d.s);
    }
   
}
