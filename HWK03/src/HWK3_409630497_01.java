
import java.util.*;

public class HWK3_409630497_01 {
    public static void main(String[] args) {
        int[] data = {88, 72, 45, 99, 85, 43, 37, 51} ;
         int min = minOf(data); 
         System.out.println("minOf(data)="+min); // 37
        
         int max2 = max2Of(data); 
         System.out.println("max2Of(data)="+max2); // 88

        Random r = new Random(1) ; 
        int[] a=new int[888], b=new int[999] ;       
         //將[0,100]之間的亂數整數填入a[]與b[]中        
         randomlyFill(a, 0, 100, r); 
         randomlyFill(b, 0, 100, r);
        
          int sim1=same(a, b);
          int sim2 = same(b, a) ;
         System.out.println("same(a,b)="+sim1+"\nsame(b,a)="+sim2) ;        

    }
    // DIY here, 請依照main()中的需求，完成以下函數
    // minOf(a): 回傳a[]中的最小值
    public static int minOf (int [] a){
        int min=a[0];
        for (int i=0; i<a.length; i++){
            if (a[i]<min)min=a[i];
        }
        return min;
    }
    // max2Of(a): 回傳a[]中第二大的值
    public static int max2Of (int [] a){
        int max=a[0];
        for (int i=0; i<a.length; i++){
            if (a[i]>max)max=a[i];
        }
        int max2=a[0];
        for (int i=0; i<a.length; i++){
            if (a[i]>max2&&a[i]<max)max2=a[i];
        }
        return max2;
    }
    // randomlyFill(a[], lb, ub, r)
    // 利用亂數種子r，將[lb,ub]中的整數值填入a[]中
    public static void randomlyFill(int [] a, int lb, int ub, Random r){
        for (int i=0; i<a.length; i++){
            a[i]= lb+r.nextInt(ub-lb+1);
        }
    }
    // same(a[], b[])
    // 依序比較a[],b[]中的元素，傳為元素值相同的個數       
    public static int same (int[] a, int[] b){
        int cnt=0;
        int sh=a.length;
        if(b.length<a.length)sh=b.length;
        for (int i=0;i<sh;i++){
            if (a[i]==b[i])cnt++;
        }
        return cnt;
        

       
    }
}
/* [程式輸出]
minOf(data)=43
max2Of(data)=88
same(a,b)=6
same(b,a)=6
*/