

import java.util.Arrays ;
public class P116_ArraysUsage {
    public static void main(String[] args) {
        int[] data = new int[10] ; 
        Arrays.fill(data, -1);
        System.out.println("fill data[] by -1, data[]="+Arrays.toString(data)) ;               
        
        int[] a = {18, 29, 97, 43, 85, 74, 39} ;        
        int[] buff; // new int[a.length] ; 
        buff = Arrays.copyOf(a, a.length) ;
        System.out.println("copy a[] to buff[], buff[]="+Arrays.toString(buff)) ;               
        
        int[] buff2 = new int[a.length] ; 
        System.arraycopy(a, 0, buff2, 0, a.length);
        System.out.println("copy a[] to buff2[], buff2[]="+Arrays.toString(buff2)) ;               
        
        if (Arrays.equals(a, buff)) {
            System.out.println("a[] equals to buff[].") ; 
        }
        
        int[] b = {38, 29, 97, 43, 85, 74, 39} ;
        Arrays.sort(b) ;
        System.out.println("b[]="+Arrays.toString(b)) ;               
        
        int index = Arrays.binarySearch(b, 74) ;
        if (index>=0)
            System.out.println("the index of 74 in b[] is "+index) ; 
        else 
            System.out.println("74 is not in b[]") ; 

        index = Arrays.binarySearch(b, 55) ;
        System.out.println("the index of 55 in b[] is "+index) ;    
        
        int[] source = {18, 25, 33, 7, 20} ;
        int[] desti = copyN(source, 3) ;
        System.out.println("desti[]="+Arrays.toString(desti));
    }
    public static int[] copyN(int[] source, int times) {
        // 將source[]的內容複製times次後，存於一新陣列傳回
        // [提示]: 可使用Arrays.copyOf()或者
        int []dest= Arrays.copyOf(source, source.length*times);
        System.arraycopy(source, 0, dest, source.length, source.length);
        System.arraycopy(source, 0, dest, source.length*2, source.length);
        return dest ; // DIY 
    }
}
/* [程式輸出]
fill data[] by -1, data[]=[-1, -1, -1, -1, -1, -1, -1, -1, -1, -1]
copy a[] to buff[], buff[]=[18, 29, 97, 43, 85, 74, 39]
copy a[] to buff2[], buff2[]=[18, 29, 97, 43, 85, 74, 39]
a[] equals to buff[].
b[]=[29, 38, 39, 43, 74, 85, 97]
the index of 74 in b[] is 4
the index of 55 in b[] is -5
desti[]=[18, 25, 33, 7, 20, 18, 25, 33, 7, 20, 18, 25, 33, 7, 20]
*/
