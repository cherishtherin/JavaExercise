
public class arrays2 {
     public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {15, 28, 99, 105};
        int[] c = concat(a, b);
        // 印出 c[]的內容
        for(int i = 0 ; i<c.length ; i++){
            System.out.print(c[i]+" ");
        }
    }
     public static int[] concat (int[]x, int[]y){
         int [] z= new int [x.length+y.length];
         for (int i=0; i<z.length; i++){
             if(i<x.length){
                 z[i]=x[i];
             }
             else{
                 z[i]=y[i-x.length];
             }
         }
         return z;
     }
}
