import java.util.ArrayDeque ;
import java.util.Random;

public class NewClass {
    static int cnt = 0 ; 
    public static void main(String[] args) {
        for (int p=45; p<=55; p++) {
             int avgQLen = examQueueLength(10, p/100.0) ; 
             System.out.println(">>> p="+(p/100.0)+", AvgQLen="+avgQLen);
            
        }
    }
    /* 已知有一整數的ArrayDeque Q，又假定p為一機率值，完成以下函數
    (1)函數 int queueLength(double p) {...} 
       隨機產生一個[0,1]的實數亂數r，
        (a) 若r小於p，則對Q進行dequeue(若為空，則不動作)
        (b) 若r>=p則任意將一整數加入Q的末尾
       將上述流程執行1000次，記錄並回傳Q的長度。
        
   */
    public static int queueLength(double p){
        
        ArrayDeque<Integer> Q=new ArrayDeque<>();
        Random r=new Random();
        
        for (int i = 0; i <= 1000; i++) {
           
            double v =  r.nextInt(1 - 0 + 1);
           
            if(v<p){
                if(Q.isEmpty()==false){
                    Q.remove();
                }
            } else{
                //Random v2 = new Random();
                
                Q.add(1);
            }
        }
        return Q.size();
    
    }
    
    /*
    (2) 函數 int examQueueLength(passNo, prob) {...}
        呼叫queueLenght(p) passNo次，計算並回傳Q長度的平均值
    */
    
    public static int examQueueLength(int passNo,double prob){
        System.out.println("---- examQueueLength(passNo= "+passNo+", prob= "+prob+") -----");
        ArrayDeque<Integer> Q  = new ArrayDeque<>();
        int all_Len = 0;
        for (int i = 1; i <= passNo; i++){
            int part_Len = queueLength(prob);
            System.out.println("pass-"+i+" Queue Size= "+part_Len);
            all_Len+=part_Len;
        }
        return all_Len/passNo;
        

       
    }
    
    
    
}
/*[程式輸出] 
請參考QueueLenOutput.txt, 
由於亂數緣故，每次執行結果都會不同
*/
