
import java.util.*;
public class P115_ArithmeticCAI {
    public static double x1, x2;
    public static char op;
    public static Random r = new Random();
    public static String[] p_comments = {"Good!", "Excellent!", "Nice!"};
    public static String[] n_comments = {"Try Again!", "Not Bad But …^_*", "Keep Trying"};

    public static void main(String[] args) {
        double ans;
        boolean correct;
        int err_cnt = 0;
        Scanner cin = new Scanner(System.in);

        printTitle(); //印出系統Logo
        while (true) {
            setQuestion(); //以亂數設定題目
            System.out.print("CAI> " + x1 + op + x2 + "= ? ");
            ans = cin.nextDouble();
            correct = verifyAnswer(ans, x1, op, x2); //檢查答案是否正確
            showComment(correct); //依照答案正確與否隨機印出評語
            if (!correct) {
                err_cnt++;
            }
            if (err_cnt >= 3) {
                break;
            }
        }
    }
    // ****** 函數定義開始 ***** //
    public static void printTitle() {
        System.out.println("======================");
        System.out.println("===兒童四則運算練習===");
        System.out.println("======================");
    }
    public static void setQuestion() {
        char[] symbol = {'+', '-', '*', '/'};
        x1 = r.nextInt(10);
        op = symbol[r.nextInt(symbol.length)];
        x2 = r.nextInt(10);
    }
    public static boolean verifyAnswer(double ans, double x1, char op, double x2) {
        boolean correct = true;
        double x=0;
        if (op=='+'){
            x=x1+x2;
        }
        else if (op=='-'){
            x=x1-x2;
        }
        else if (op=='*'){
            x=x1*x2;
        }
        else if(op=='/'){
            x=x1/x2;
        }
        return ans==x;
    }
    public static void showComment(boolean correct) {
        int p_no = p_comments.length, n_no = n_comments.length;
        System.out.println(((correct) ? p_comments[r.nextInt(p_no)] : n_comments[r.nextInt(n_no)]));
    }
}
