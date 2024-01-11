class Frac{
    int up, down;
    
    Frac (int a, int b){
        up=a; down =b;
    }
    Frac (Frac f){
        this.up=f.up;
        this.down=f.down;
        
    }
    Frac(double x){
        int i=(int)x;
        double remain=x%i;
        int cnt=0;
        while(remain%0.1>0){
            remain%=0.1;
            cnt++;
        }
        int I_remain=(int)remain;
        down=(int)Math.pow(10,cnt);
        int gcd=1;
        for (int t=2; t<I_remain; t++){
           if(remain%t==0&&down%t==0) gcd=t;
        }
        down =down/gcd;
        up=I_remain/gcd+i*down;
        
    }
    public String toString(){
        return up+"/"+down;
    }
}
public class HWK7_01 {
 public static void main (String [] args){
     
     Frac f1= new Frac (3,5);
     Frac f2= new Frac (f1);
     Frac f3= new Frac (2.125);
     System.out.println(f1);
     System.out.println(f2);
     System.out.println(f3);
     
 }
    
    
    
}
