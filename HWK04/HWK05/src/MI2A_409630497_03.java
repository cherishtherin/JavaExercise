class Frac { 
    int up, down; 
    void set(int u, int d) { 
        this.up = u;  this.down = d ;
    }
    int gcd(){
       int gcd=1,less;
       less=up;
       if(down<less)less=down;
       for (int i=2; i<less; i++){
           if (up%i==0&&down%i==0){
               gcd=i;
           }
       }
       return gcd;
    }
    Frac add(Frac f2) {  // 5%
        Frac x= new Frac();
        x.up=up*f2.down+f2.up*down;
        x.down =down*f2.down;
        int gcd= x.gcd();
        x.up/=gcd;
        x.down/=gcd;
        return x  ; // 自行修改本行
    }
    Frac mul(Frac f2) { // 5%
        Frac x= new Frac();
        x.up=f2.up*up;
        x.down=f2.down*down;
        int gcd= x.gcd();
        x.up/=gcd;
        x.down/=gcd;
        return x; // 自行修改本行
    }
    void print(String header) {  // 3%
        System.out.println(header+up+"/"+down);       
    }
}
public class MI2A_409630497_03 {
    public static void main(String[] args){
        Frac f1 = new Frac(), f2 = new Frac() ; 
        f1.set(3, 5) ;  f2.set(10, 9) ; //f1=3/5,  f2=10/9
        f1.print("f1="); f2.print("f2=") ; 
        Frac f3 = f1.add(f2) ; // f3 = f1+f2 
        Frac f4 = f1.mul(f2) ; // f4 = f1*f2
        if (f3!=null && f4!=null) {
            f3.print("f3=f1+f2=") ; f4.print("f4=f1*f2="); 
        } else {
            System.out.println("f3, f4 is null!");
        }
    }
}
/* [程式輸出]
f1=3/5
f2=10/9
f3=f1+f2=77/45
f4=f1*f2=2/3
*/
