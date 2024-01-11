

public class P135_Demo {
    public static void main(String[] args) {
        System.out.println("max1="+max(1,8,6)) ;
        System.out.println("max2="+max(88,77,55,99,33,44,75)) ;
        System.out.println("max3="+max(new int[]{88,77,55,99,33})) ;
    }
    public static int max(int... a) {
        if (a.length <1) return Integer.MIN_VALUE ;
        int maxV = a[0] ;
        for (int i = 1 ; i<a.length; i++) {
            if (a[i]>maxV) maxV = a[i] ;
        }
        return maxV ;
    }
}
