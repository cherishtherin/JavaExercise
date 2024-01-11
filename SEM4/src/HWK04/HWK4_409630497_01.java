

import java.util.* ;
class Brace {
    public static final Brace NULL_BRACE = new Brace(' ',0);
    char c ; // 儲存{或} 字元, open brace/close brace
    int pos; // 儲存出現的位置
    Brace(char c, int p) { this.c=c; this.pos=p;}
}

public class HWK4_409630497_01 {
    public static void main(String []args){
        System.out.println("Input test string for balance check");
//        String s = "{abc{de{fgh@-}}kk}"; // 或s=cin.next() ; 
//         String s = "{xy{abc{de{fgh@-}kk}"; // 位置3的{沒有可匹配的} 
         String s = "{abc de fgh@-}}kk}"; // 位置14的}沒有可匹配的{
        System.out.println(s) ;
        Brace brace = balanceCheck(s) ;
        if (brace== Brace.NULL_BRACE)
                System.out.println("{} balance check passed.") ; 
        else {
            // 根據b，印出清楚的錯誤訊息: (出錯位置)以及(缺左括號還是右括號)
            if(brace.c=='{'){
                System.out.println("left at "+brace.pos);
            }
            else if (brace.c=='}'){
                System.out.println("right at "+brace.pos);
            }
             
        } 
    }
    public static Brace balanceCheck(String s) {
        // 若{ }個數相等,回傳NULL_BRACE；若有問題，回傳出問題的Brace物件
        Stack<Brace> stk = new Stack<>() ;
        for (int i = 0 ; i<s.length(); i++) {
                char c = s.charAt(i) ;
                // (1) DIY here
                if(c=='{')stk.push(new Brace(c,i));
                else if(c=='}'){
                    if(stk.isEmpty())return new Brace(c,i);
                    stk.pop();
                }
        }
        if(!stk.isEmpty())return stk.peek();
        // (2) DIY here
        return Brace.NULL_BRACE; // 回傳NULL_BRACE常數物件，代表一切正常
    }
}

