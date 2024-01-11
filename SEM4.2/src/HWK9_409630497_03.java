
import java.util.*;
public class HWK9_409630497_03 {
    public static void main(String[] args) {
        Random r= new Random (111);
        int[] a = {29, 10, 14, 37, 13};
        System.out.println("a[]="+Arrays.toString(a));
        String sortName = "QuickSrot";
        quicksort(a, 0, a.length-1);
        // quicksort(a) ;
        System.out.println(sortName+"(a), a[]="+Arrays.toString(a));
        int datasize= 100_000;
    int [] b= new int [datasize];
        for (int i=0; i<a.length; i++){
        b[i]=r.nextInt(100_0000);
    }
        long start= System.currentTimeMillis();
        quicksort(b,0,b.length-1);
        System.out.println("total times "+(System.currentTimeMillis()-start)/1000.00+" sec");
    }          
    public static void quicksort(int[] a, int left, int right) {
	int pivotIndex ;
	if (left<right) {  // A陣列中至少有二個元素
            pivotIndex = partition(a, left, right) ; 
            quicksort(a, left, pivotIndex-1) ;
            quicksort(a, pivotIndex+1, right) ;
        }
    }
    public static int partition(int a[], int L, int R){
	int pivotIndex ;
        choosePivot(a, L, R) ; //將pivot調換至[L]
        int pivot = a[L], i = L , j = R+1 ;
        do {
            do {
                i++;
            } while (i < j && a[i] <= pivot); //注意條件次序與 <=
            do {
                j--;
            } while (i < j && a[j] > pivot);
            if (i < j) {
                swap(a, i, j); // 也就是將a[i], a[j]對調
            }
        } while (i <= j); // 注意! 若無=，下一行會錯
        pivotIndex = j ; 
        swap(a, L, pivotIndex) ;
        return pivotIndex ;
    }
    public static void choosePivot(int[] a, int L, int R) { //將pivot調換至[L]
        // do nothing, 直接使用a[L]當做pivot
    }
    public static void swap(int[] a, int n1, int n2) {
        int temp = a[n1] ; 
        a[n1] = a[n2] ; 
        a[n2] =temp ;
    }
}
