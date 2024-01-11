public class MI1A_XX_022 {
    public static void main(String[] args) {
        System.out.println("----- isPrime(n) ------ 4%");
        System.out.println("isPrime(17)="+isPrime(17));
        System.out.println("isPrime(57)="+isPrime(57));
        
        System.out.println("----- C(n,k) ------ 5%");
        int n=17, k=12 ; 
        System.out.printf("Cnk(%d,%d)=%d\n", n, k, cnk(n,k));
        n = 100; k = 95 ; 
        System.out.printf("Cnk(%d,%d)=%d\n", n, k, cnk(n,k));

        System.out.println("----- sumOfDigits(n) ------ 6%");        
        n = 135792468 ;
        System.out.printf("sumOfDigits(%d)=%d\n",n,sumDigits(n)); 
        
        System.out.println("----- factorize(n)----  7%") ;
        n = 2*2*2*3*5*5*7*11*11*13*13*17 ;
        factorize(n) ; 
        
        
    }
    public static boolean isPrime(int n) { 
        int cnt=0;
        for (int i=2; i<n; i++){
            if (n%i==0)cnt++;
        }
        return cnt==0 ; // DIY
    }    
    public static int cnk(int n, int k) { 
        k= n-k;
        int sum1=1, sum2=1;
        for (int i=0; i<k; i++){
            sum1*=n;
            n--;
        }
        for (int i=1; i<=k; i++){
            sum2*=i;
        }
        return sum1/sum2 ;  // DIY 
    }    
    public static int sumDigits(int n) { 
        int sum=0;
        while (n!=0){
            int a=n%10;
            sum+=a;
            n=n/10;
        }
        return sum ; // DIY
    }
    public static void factorize(int n) { 
       int i=2; 
       while (i<=n){
           if (n%i==0){
               System.out.println(i+" ");
               n/=i;
           }
           else i++;
       }
    }      
}
/* [程式輸出]
----- isPrime(n) ------ 4%
isPrime(17)=true
isPrime(57)=false
----- C(n,k) ------ 5%
Cnk(17,12)=6188
Cnk(100,95)=3704731
----- sumOfDigits(n) ------ 6%
sumOfDigits(135792468)=45
----- factorize(n)----  7%
2 2 2 3 5 5 7 11 11 13 13 17 
*/

