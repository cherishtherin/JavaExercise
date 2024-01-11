
import java.util.Arrays;
import java.util.Stack ;
public class HWK5_409630497_01 {
    public static void main(String[] args) {
        double rlt = evalPostfixExpr("8 6 3 4 * + 3 / -") ;
        System.out.println("rlt="+rlt) ;
    }
    public static double evalPostfixExpr(String s) {
        // 假設s中的token都用一個空白格開
        String[] tokens = s.split(" ") ;
        Stack<Double> stk = new Stack<Double>() ;
        double a,b;
        for (int i = 0 ; i<tokens.length; i++) {
                // DIY here, 若token非+, - , *, /, 
                // 則用Double.parseDouble(tokens[i])轉換成數值
                
                switch(tokens[i]){
                    case "+":{
                        b=stk.pop();
                        a=stk.pop();
                        stk.push(a+b);
                        break;
                    }
                    case "-":{
                        b=stk.pop();
                        a=stk.pop();
                        stk.push(a-b);
                        break;
                    }
                    case "*":{
                        b=stk.pop();
                        a=stk.pop();
                        stk.push(a*b);
                        break;
                    }
                    case "/":{
                        b=stk.pop();
                        a=stk.pop();
                        stk.push(a/b);
                        break;
                    }
                    default :
                        stk.push(Double.parseDouble(tokens[i]));
                    
                }
        }
        return stk.peek() ;
    }
}	


