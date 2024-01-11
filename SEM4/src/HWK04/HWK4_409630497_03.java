
/* 參考講義 P.42 */
import java.util.*;

class ListStack<T> {

    ArrayList<T> data = new ArrayList<>();

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean isFull() {
        return false;
    }
    // DIY: 完成以下函數

    public void push(T x) {
        data.add(x);
    }

    public T pop() {
        return data.remove(data.size()-1);
    }

    public T peek() {
        return data.get(data.size() - 1);
    }

    public String toString() {
        return data.toString();}
}

public class HWK4_409630497_03 {

    /* ========== 測試程式 ============= */
    public static void main(String[] args) {
        ListStack<Integer> stk = new ListStack<>();
        for (int i = 1; i <= 10; i++) {
            stk.push(i);
        }
        System.out.println("stk=" + stk);

        for (int i = 1; i <= 10; i++) {
            int x = stk.pop();
            System.out.print("pop:" + x + " ");
        }
        System.out.println();
    }
}
