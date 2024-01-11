

public class P10_TestSwap {
    public static void main(String[] args) {
        int a = 3, b = 5;
        swap(a, b); // In Python, just write a,b = b,a 
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
                System.out.println(a + "," + b);

    }
    public static void testSwap2() {
	int a = 3, b=5;
        int[] c = {a,b}; 
	swap(c); 
	a = c[0]; b = c[1] ;
	System.out.println(a+","+b) ;
    }    
    public static void swap(int[] c) {
        int temp = c[0];
        c[0] = c[1];
        c[1] = temp;
    }    
}
