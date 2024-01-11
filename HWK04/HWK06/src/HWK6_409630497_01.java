
import java.util.* ; 
class ScoreCard {
    String name; 
    int score;
    void set(String n, int s) {
        this.name = n ; this.score = s ; 
    }
} 
public class HWK6_409630497_01 {
    public static void main(String[] args) {
    	 ScoreCard[] cards =   new ScoreCard[20]; 
         for (int i=0; i<cards.length; i++){
             cards[i]=new ScoreCard();
             
         }  // 記錄20位同學的成績資料卡
         
//         撰寫迴圈，產生20個成績卡(ScoreCard)物件
//        
        Random r = new Random(111) ; 
         randomFill(cards, r) ; 
         printCards(cards) ; 
    }
    public static void randomFill(ScoreCard [] a, Random r){
        for (int i=0; i<a.length; i++){
            a[i].name=Integer.toString(r.nextInt(1000));
            a[i].score=r.nextInt(101);
        }
    }
    public static void printCards(ScoreCard[]a){
        for (int i=0; i<a.length ;i++){
            System.out.println("["+(i+1)+"] Name "+a[i].name+"  "+a[i].score);
        }
    }
    // randomFill(cards, r): 8%
    // 參考講義p.43之說明，將cards[]陣列填入資料(配合使用亂數物件r)
    // [注意]: 名字不可重覆出現
    
    // printCards(cards): 5% 
    // 印出cards[]陣列內容，
}
/* [程式輸出]: 以下僅示範格式，亂數產生部分會有不同
[0] Name128 55
[1] Name074 87
....
[19] Name055 91
*/


 