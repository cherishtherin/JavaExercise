import java.util.*;


public class hwk6_1 {

    static char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
    static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static Random r = new Random(111);

    public static void main(String[] args) {
        int[] deck = new int[51];

//一開始假設紙牌依序排好   
        System.out.println("Originally, deck[] = ");
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        printCards(deck, 0, deck.length);
        System.out.println("");
        System.out.println("After Shuffling, deck[] = ");
        shuffle(deck, 1000);
// shuffle(deck, deck.length) ;  
        printCards(deck, 0, deck.length);
        System.out.println("");
        System.out.println("---- Dealing the cards -----");
        int playerNo = 4, cardNo = 5;
        int[][] cardsOfPlayer = new int[playerNo][cardNo];
// 發牌給4位梭哈玩家，每人5張     
        int start = 0; // 由牌堆deck[]中的第0張牌開始發起      
        dealCards(deck, start, cardsOfPlayer);
// DIY: 印出4位玩家的牌面，每位玩家一列    
    }
    public static String card(int numId){
        int a= numId/13;
        int b= numId%13;
        return suits[a]+ranks[b];
    }
    public static void printCards(int [] deck, int start, int end){
        for (int i=start; i<end; i++){
            if(i%13==0)System.out.println("");
            System.out.println(card(deck[i]));
        }
        
    }
    public static void shuffle(int[] deck, int x){
        int index;
        for (int i=0; i<x; i++){
            int a=r.nextInt(52);
            index=deck[0];
            deck[0]=deck[a];
            deck[a]=index;
        }
    }
    public static void dealCards(int []deck,int start,int [][] cardsOfPlayer){
        int index=0;
        for (int i=0; i<cardsOfPlayer[0].length; i++){//5
            for (int j=0; j<cardsOfPlayer.length; j++){
                cardsOfPlayer[i][j]=deck[index++];
            }
        }
    }
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class hwk6_1 {
    
}
