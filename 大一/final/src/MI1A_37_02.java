import java.util.*;import java.util.Arrays;
public class MI1A_37_02 {
    public static void main(String[] args) {
        System.out.println("----- fndMid()----- 5%");
        int[] a1 = {8, 5, 7, 6, 10} ;
        int[] a2 = {6, 9, 3, 4, 11} ; 
        int[] a3 = {7, 4, 2, 5, 13} ;
        int[] mid = findMid(a1,a2,a3) ;
        System.out.println("mid[]="+Arrays.toString(mid));
        
        System.out.println("----- foundIn()----- 6%");
        int[] query = {92, 50, 44, 53, 49} ; 
        int[] data = {38, 53, 67, 92, 18, 7, 38, 44, 75} ;
        int []foundNo = foundIn(data,query) ;
        System.out.println("#query found in data[] = "+Arrays.toString(foundNo));
        
        System.out.println("----- findNearestAvg() ----- 7%");
        int[] b = {38, 53, 67, 92, 18, 7, 38, 44, 75} ;
        int nearAvg = findNearestAvg(b) ;
        System.out.println("arr1[]="+Arrays.toString(b));
        System.out.println("Nearest item to Avg of arr1[] is "+nearAvg);
        
        System.out.println("----- numberGuessMatch() ----- 7%");
        int[] ans = {2, 7, 6, 4} ; 
        int[] g1 = {4, 7, 2, 6}, g2 = {5, 2, 4, 1}, g3={1, 3, 5, 9} ;
        numberGuessMatch(ans, g1) ; 
        numberGuessMatch(ans, g2) ; 
        numberGuessMatch(ans, g3) ; 
        
        System.out.println("----- splitBy(a[], pIndex) ----- 7%");
        int[] c = {38, 29, 77, 45, 53, 66, 97, 28} ;
        int[] cs = splitBy(c, 0) ; // 以c[0]為樞紐值，分割c[]
        System.out.println("cs[]="+Arrays.toString(cs));
    }
    public static int[] findMid(int[] a, int[] b, int c[])   {  // 5%
        // [功能]: 依照以下步驟撰寫程式
        // 找出(a[0],b[0],c[0])第二大的數，將其存於mid[0]中，
        // 再由((a[1],b[1],c[1])第二大的數，將其存於mid[1]中，
        // ...依此施行至所有元素
        
        int[] mid = {0,0,0} ; 
        int [] x= new int[a.length];
        for (int i=0; i<mid.length; i++){
            if (i==0){
                x= Arrays.copyOf(a, 0);
            }
            else if (i==1){
                x= Arrays.copyOf(b, 0);
            }
            else if (i==2){
                x= Arrays.copyOf(c, 0);
            }
            
            int max=0;
            for (int j = 0; i < x.length; j++) {
            if (x[j] > max) {
                max = x[i];
            }
        }
            
        for (int j = 0; j < x.length; j++) {
            if (x[j] > mid[i]&&x[j]<max) {
                mid[i] = x[i];
            }
        }
        }
        return mid ;
    }

    public static int [] foundIn(int[] data, int[] query) { // 6%
        // [功能]: 統計query陣列中的元素有出現在data[]中的個數，並將結果傳回
        // [說明]: 若data[]={10,20,30,40,50}, query={25,30,35,20}則回傳2
        // [提示]: 本題須使用雙層for-loop
        int [] x= new int[query.length];
        int index=0;
        for (int i=0; i<query.length; i++){
            for (int j=0; j<data.length; j++){
                if(query[i]==data[j])x[index++]=query[i];
            }
        }
        int [] d=new int[index];
        int cn=0;
        for (int i=0; i<query.length; i++){
            if(x[i]!=0)d[cn++]=x[i];
        }
        return d ; // DIY 自行修改
    }
    
    public static int findNearestAvg(int[] a) { // 7%     
        // [功能]: 找出a[]中最靠近其平均數的元素，並將其傳回
        // [提示]: 先算出a[]的平均值，再逐一檢查a[]中每個元素，看哪一個最靠近avg
        int sum=0, avg;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        avg=sum/a.length;int near=0;
         for (int i=0; i<a.length-1; i++){
             if (i==a.length-2){
             int diff1=Math.abs(avg-a[i]);
             int diff2=Math.abs(avg-a[i+1]);
             if (diff1<diff2)near=a[i];
             else near=a[i+i];
             }
             else{
             int diff1=Math.abs(avg-a[i]);
             int diff2=Math.abs(avg-a[i+1]);
             if (diff1<diff2)a[i+1]=a[i];
             }
         }
        return near ; // DIY, 自行修改
    }

    public static void numberGuessMatch(int[] ans, int[] guess) { // 7%
        // [功能]: 猜數字並印出?a?b，假設數字均不重複
        // [例如] 答案ans={2,7,6,4}, 猜測guess={2,7,5,6} -> 2a1b (2,7:a, 6:b)
        // [提示]: 本題會使用到雙層for-loop
        System.out.print("ans="+Arrays.toString(ans)+" guess="+Arrays.toString(guess)+" -> ");
        int aCnt=0, bCnt=0;  
        // DIY here

        System.out.println(""); // 自行修改本行
    }

    public static int[] splitBy(int[] a, int pIndex) { // 7%
        // [功能]: 將a[]中的元素以a[pIndex]為樞紐點進行重組，結果存於rlt[]中
        // [說明]: 令pv=a[pIndex] 
        //        rlt[]最後將由三部分組成 [比pv小的元素][pv][比pv大的元素]        
        // [範例]: a=[7, 3, 4, 5, 9, 2], pv=5 -> rlt = [3, 4, 2, (5), 9, 7]
        // [注意]: 本題不可使用排序，否則不給分
        int[] rlt = new int[a.length] ; 
		// DIY here
        return rlt ;
    }
}
/* [程式輸出]
----- fndMid()----- 5%
mid[]=[7, 5, 3, 5, 11]
----- foundIn()----- 6%
#query found in data[] = 3
----- findNearestAvg() ----- 7%
avg=48.0
arr1[]=[38, 53, 67, 92, 18, 7, 38, 44, 75]
Nearest item to Avg of arr1[] is 44
----- numberGuessMatch() ----- 7%
ans=[2, 7, 6, 4] guess=[4, 7, 2, 6] -> 1a3b
ans=[2, 7, 6, 4] guess=[5, 2, 4, 1] -> 0a2b
ans=[2, 7, 6, 4] guess=[1, 3, 5, 9] -> 0a0b
----- splitBy(a[], pIndex) ----- 7%
cs[]=[29, 28, 38, 97, 66, 53, 45, 77]
*/


