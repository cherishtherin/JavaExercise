class Frac { // 分數 
    int up, down ; // 表示分子與分母 up/down
    Frac() { }
    Frac(int a, int b) {
        this.up=a;
        this.down=b;
        int gcd=this.gcd();
       this.up=a/gcd;
       this.down=b/gcd;
       
    }
    
    int gcd(){
        int gcd=1;
        int less=Math.abs(up);
        if(Math.abs(up)>Math.abs(down))less=Math.abs(down);
        for (int i=2; i<=less; i++){
            if(Math.abs(up)%i==0 &&Math.abs(down)%i==0)gcd=i;
        }
        return gcd;
    }
    Frac(int i, double f) { // 6%
        // [功能]: 利用i+f實數來設定本物件之up與down
        //        例如i=1,f=0.3125->表示1.3125 -> 13125/10000
       
       this.up=(int)((f+i)*10000);
       this.down=10000;
        int gcd=this.gcd();
         this.up/=gcd;
       this.down/=gcd;
       
		// DIY here        
    }   
    Frac sub(Frac f2) { // 4%
        // [功能]: 將本物件與f2相減後，傳回計算結果(仍是分數)
		// DIY here   
      Frac f3= new Frac();
      f3.up= this.up*f2.down-f2.up*this.down;
      f3.down=f2.down*this.down ;
       int gcd=this.gcd();
         this.up/=gcd;
       this.down/=gcd;
        
      if(this.up==0)down=0;
     return f3;   
    }
    boolean greater(Frac f2) { // 4%
        // 利用sub()函數，判別本物件是否大於f2，若是回傳true，否則false
        //if((this.sub(f2).up>0 && this.sub(f2).down>0) || (this.sub(f2).up<0 && this.sub(f2).down<0))
            int up1, up2;
            up1=this.up*f2.down;
            up2=f2.up*this.down;
            
        return up1>up2;
    }
    //Frac f7 = f1.subAll(fs) ;
    Frac subAll(Frac[] fs) { // 6%
        // 將本物件減去fs[]中所有的分數，傳回計算結果，但本物件內容不變
        Frac x= this;
        for (int i=0; i<fs.length; i++){
            x=x.sub(fs[i]);
        }
        int gcd=x.gcd();
         x.up/=gcd;
       x.down/=gcd;
        return x ; // 自行刪除修改本行
    }
    void print(String header) {        
        
        System.out.println(header+this.up+"/"+this.down);
    }
    
}
public class MI2A_01 {
    public static void main(String[] args){
        // f1<-4/3, f2<-4/3, f3<=5/2
        Frac f1 = new Frac(4,3), f2=new Frac(8,6), f3=new Frac(5,2) ; 
        f1.print("f1=");    f2.print("f2=") ;   f3.print("f3=") ;

        Frac f4 = new Frac(1,0.3125), f5 = new Frac(2,0.25) ;        
        f4.print("f4=");    f5.print("f5=") ;        
        
        Frac f6 = f1.sub(f2) ;
        f6.print("f6=f1-f2=") ;  
        
        if (f1.greater(f2)) 
            System.out.println("f1>f2") ;
        else  
            System.out.println("f1<=f2") ;
        
        if (f3.greater(f1)) 
            System.out.println("f3>f1") ;
        else 
            System.out.println("f3<=f1") ;
        
        Frac[] fs = { new Frac(-5, 3), new Frac(10, 3), new Frac(9,3) } ;
        Frac f7 = f1.subAll(fs) ;
        
        f7.print("f7=f1-(-5/3)-(10/3)-(9/3)=");
    }
}
/*[程式輸出]
f1=4/3
f2=4/3
f3=0/1
f4=0/1
f5=513/32
f6=f5+3; f6=609/32
 */
