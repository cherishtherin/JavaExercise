import java.util.Arrays;
public class MIA1 {
    public static void main (String[]args){
      int []a={1, 3, 5, 7, 9};
      int []b= {4,6,8};
      int [] c=rotateRight(a,b,3);
        System.out.println("c[] "+Arrays.toString(c));
    }
    public static int[]  rotateRight(int []a, int[]b, int times){
        int [] c= new int [a.length+b.length];
        for (int i=0; i<c.length; i++){
            if(i<a.length)c[i]=a[i];
            else c[i]=b[i-a.length];
        }
         int [] d= new int [c.length];
         System.arraycopy(c, 0, d, times,c.length-times);
         System.arraycopy(c, c.length-times, d, 0,times);
        return d;
    }
}
