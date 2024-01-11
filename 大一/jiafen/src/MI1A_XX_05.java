import java.util.Arrays;
public class MI1A_XX_05 {
    public static void main(String[] args) {
        int a[] = {31, 52, 13, 74, 25, 99, 66, 47, 88} ;
        int maxIndex = findMaxIndex(a) ; // maxIndex = 5
        System.out.printf("max of a[] is a[%d] = %d\n", maxIndex, a[maxIndex]);
        
        double std_a = std(a) ;
        System.out.printf("std of a[] = %.3f\n",std_a);
        
        int b[] = {1, 3, 5, 7, 9, 2, 4, 6, 8} ;
        System.out.println("b[] = "+Arrays.toString(b));
        reverse(b) ;
        System.out.println("reverse b[] = "+Arrays.toString(b));
        
        rotateLeft(b, 3) ;
        System.out.println("rotateLeft(b, 3) = "+Arrays.toString(b));
        
    }
    public static int findMaxIndex(int[] a) { // 5%
	int maxIndex=0,max=a[0];
        for (int i=0; i<a.length ; i++){
            if (a[i]>max){
                max=a[i];
                maxIndex=i;
            }
        }
        return maxIndex ; // DIY 
    }
    
    public static double std(int[] a) { // 5%
        int avg,sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        avg=sum/a.length;
        int sum2=0,d;
        for (int i=0; i<a.length; i++){
            sum2+=Math.pow((a[i]-avg),2);
        }

        
    	return Math.sqrt(sum2/a.length); // DIY 
    }
    public static void reverse(int[] a) { // 5%
    int []b= new int [a.length];
    for(int i=0;i<a.length;i++){
        b[i]=a[i];
    }
    for (int i=0;i<a.length;i++){
        a[i]=b[a.length-i-1];
    }
    }    
    public static void rotateLeft(int[] a, int times) { // 6%
         int []b= new int [a.length];
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for (int i=0;i<a.length;i++){
            
        }
        for (int i=0;i<a.length-times;i++){
            a[i]=b[i+times];
        }
        for (int i=a.length-times;i<a.length;i++){
            a[i]=b[i-5];
        }
    }
}
/* [程式輸出]
max of a[] is a[5] = 99
std of a[] = 27.514
b[] = [1, 3, 5, 7, 9, 2, 4, 6, 8]
reverse b[] = [8, 6, 4, 2, 9, 7, 5, 3, 1]
rotateLeft(b, 3) = [2, 9, 7, 5, 3, 1, 8, 6, 4]
*/

