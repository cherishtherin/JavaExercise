
import java.util.ArrayDeque;
import java.util.Random;

public class HWK6_409630497_05 {

    static int cnt = 0;
    static  ArrayDeque<Integer> Q ;


    public static void main(String[] args) {

        for (int p = 45; p <= 55; p++) {
            
            int avgQLen = examQueueLength(10, p / 100.0);
            System.out.println(">>> p=" + (p / 100.0) + ", AvgQLen=" + avgQLen);
            System.out.println("");
        }
    }

    /* 已知有一整數的ArrayDeque Q，又假定p為一機率值，完成以下函數
    (1)函數 int queueLength(double p) {...} 
       隨機產生一個[0,1]的實數亂數r，
        (a) 若r小於p，則對Q進行dequeue(若為空，則不動作)
        (b) 若r>=p則任意將一整數加入Q的末尾
       將上述流程執行1000次，記錄並回傳Q的長度。
    (2) 函數 int examQueueLength(passNo, prob) {...}
        呼叫queueLenght(p) passNo次，計算並回傳Q長度的平均值
     */
     
    public static int queueLength(double p) {
        Q=new ArrayDeque<>();
        cnt=0;
        while (cnt++ < 1000) {
            double r = 1-Math.random();
            if (r < p&&!Q.isEmpty()){
                Q.removeFirst();
            }
            else {
                Q.add(1);
            }
            
        }
        
        
        return Q.size();
    }

    public static int examQueueLength(int passNo, double prob) {
        
        System.out.println("---- examQueue Length(passNo=" + passNo + ", prob=" + prob + ")");
        int total = 0;int pr;
        for (int i = 1; i <= passNo; i++) {
            pr = queueLength(prob);
            total += pr;
            System.out.println("Pass-" + i + " Queue Size=" + queueLength(prob));

        }

        return total / passNo;
    }
}
/*[程式輸出] 
請參考QueueLenOutput.txt, 
由於亂數緣故，每次執行結果都會不同
 */
