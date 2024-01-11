import java.util.Arrays;
public class test4 {
    public static void main(String[] args) {
        int[] a = {12, 88, 36, 55, 43, 74} ;
        int[] b = {44, 22, 57, 39, 83, 55} ; 
        System.out.println("a[]="+Arrays.toString(a)) ;
        System.out.println("b[]="+Arrays.toString(b)) ;
        swap(a,b) ;
        System.out.println("--- after swaping a[], b[]: (6%)") ;
        System.out.println("a[]="+Arrays.toString(a)) ;
        System.out.println("b[]="+Arrays.toString(b)) ;
        
        int[] c = {1, 8, 4, 6, 7, 9, 3} ;
        int[] d = reverse(c) ; 
        System.out.println("--- d=reverse(c), d[]=  (6%) \n"+Arrays.toString(d)) ;
    }
    public static void swap(int [] a, int[]b){
        int[] input= new int [a.length];
        for (int i=0; i<input.length; i++){
            input[i]= a[i];
            a[i]=b[i];
            b[i]=input[i];
        }
        
    }
    public static int[] reverse (int[]x){
        int [] input = new int[x.length];
        for (int i=0; i<x.length; i++){
            input[i]=x[i];
            
        }
        for (int i=0; i<x.length; i++){
            input[i]=x[6-i];
            
        }
      return input;  
    }
}
