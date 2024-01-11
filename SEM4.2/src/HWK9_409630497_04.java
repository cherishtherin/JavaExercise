
import java.util.Arrays;
import java.util.*;

public class HWK9_409630497_04 {

    public static void main(String[] args) {
        Random r = new Random(111);
        int[] a = {29, 10, 14, 37, 13,2,3,7,3,7,9,3,7,0,4,8,0,4,4,7,9,5,2,1,8,0,5,3,5,6,87,9,23,5,812};
//        System.out.println("a[]="+Arrays.toString(a));
//        String sortName = "SelectionSort";
//        selectionSort(a);
//        System.out.println(sortName+"(a), a[]="+Arrays.toString(a));
//         String sortName2 = "Bubble Sort";
//        bubbleSort(a);
//        System.out.println(sortName2+"(a), a[]="+Arrays.toString(a));
         String sortName3 = "Insertion Sort";
        insertionSort(a);
        System.out.println(sortName3+"(a), a[]="+Arrays.toString(a));
        
        
        
//        int datasize = 100_000;
//        System.out.println("6");
//        int[] b = new int[datasize];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = r.nextInt(100_0000);
//        }
//       
//        long start4 = System.currentTimeMillis();
//        System.out.println(start4/1000.00);
//        HWK9_409630497_02.mergesort(b, 0, datasize - 1);
//        System.out.println("total times merge " + (System.currentTimeMillis() - start4) / 1000.00 + " sec");

    }

    public static void selectionSort(int[] a) {
        int n = a.length; //本行可省略，直接使用a.length
        for (int pass = 1; pass <= n - 1; pass++) {
            int last = n - pass;
            int maxIndex = 0; //儲存最大值的註標 
            // (1)找出尚未排序部分(a[0]~a[last])之最大值所在位置註標
            int max=a[maxIndex];
            for (int i = 0; i <= last; i++) {
                if (a[i] > a[maxIndex]) {
                    maxIndex = i;
                }
            }
            // (2)將此最大值與a[]未排序部分的最右邊元素(a[last])對調
            swap(a, maxIndex, last);
        }
    }

    public static void swap(int[] a, int idx1, int idx2) {
        // DIY 
        int x = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = x;
    }

    public static void bubbleSort(int[] a) {
        boolean sorted;
        int n = a.length;
        for (int pass = 1; pass <= n - 1; pass++) { //最多執行n-1個pass
            sorted = true;
//            //DIY: 參考『基本概念』，實作每一個Pass該做的事
            for (int i = 0; i < a.length - pass; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
                sorted = false;
            }
            if (sorted) {
                break;
            }
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int boundary = 1; boundary <= n - 1; boundary++) {
            int bufItem = a[boundary]; // 欲將此元素加入a[]已排序部分
            // 逐一檢視a[]已排序部分(a[0]~a[boundary-1])，以便
            // 找到bufItem合適的插入位置
            int loc; // location, 
            for (loc = boundary; loc >= 1; loc--) {//1....boundeary
                if (a[loc - 1] > bufItem) //0....boundary-1
                {
                    a[loc] = a[loc - 1];
                } else {
                    break;
                }
            }
            a[loc] = bufItem;
        }
    }
}
