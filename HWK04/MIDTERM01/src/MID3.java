
class Time {

    int h, m, s; // 將時間以h小時m分s秒來代表

    void set(int h, int m, int s) { // 4%
        this.h = h;
        this.m = m;
        this.s = s;
// 根據參數設定h, m, s, 並檢查此日期是否為合法時間(呼叫isValidTime())，
// 如果不是，再將時間設定為0:0:0

    }

     boolean isValidTime() { // 5%

// 檢查h,m,s是否為合法的h:m:s時間格式(注意: h可大於24小時)
// 如果是回傳true, 否則回傳false, 並印出"時間 is an invalid time"
        return s < 60 && s > 0 && m > 0 && m < 60 && h > 0; // DIY, 自行修改

    }

    static Time getTimeBySec(int sec) { // 6%

// 將秒數sec，轉換為對應之h:m:s時間格式，回傳Time物件
    Time x= new Time();
    x.h=sec/3600;
    x.m=sec%3600/60;
    x.s=sec%3600%60;
    
        return x;

    }

    Time diff(Time t2) { // 6%
        Time x= new Time();
        
        
        if(t2.s<this.s){
            t2.s+=60;
            t2.m--;
        }
        if(t2.m<this.m){
            t2.m+=60;
            t2.h--;
        }
        x.h=t2.h-this.h;
        x.m=t2.m-this.m;
        x.s=t2.s-this.s;
// 計算並回傳二個時間的差異，並以Time物件表示此差異
// 例如 15:30:30 與 3:29:29相差12:01:01
        return x;

    }

    public String toString() { // 3%

// 回傳一個字串，能正確顯示時間格式
        return String.format("%02d:%02d:%02d" ,this.h,this.m,this.s );

    }

}

public class MID3 {

    public static void main(String[] args) {

// 測試set()
        Time t1 = new Time(), t2 = new Time();

        t1.set(22, 58, 30);
        t2.set(29, 18, 25);

// 測試toString()
        System.out.println("t1=" + t1);

        System.out.println("t2=" + t2);

// 測試isValidTime()
        Time tx = new Time();

        tx.set(-20, 70, 90);

        if (tx.isValidTime())System.out.println("tx=" + tx+" is Valid");
        else System.out.println("tx=" + tx+" is not Valid");

// 測試getTimeBySec()
        Time t3 = Time.getTimeBySec(86522);

        System.out.println("t3=" + t3);

// 測試diff()
        Time t4 = t1.diff(t2);

        System.out.println("diff(t1,t2)=" + t4);

        t4 = t3.diff(t2);

        System.out.println("diff(t3,t2)=" + t4);

    }

}

/* [程式輸出]

t1=22:58:30

t2=29:18:25

-20:70:90 is an invalid time.

tx=00:00:00

t3=24:02:02

diff(t1,t2)=06:19:55

diff(t3,t2)=05:16:23

 */
