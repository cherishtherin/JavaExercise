import java.util.*;
public class HWK2_409630497_01 {
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
        int[] b= new int[a.length];
        for (int i=0; i<a.length; i++){
            int min=Integer.MAX_VALUE;
            int minDex=0;
            for (int j=0; j<a.length; j++){
                if(a[j]<min){
                    min=a[j];
                    minDex=j;
                }
            }
            b[i]=min;
            a[minDex]=Integer.MAX_VALUE;
            
        }
        for (int i=0; i<a.length; i++){
            a[i]=b[i];
        }
    }
    public static void shuffle(int[] card, int times) { // 8%
        // 將card[]內容以以下方式洗牌，共進行times次:
        // 從牌堆中隨機選取三張牌，把第一張牌和第二張與第三張中較小的互換
        // 比較大小時以牌面代號(0-51)為準
        Random r = new Random(333) ;
        for (int i=0; i<times; i++){
            int a,b,c;
            a=r.nextInt(52);
            b=r.nextInt(52);
            c=r.nextInt(52);
            int alt;
            if(b<c){
                alt=card[a];
                card[a]=card[b];
                card[b]=alt;
            }
            else {
                alt=card[a];
                card[a]=card[c];
                card[c]=alt;
            }
        }
    }
    public static int[] subArray(int[] a, int start, int end) { // 6%
        // 由a[]擷取a[start]~a[end]，並存於一新陣列傳回
        
        return new int[]{a[start]} ; // DIY, 自行修改
    }
    public static int sumUp(int[] a, int start) { // 5%
        // 將a[start]~a[a.length-1]之整數加總後傳回
        // [注意]: 本題需完全使用遞迴概念，否則不給分。
        return 0 ;
    }

}
