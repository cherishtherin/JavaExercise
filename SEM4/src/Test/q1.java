
import java.util.*;

class GenericArrayList<T> {

    private T[] items;
    private int size;// size is total element, .length is total max can be filled

    GenericArrayList(int n) {
        items = (T[]) new Object[n];

    }

    int size() {
        return size;
    }

    void add(T item) {
        items[size++] = item;
    }

    void add(int index, T item) { // 6%     
        // [功能]: 將item加入成為串列的第index元素    
        // (1) 若index不合法，則不做任何事，僅印出"add(): index不合法"1
        // (2) 若串列已滿，則將容量擴充為二倍，再進行插入動作 // DIY here 
        if (this.size >= items.length) {
            System.out.println("not enough space, double it");
            items = Arrays.copyOf(items, items.length * 2);
        } else if (index < 0 || index > size) {
            System.out.println("index out of bound");
            System.exit(1);
        }
        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = item;
        size++;
    }

    void addFirst(GenericArrayList<T> L2) {
        // 4%// DIY here, 將L2的元素加入本串列的前半部
        for (int i = L2.size-1; i >= 0; i--) {
            this.add(0, L2.items[i]);
        }
    }

    boolean isEqual(GenericArrayList<T> L2) { // 5%  
        // 比較this與L2二個串列的內容是否相同       
        // 若相同，回傳true，否則回傳false       
        if(this.size!=L2.size)return false;
        for (int i=0; i<size;i++){
            if(!this.items[i].equals(L2.items[i]))return false;
        }
        return true;
        // DIY 自行修改   
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, size()));
    }
}

public class q1 { // XX:成績座號   

    public static void main(String[] args) {
        GenericArrayList<String> L1 = new GenericArrayList(5);
        for (int i = 10; i <= 40; i += 10) {
            L1.add("A-" + i);
        }
        System.out.println("L1=" + L1);
        System.out.println("---- test add(index,item) ----");
        L1.add(0, "X-101");
        L1.add(2, "X-102");
        L1.add(L1.size(), "X-103");
        System.out.println("L1=" + L1);
        System.out.println("---- test addFirst(L2) ----");
        GenericArrayList<String> L2 = new GenericArrayList(5);
        for (int i = 201; i <= 204; i++) {
            L2.add("B-" + i);
        }
        L1.addFirst(L2);
        System.out.println("L1.addAll(L2), L1=" + L1);
        System.out.println("---- test isEqual(L2) ----");
        System.out.println("L1.isEqual(L2)=" + L1.isEqual(L2));
        System.out.println("L1.isEqual(L1)=" + L1.isEqual(L1));
    }
}

/* [程式輸出]
L1=[A-10, A-20, A-30, A-40]
---- test add(index,item) ----
L1=[X-101, A-10, X-102, A-20, A-30, A-40, X-103]
---- test addFirst(L2) ----L1.addAll(L2),
L1=[B-201, B-202, B-203, B-204, X-101, A-10, X-102, A-20, A-30, A-40, X-103]
---- test isEqual(L2) ----
L1.isEqual(L2)=false
L1.isEqual(L1)=true*/
