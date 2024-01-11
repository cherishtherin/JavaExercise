import java.util.*;
public class hwk03_03 {
    public static void main (String[]args){
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.println("input n: ");
        n= cin.nextInt();
        fib(n);
       
    }
    public static void fib(int n){
        int [] arr= new int[n];
        arr[0]=1; arr[1]=1;
        for(int i=2; i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("fibbonacii :"+arr[n-1]);
    }
}
