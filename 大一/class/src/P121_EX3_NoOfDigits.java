
public class P121_EX3_NoOfDigits {
    public static void main(String[] args) {
	int[] a={1080453, -108, 5, 0} ; 
        for (int n:a)
            System.out.println("#digits of "+n+" is "+noOfDigits(n));
    }
    public static int noOfDigits(int n) {
        if(n/10==0)return 1;
        return noOfDigits(n/10)+1 ;
    }
}
