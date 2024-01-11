
public class P122_TestFibnacci {
    public static void main(String[] args) {
	System.out.println("fib(20)="+fibV1(20)) ;
	System.out.println("fib(20)="+fibV2(20)) ;
	System.out.println("fib(20)="+fibRec(20)) ;
    }
    public static int fibV1(int n) { // 迴圈版，非遞迴
	if (n==0) return 0 ;
	if (n==1 || n==2) return 1  ;
	int Fn_2=1, Fn_1=1, Fn=0; // 代表 F(n-2), F(n-1) F(n)
	for (int i=3; i<=n; i++){
            Fn=Fn_2+Fn_1;
             Fn_1=Fn_2;
             Fn_2=Fn;
        }


	return Fn; 
    }
    public static int fibV2(int n) { // 迴圈版，非遞迴
	int[] fib = new int[n+1] ;
	fib[0]=0; fib[1]=1; fib[2]=1 ; // fib[n] = fib[n-1]+fib[n-2]
        for (int i=3; i<fib.length; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }


	return fib[n]; 
    }
    public static int fibRec(int n) { // 遞迴版
    	// DIY here, base+induction
        if(n==0)return 0;
        if(n==1)return 1;

        return fibRec(n-1)+fibRec(n-2) ;
    }
} 
