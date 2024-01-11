
import java.util.Stack;
import java.util.Arrays;

public class HWK5_409630497_02 {

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
        String[] s = infix.split(" ");
        Stack<String> stk1 = new Stack<>();
        Stack<String> stk2 = new Stack<>();
        for (String x : s) {
            if (!isOperator(opr, x) && !x.equals("(") && !x.equals(")")) {
                stk1.push(x);
            } else if (x.equals(")")) {
                while(!stk2.peek().equals("(")){
                    stk1.push(stk2.pop());
                }stk2.pop();
            } else if (isOperator(opr, x) || x.equals("(")) {
                stk2.push(x);
            }
        }
        while(stk2.empty()==false){
            stk1.push(stk2.pop());
        }
        String res="";
        for (int i=0; i<stk1.size(); i++){
            res+=stk1.elementAt(i)+" ";
        }
        return res;
    }

    public static double evalPostfixExp(String postfix) {
        // 參考之前程式碼，假設token間都用一個空白格開
        
        Stack <Double> stk= new Stack<>();
        
        String []s= postfix.split(" ");
        double a,b;
        for (String x:s){
            switch(x){
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
                        stk.push(Double.parseDouble(x));
            }
        }
        
        return stk.peek();
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
        for (String op : opr) {
            if (token.equals(op)) {
                return true;
            }
        }
        return false;
    }
}
