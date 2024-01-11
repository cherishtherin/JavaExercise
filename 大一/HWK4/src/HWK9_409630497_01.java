
import java.util.*;

public class HWK9_409630497_01 {

    public static void main(String[] args) {
        int[] a = {88, 72, 13, 25, 45, 37, 99, 50};
        selectionSort(a);
        System.out.println("sorted a[]=" + Arrays.toString(a));
    }

    public static void selectionSort(int[] a) {
        int[] temp = new int[a.length];
        int minIndex = 0, minVal ;
        for (int j = 0; j <temp.length; j++) {
            minVal=a[minIndex];
            for (int i = 0; i < a.length; i++) {
                if (a[i] < minVal) {
                    minIndex = i;
                    minVal = a[i];
                }

            }
                temp[j]=minVal;
                a[minIndex]=Integer.MAX_VALUE;
        }
       
        for (int i = 0; i < a.length; i++) {
            a[i]=temp[i];
        }
    }
}
