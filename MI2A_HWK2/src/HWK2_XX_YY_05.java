
import java.util.Arrays;
import java.util.Random;

public class HWK2_XX_YY_05 {
    public static void main(String[] args) {
        Random r = new Random(111) ; 
        int[] a = new int[10] ;
        for (int i=0 ; i<a.length; i++) { 
            a[i]=r.nextInt(100); 
        } 
        System.out.println("a[]="+Arrays.toString(a));
        
        // DIY here, rotate a[] right once and print out a[]
        System.out.println("a[]="+Arrays.toString(a));
        
        // DIY here, rotate a[] left twice and print out a[]
        System.out.println("a[]="+Arrays.toString(a));
    }
}
/*
a[]=[93, 70, 57, 97, 9, 20, 84, 12, 97, 65]
a[]=[65, 93, 70, 57, 97, 9, 20, 84, 12, 97] (向右循環位移1次)
a[]=[70, 57, 97, 9, 20, 84, 12, 97, 65, 93] (在向左循環位移2次)
*/