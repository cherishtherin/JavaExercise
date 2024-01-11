package ch7_stack;

import java.util.Arrays;
import java.util.Stack;

public class NewClass {
    static String[] opr = {"+", "-", "*", "/", "%"};        

    public static void main(String[] args) {
        String exp = "8.5 - ( 6 + 3 * 4 ) / 3.5"; // 中置式
        System.out.println("exp=" + exp);

        String postfix = infixToPostfix(exp); // 中轉後
        System.out.println("postfix=" + postfix); // 印出後置式

        // double rlt = evalPostfixExpr("8.5 6 3 4 * + 3.5 / -") ;
        double rlt = evalPostfixExp(postfix); // 後置式求值
        System.out.println("rlt=" + rlt);
    }

    public static String infixToPostfix(String infix) {
        // 中置式轉後置式, DIY
        
        // infix to postfix  把運算符號放到  stk裡
        // 要考量優先順序      目前的 stk:  ["*"]   
        //如果後面遇到 + or -  (優先順序比較低)，  要先把 "*"  pop 出來，再放入"+" 
        
        
        String[] tokens=infix.split(" ");
        
        
        Stack<String> stk = new Stack<String>() ;
        
        StringBuilder ans = new StringBuilder();   // postfix  後的結果
        
        String op;
        String test="(";
        
        System.out.println(Arrays.toString(tokens));
        
        for(int i=0;i<tokens.length;i++){
            op=tokens[i];
            switch(op){
                case "(":   //  "(" 最優先  ==>直接 push
                    stk.push(op);
                    break; 
                    
                case "+":case "-": case "*" : case "/":     // 比優先序
                    while(stk.isEmpty()==false && precedence(stk.peek()) >=  precedence(op)  )
                        ans.append (  stk.pop()  );    //pop 出來的值 存到 ans(最後運算式)

                    stk.push(op);
                    break;
                    
                case ")":
                //遇到 ")" 時，開始從stk pop 值(pop 出來的 存到ans  )， 直到遇到 "(" 才停止
                    while(stk.isEmpty()==false &&stk.peek().equals("(")==false){
                        String a=stk.pop();
                        
                        ans.append(a);
                        ans.append(" ");
                    }
                    stk.pop();
                    //System.out.println("pop:");
                    break;
                
                default:    //  如果是數字的話 直接存到 ans 
                    ans.append(op);
                    ans.append(" ");
                    break;
                    
                    
            }
        }
        
        // 當運算式全部都檢查完後，把stk剩餘的全部pop 出來
        while(stk.empty()==false){
            ans.append( stk.pop() );
            ans.append(" ");
        }
        
        
        return ans.toString();  //StringBuilder 轉成  String
    }

    public static double evalPostfixExp(String postfix) {
        // 參考之前程式碼，假設token間都用一個空白格開
        String[] tokens = postfix.split(" ") ;
        //System.out.println("token");
        
        double a,b;
        
        Stack<Double> stk = new Stack<Double>() ;
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
                    
                    default:
                        stk.push(Double.parseDouble(tokens[i]));
                }
        }
        return stk.peek() ;
    }

    public static int precedence(String opr) { //Q:如何區別負號與減號?
        if (opr.equals("+") || opr.equals("-")) {
            return 1;
        } else if (opr.equals("*") || opr.equals("/") || opr.equals("%")) {
            return 2;
        } else {
            return 0;
        }
    }

    public static boolean isOperator(String[] opr, String token) {
        for (String op:opr) 
            if (token.equals(op)) return true ;
        return false;
    }
}
