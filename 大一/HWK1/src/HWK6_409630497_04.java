
import java.util.*;

public class HWK6_409630497_04 {

    static char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};

    static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public static void main(String[] args) {
// 共有7手牌，請正確判別其牌型    
        int[] h1 = {47, 46, 50, 48, 49};
// Straight flush, 同花順     
        int[] h2 = {2, 15, 26, 28, 41};
// Four of a kind, 四條      
        int[] h3 = {5, 18, 31, 25, 51};
// Full House, 葫蘆       
        int[] h4 = {4, 18, 32, 46, 47};
// Straght, 順子        
        int[] h5 = {10, 15, 20, 28, 41};
// Three of a kind, 三條    
        int[] h6 = {2, 13, 28, 30, 39};
// Two pairs, 二對       
        int[] h7 = {2, 20, 29, 37, 42};
// one pairs, 一對      
        int[][] setOfHands = {h1, h2, h3, h4, h5, h6, h7};
        for (int i = 0; i < setOfHands.length; i++) {
            System.out.println("-------------------------------");

            printCards("Hands" + (i + 1) + ": ", setOfHands[i]);
            checkPokerHands(setOfHands[i]);
        }
    }

    public static String cardString(int cardId) {
// 將cardID轉換為代表牌面的字串，例如15 -> 紅心2 (紅心是特殊符號)  
        return suits[cardId / 13] + ranks[cardId % 13];
    }

    public static void printCards(String header, int[] hands) {
// 印出某玩家手上所有的排    
        System.out.print(header);
        Arrays.sort(hands);
        for (int i = 0; i < hands.length; i++) {
            System.out.print(cardString(hands[i]) + " ");
        }
        System.out.println("");
    }

    public static void checkPokerHands(int[] hands) {
        // 根據傳來的一手牌(hands[], 5張)，判別其牌面牌型   
        Arrays.sort(hands); // 依照cardID由小到大排序     
        int[] pointPool = new int[13];
// 分別儲存點數是A,2,...,K的牌數    
        int[] suitPool = new int[4];
// 儲存四種花色的牌數    
        for (int i = 0; i < hands.length; i++) {
            pointPool[hands[i] % 13]++;
            suitPool[hands[i] / 13]++;
        }
        System.out.println("點數分布:" + Arrays.toString(pointPool));
        System.out.println("花色分布:" + Arrays.toString(suitPool));
        System.out.print("--> ");
        if(Straight(suitPool) && Flush(pointPool)){
            System.out.print("--> 同花順 (Straight flush)");
        }
        else if(Flush(pointPool)){
            System.out.print("順子(Flush)");
        }
        else{
            NumOfKind(pointPool);
        }
        System.out.println();
    }
    public static boolean Straight(int[] s){
        for(int x:s){
            if(x == 5) return true;
        }
        return false;
    }
    public static boolean Flush(int[] p){
        if(p[0] == 1){ // 10, j, q, k, 1
            for(int i = 9 ; i<12 ; i++){
                if(p[i] != 1) return false;
            }
            return true;
        }
        for(int i = 0 ; i<p.length ; i++){
            if(i < 10 && p[i] == 1){
                int count = 1;
                while(count < 5){
                    if(p[(i+count)%13] != 1) return false;
                    count ++;
                }
                if(count == 5) return true;
            }
        }
        return false;
    }
    public static void NumOfKind(int[] p){
        int[] p_c = new int[p.length];
        // [1, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.arraycopy(p, 0, p_c, 0, p.length);
        Arrays.sort(p_c); // 小->大
        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2]
        int index = p_c.length-1;
        if(p_c[index] == 4) {
            System.out.print("四條(Four of a kind)");
        }
        else if(p_c[index] == 3 && p_c[index-1] == 2){
            System.out.print("葫蘆(Full house)");
        }
        else if(p_c[index] == 3){
            System.out.print("三條(Three of a kind)");
        }
        else if(p_c[index] == 2 && p_c[index-1] == 2){
            System.out.print("二對(Two pairs)");
        }
        else if(p_c[index] == 2){
            System.out.print("一對(One pairs)");
        }
    }
}