
import java.util.Arrays;
import java.util.Random;

public class HWK2_409630497_05 {
    public static void main(String[] args) {
        Random r = new Random(111) ; 
        int[] a = new int[10] ;
        for (int i=0 ; i<a.length; i++) { 
            a[i]=r.nextInt(100); 
        } 
        System.out.println("a[]="+Arrays.toString(a));
        
        // DIY here, rotate a[] right once and print out a[]
        int []b= new int [a.length];
        b[0]=a[a.length-1];
        System.arraycopy(a,0,b,1,a.length-1);
        System.arraycopy(b, 0, a, 0, a.length);
        System.out.println("a[]="+Arrays.toString(a));
        
        // DIY here, rotate a[] left twice and print out a[]
        int index=2;
        System.arraycopy(a, 0, b, 0, a.length);
        for(int i=0; i<a.length-2; i++){
            a[i]=b[index];
            index++;
        }
        index=0;
        for (int i=a.length-2; i<a.length; i++){
            a[i]=b[index];
            index++;
        }
        System.out.println("a[]="+Arrays.toString(a));
    }
}
/*
a[]=[93, 70, 57, 97, 9, 20, 84, 12, 97, 65]
a[]=[65, 93, 70, 57, 97, 9, 20, 84, 12, 97] (向右循環位移1次)
a[]=[70, 57, 97, 9, 20, 84, 12, 97, 65, 93] (在向左循環位移2次)
*/
