
public class HWK7_409630497_04 {
   public static void main (String[]args){
       System.out.println("fib(20)"+fibV1(20));
       System.out.println("fib(20)"+fibV2(20));
       System.out.println("fib(20)"+fibRec(20));
   }
   public static int fibV1(int n){
       if (n==0)return 0;
       if (n==1||n==2)return 1;
       int fn2=1, fn1=1, fn=0, fibn=0;
       for (int i=0; i<n-1; i++){
           if (i==0)fibn=fn+fn1;
           else{
               fibn=fn1+fn2;
               fn1=fn2;
               fn2=fibn;
               
           }
       }
       return fibn;
   }
   public static int fibV2(int n){
       int [] fib = new int[n+1];
       fib[0]=0; fib[1]=1;fib[2]=1;
       for (int i=3; i<fib.length ; i++){
           fib[i]=fib[i-1]+fib[i-2];
       }
       return fib[n];
  }
   public static int fibRec(int n){
     if(n==0)return 0;
     if(n==1)return 1;
     return fibRec(n-1)+fibRec(n-2);  
   }
}
