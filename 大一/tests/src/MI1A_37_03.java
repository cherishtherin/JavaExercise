import java.util.*;
public class MI1A_37_03 {
           public static void main(String[] args) {
        int[] a = {48, 32, 95, 12, 77, 43, 57, 88} ;
        System.out.println("a[]="+Arrays.toString(a));
        sort(a) ; 
        System.out.println("sort(a), a[]="+Arrays.toString(a));
        
        int[] card = new int[52] ;
        for (int i=0; i<card.length; i++) card[i] = i ; 
        shuffle(card, 100) ;
        System.out.println("Shuffle card[], card[]="+Arrays.toString(card));
        
        int[] b = {48, 32, 95, 12, 77, 43, 57, 88} ;
        int[] c = subArray(b, 2, 6); // 擷取{95, 12, 77, 43, 57}
        System.out.println("b[]="+Arrays.toString(b));
        System.out.println("subArray(b,2,6)="+Arrays.toString(c));
        
        int[] d = {1,2,3,4,5,6,7,8,9,10} ;
        System.out.println("sumUp(d)="+sumUp(d,0));
    }
    public static void sort(int[] a) { // 8%
        // 步驟同講義之SelectionSort, 但改為每次都找到最大值，再將該處設定為Integer.MIN_VALUE
        
        int []temp =new int[a.length];
        for (int j=0; j<a.length ;j++){
            int max=0, maxDig=0;
            for (int i=0; i<a.length; i++){
            if (a[i]>max){
                max=a[i];
                maxDig=i;
            }
        }
        temp[j]=max;
        a[maxDig]=Integer.MIN_VALUE;
    }
        for (int i=0; i<a.length ;i++){
            a[i]=temp[i];
        }
       
    }
    public static void shuffle(int[] card, int times) { // 8%
        // 將card[]內容以以下方式洗牌，共進行times次:
        // 從牌堆中隨機選取三張牌，把第一張牌和第二張與第三張中較小的互換
        // 比較大小時以牌面代號(0-51)為準
        Random r = new Random(333) ;
        int pick_1, pick_2, pick_3, temp = -1;
        for (int i=0; i<times; i++){
            
            pick_1 = r.nextInt(52);
            pick_2 = r.nextInt(52);
            pick_3 = r.nextInt(52);
            if(card[pick_2] <= card[pick_3]){
                temp = card[pick_2];    
                card[pick_2] = card[pick_1];
            }
            else if(card[pick_3] <= card[pick_2]){
                temp = card[pick_3];
                card[pick_3] = card[pick_1];
            }            
            card[pick_1] = temp;
        }
        
		// DIY here
    }
    public static int[] subArray(int[] a, int start, int end) { // 6%
        // 由a[]擷取a[start]~a[end]，並存於一新陣列傳回
        int [] t=new int [end-start+1];
        t[0]=a[start];
        for (int i=1; i<t.length;i++){
            t[i]=a[start++];
        }
        return t ; // DIY, 自行修改
    }
    public static int sumUp(int[] a, int start) { // 5%
        // 將a[start]~a[a.length-1]之整數加總後傳回
        // [注意]: 本題需完全使用遞迴概念，否則不給分。
        if (start==a.length-1)
            return a[start];
        return a[start]+sumUp(a,++start) ;
    }
}
/* [程式輸出]
a[]=[48, 32, 95, 12, 77, 43, 57, 88]
sort(a), a[]=[12, 32, 43, 48, 57, 77, 88, 95]
Shuffle card[], card[]=[11, 3, 34, 35, 23, 5, 12, 2, 50, 42, 45, 19, 36, 25, 7, 1, 4, 20, 28, 17, 30, 24, 27, 21, 16, 51, 15, 22, 18, 41, 9, 8, 38, 26, 32, 37, 29, 46, 13, 49, 31, 39, 14, 10, 43, 0, 33, 6, 48, 40, 44, 47]
b[]=[48, 32, 95, 12, 77, 43, 57, 88]
subArray(b,2,6)=[95, 12, 77, 43, 57]
sumUp(d)=55
*/

