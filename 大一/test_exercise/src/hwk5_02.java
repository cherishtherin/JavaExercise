import java.util.Arrays;
public class hwk5_02 {
    public static void main (String[]arsg){
        int[] a ={1,2,3,4};
        int[] b= {15,28,99,105};
        int[] c =concat(a,b);
        System.out.println(Arrays.toString(c));
    }
    public static int[] concat(int[]a, int[]b){
        int [] c= new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            c[i]= a[i];
        }
        for(int i=0; i<b.length; i++){
            c[a.length+i]=b[i];
        }
        
     return c;   
    }
            
}
