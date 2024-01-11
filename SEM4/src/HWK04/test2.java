
import java.util.Stack;

public class test2 {

    static Stack<Integer> poleA = new Stack();  // A柱
    static Stack<Integer> poleB = new Stack();  // B柱
    static Stack<Integer> poleC = new Stack();  // C柱
    static int count = 1;

    public static void main(String[] args) {
        int n = 4;
        // 初始狀態: n個盤子均放在A柱上，並用編號1,2,3,..來代表
        for (int i = n; i >= 1; i--) { //n:最大的盤子，也代表盤子數
            poleA.push(i); // 一開始盤子都放在A柱 
        }
        printPoles("----- init -----");
        move(n, poleA, poleB, poleC);
        // DIY here
    }

    public static void printPoles(String msg) {
        System.out.println(msg);
        System.out.println("A: " + poleA);
        System.out.println("B: " + poleB);
        System.out.println("C: " + poleC);
    }

    //       start                  middle                   end  
    public static void move(int n, Stack<Integer> poleA, Stack<Integer> poleB, Stack<Integer> poleC) {
        
        if (n > 0) {
            move(n - 1, poleA, poleC, poleB);

            poleC.push(poleA.pop());

            printPoles("===step:" + (count++) + "===");
            move(n - 1, poleB, poleA, poleC);

        }
    }
}
