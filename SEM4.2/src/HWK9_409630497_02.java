
import java.util.Arrays;

public class HWK9_409630497_02 {
    public static int cnt=0;
    public static void main(String[] args) {
        int[] a = {29, 10, 14, 37, 13};
        System.out.println("a[]="+Arrays.toString(a));
        String sortName = "MergeSort";
        mergesort(a, 0, a.length-1);
        // quicksort(a) ;
        System.out.println(sortName+"(a), a[]="+Arrays.toString(a));
    }        
    public static void mergesort(int[] a, int left, int right) {
	if (left < right) {// base:l=0,r=1 m=0
            int mid = (left+right)/2; //切割陣列A
            mergesort(a, left, mid) ;	//對A[left]~A[mid]
            mergesort(a, mid+1, right) ; //對A[mid+1]~A[right]
            merge(a, left, mid, right) ; //合併二個排序好的串列
	}
    }
    public static void merge(int[]a, int left, int mid, int right) {
        // System.out.println("left, mid, right="+left+" "+mid+" "+right);
	// DIY 0,1,2,3,4  0,  2,5(3)
        int [] leftHalf= new int [mid-left+1];
        int [] rightHalf= new int [right-mid];
        int [] merged= new int[leftHalf.length+rightHalf.length];
       System.arraycopy(a, left, leftHalf, 0, leftHalf.length);
       System.arraycopy(a, mid+1, rightHalf, 0, rightHalf.length);
       
        int ll=0, rr=0, arr=0;
        while(ll<leftHalf.length&&rr<rightHalf.length){
            
           if(leftHalf[ll]<rightHalf[rr]){
               merged[arr]=leftHalf[ll];
               ll++;
           }
           else{
               merged[arr]=rightHalf[rr];rr++;
           }
           arr++;
            
        }
        while(ll<leftHalf.length){
            merged[arr]=leftHalf[ll];
            ll++;arr++;
        }
        while(rr<rightHalf.length){
            merged[arr]=rightHalf[rr];
            rr++;arr++;
        }
        
        
        
        
        
	// [舉例]: left = 0, right=9, mid=3
	// a[]=(1, 4, 5, 7 | 2, 3, 8, 9, 10 | 13, 6) -> a[]=(1,2,3,4,5,7,8,9,10,13,6)
    }
}
