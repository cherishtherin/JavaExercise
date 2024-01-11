
/*
c(n,k) =        1		if k=0
		1		if k=n
		0		if k>n
		c(n-1,k-1)+c(n-1,k)   if 0<k<n

*/
public class P120_TestCnk {
    public static int cnk(int n, int k ) {
        if(k==0)return 1;
        if (n==k)return 1;
        if(k>n)return 0;
	return cnk(n-1,k-1)+cnk(n-1,k); // DIY here
    }
    public static void main(String[] args) {
	System.out.println(cnk(5,3)) ;
    }
} 
