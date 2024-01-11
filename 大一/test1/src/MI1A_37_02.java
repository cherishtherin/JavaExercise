import java.util.*;
public class MI1A_37_02 {
        public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {4, 6, 8};
        int[] c = rotateRight(a, b);
        System.out.println("c[]=" + Arrays.toString(c));
    }
    public static int[] rotateRight(int[] a, int[] b) {
        int [] c= new int [a.length+b.length];
       
        for(int i=0;i<c.length; i++){
            if(i<a.length)c[i]=a[i];
            else c[i]=b[i-a.length];
        }
        int index1=c[c.length-1],index2;
        for(int i=0;i<c.length; i++){
            index2=c[i];
            c[i]=index1;
            index1=index2;
        }
        return c; // DIY 自行修改
    }
}
/* [程式輸出]
a[]=[1, 3, 5, 7, 9]
b[]=[4, 6, 8]
c[]=[8, 1, 3, 5, 7, 9, 4, 6]
*/


