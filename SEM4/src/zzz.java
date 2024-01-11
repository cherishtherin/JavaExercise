
import java.util.Stack;

public class zzz{
    static Stack<Integer> poleA = new Stack();  // A柱
    static Stack<Integer> poleB = new Stack();  // B柱
    static Stack<Integer> poleC = new Stack();  // C柱
    
    public static void main(String[] args) {
        
        //4>> 3 TO B
        //3>> 2 TO A
        //2>> 1 TO B
        int n = 4 ;
        // 初始狀態: n個盤子均放在A柱上，並用編號1,2,3,..來代表
        for (int i = n; i>=1; i--) { //n:最大的盤子，也代表盤子數
            poleA.push(i) ; // 一開始盤子都放在A柱 
        } 
        
        int input=n-1;
        while (input>0){
            poleB.push(poleA.pop());
            input--;
        }
        
        
        poleC.push(poleA.pop());
        
        int return_x=poleB.size();
        while(return_x>0){
            poleC.push(poleB.pop());
        return_x--;
        }
        
        
        printPoles("----- init -----");
//        a>b,(b>c)
//        a>b,a>c,b>c//2, b as mid,a src, c des
//                b>c, b>c,a>b,c>b,c>b// 
                
        // DIY here
        
    }
    public static void printPoles(String msg) {
        System.out.println(msg);
        System.out.println("A: "+poleA);
        System.out.println("B: "+poleB);
        System.out.println("C: "+poleC);
    }
   
}
