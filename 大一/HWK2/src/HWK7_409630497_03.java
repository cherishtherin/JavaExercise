
public class HWK7_409630497_03 {
    public static void main (String[]args){
        int n=1080453;
        System.out.println("#digits of " +n+ " is "+noOfDigit(n));
    }
    public static int noOfDigit(int n){
        
        if (n/10==0)return 1;
        return noOfDigit(n/10)+1;
    }
}
