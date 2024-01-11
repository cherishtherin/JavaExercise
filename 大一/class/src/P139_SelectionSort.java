

import java.util.* ; 
public class P139_SelectionSort {
    public static void main(String[] args) {
        int[] a = {88, 72, 13, 25, 45, 37, 99, 50} ;
        selectionSort(a) ; 
        System.out.println("sorted a[]="+Arrays.toString(a));
    }
    public static void selectionSort(int[] a) {
     int [] temp = new int[a.length];
     for (int i=0; i<a.length; i++){
         int max=0,maxDig=0;
         for (int j=0; j<a.length; j++){
             if(a[j]>max){
                 max=a[j];
                 maxDig=j;
             }
         }
         temp[i]=max;
         a[maxDig]=Integer.MIN_VALUE;
         
     }
          for (int i=0; i<a.length; i++){
              a[i]=temp[i];
    }
}
}
