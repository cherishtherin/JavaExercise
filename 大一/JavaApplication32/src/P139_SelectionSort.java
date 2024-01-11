import java.util.* ; 

public class P139_SelectionSort {
    public static void main(String[] args) {
        int[] a = {88, 72, 13, 25, 45, 37, 99, 50} ;
        selectionSort(a) ; 
        System.out.println("sorted a[]="+Arrays.toString(a));
    }
    public static void selectionSort(int[] a) {
        int[]temp = new int[a.length];
        for (int i=0; i<a.length;i++)
        {
            int minIndex=minIndex(a);
            System.out.println("min ="+a[minIndex]);
            a[minIndex]=Integer.MAX_VALUE;
            System.out.println("a[]= "+Arrays.toString(a));
            
        }
    }
}