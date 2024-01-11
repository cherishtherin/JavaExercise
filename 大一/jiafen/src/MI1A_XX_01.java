public class MI1A_XX_01 { // XX: 成績座號
    public static void main(String[] args) {
        System.out.println("----- fac(n) ----- 4%");
        System.out.println("6!=fac(6)="+fac(6));
        
        System.out.println("----- mid(a,b,c) ----- 4%");
        System.out.println("mid(8,11,9)="+mid(8,11,9));
        System.out.println("mid(9,8,11)="+mid(9,8,11));

        System.out.println("----- gcd(a,b) ----- 5%");        
        int a = 2*3*3*5*11*13, b=3*5*11*13*17;
        System.out.printf("gcd(%d,%d)=%d\n",a,b,gcd(a,b));
        
        System.out.println("----- reduce(a,b) ----- 7%");    
        int[] frac = {a,b,b,a,a,a,2*a,a,0,a,a,0} ;
        for (int i=0; i<frac.length; i+=2) 
            reduce("f"+(i+1)+"=", frac[i], frac[i+1]) ; 
    }    
 
    public static int fac(int n) { 
        int res=1;
        for (int i=n; i>0; i--){
            res*=i;
        }
        return res ; // DIY 
    }
    public static int mid(int a, int b, int c) {
        int mid;
        if(a<b&&b<c||c<b&&b<a)mid=b;
        else if(b<a&&a<c||c<a&&a<b)mid=a;
        else mid=c;
        return mid ; // DIY
    }
    public static int gcd(int a, int b) { 
        int less=a;
        if (b<a)less=b;
        int gcd=2;
        for (int i=2; i<less; i++){
            if(less%i==0)gcd=i;
        }
        return gcd; // DIY 
    }    
    public static void reduce(String header, int up, int down) { 
        int a,b,c;
        int gcd= gcd(up,down);
        if(down==0){
            System.out.println("Invalid");
        }
        else{
            if (up>down){
                a=up/down;
                b=(up-(a*down))/gcd;
                c= down/gcd;
                if(b==0){
                    
                }
            }
            else{
                b= up/gcd;
                c= down/gcd;
            }
    }   
    }
}
/* [程式輸出]
----- fac(n) ----- 4%
6!=fac(6)=720
----- mid(a,b,c) ----- 4%
mid(8,11,9)=9
mid(9,8,11)=9
----- gcd(a,b) ----- 5%
gcd(12870,36465)=2145
----- reduce(a,b) ----- 7%
f1=12870/36465=6/17
f3=36465/12870=2+5/6
f5=12870/12870=1
f7=25740/12870=2
f9=0/12870=0
f11=12870/0=Invalid!
*/
