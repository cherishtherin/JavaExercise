
public class num1 {
    // XX: 成績座號
    public static void main (String[]args) {
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
 
    public static int fac(int n) { // 4%
        // [功能]: 計算並傳回n!=1*2*...*n的值
        int res=1;
        for (int i=n; i>0; i--){
            res*=i;
        }
        return res ; // DIY 
    }
    public static int mid(int a, int b, int c) { 
        int mid;
        if(a>b&&b>c||c>b&&b>a)mid=b;
        else if(b>a&&a>c||c>a&&a>b)mid=a;
        else mid=c;
        return mid ; // DIY
    }
    public static int gcd(int a, int b) {
        int less=a;
        if (b<a) less=b;
        int gcd=2;
        for (int i=2; i<less; i++){
            if (a%i==0 &&b%i==0)gcd=i;}
        
        return gcd; // DIY 
    }    
    public static void reduce(String header, int up, int down) { 
        int a,b,c;
        int gcd=gcd(up,down);
       
       if(down==0){
           System.out.print(header+"("+up+","+down+") = ");
           System.out.println("Invalid!");
       }
       else if(up==0){
           System.out.print(header+"("+up+","+down+") = ");
                  System.out.println("0");
       }
       else{
           if(up>down){
           a=up/down;
           c=down/gcd;
           b=(up/gcd)-c*a;
           System.out.print(header+"("+up+","+down+") = ");
           if(b==0){
               System.out.println(a);
           }
           else{
           System.out.println(a+"+"+b+"/"+c);
       }}
          else if(up==down){
               System.out.print(header+"("+up+","+down+") = ");
           System.out.println(1);
           }
         else{
           b=up/gcd;
           c=down/gcd;
               System.out.print(header+"("+up+","+down+") = ");
           System.out.println(b+"/"+c);
       }
       
    }    
    }}


