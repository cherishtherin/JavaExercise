
public class MID1 { // XX:成績座號

    public static void main(String[] args) {

// 撰寫一函數max3()，回傳三個整數的最大值, 5%
        int x = 5, y = 9, z = 6;

        int max = max3(x, y, z);

        System.out.println("max3(x,y,z)=" + max);

// 撰寫一函數max()，接收的一個整數陣列，傳回陣列的最大值, 5%
        int[] a = {15, 18, -1, 35, -2, 48, 32, 15};

        max = max(a);

        System.out.println("max of a[]=" + max);

// 計算二個時間的差異，用6碼整數表示一個時間, 8%
        int diff = timeDiff(53029, 201817); // 5:30:29, 20:18:17

        System.out.println("diff of 5:30:29 and 20:18:17 is " + diff + " sec.");

    }

// DIY here, max3(), max(), timeDiff(), 5%, 5%, 8%
    public static int max3(int x, int y, int z){
        int max=x;
        if (y>z&& y>x)max=y;
        if (z>y&&z>x) max=z;
        return max;
    }
    public static int max(int []a){
        int max=a[0];
        for (int i=0; i<a.length; i++){
            if (a[i]>max)max=a[i];
        }
        return max;
    }
    public static int timeDiff(int t1, int t2){
        int h1, m1,s1,h2,m2,s2;
        h1=t1/10000;
        m1=t1%10000/100;
        s1=t1%100;
        h2=t2/10000;
        m2=t2%10000/100;
        s2=t2%100;
        if(s2<s1){
            s2+=60;
            m2--;
        }
        if(m2<m1){
            m2+=60;
            h1--;
        }
        return (h2-h1)*3600+(m2-m1)*60+(s2-s1);
    }
}

/*[程式輸出]

max3(x,y,z)=9

max of a[]=48

diff of 5:30:29 and 20:18:17 is 53268 sec.

*/
