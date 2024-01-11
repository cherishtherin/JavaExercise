

public class P121_EX2_RervsePrint {
    public static void main(String[] args) {
	int[] a = {5, 1, 9, 2, 7} ;
	reversePrint(a, a.length-1) ; // (a,4)
    }
    public static void reversePrint (int[] a, int lastIndex) {
        if (lastIndex==0)System.out.println(a[lastIndex]);
        else{
            System.out.print(a[lastIndex]+", ");
        
        reversePrint(a,lastIndex-1);}
    }
} 
