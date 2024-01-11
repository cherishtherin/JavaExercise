
class P68_IntLinkedList { // 整數版
    // ==== Data Structure ===

    Node head = null;
    int numItems = 0; // 亦可用 int size = 0 ;

    class Node {

        int item;
        Node next;

        Node() {
        }

        Node(int item) {
            this.item = item;
        }

        Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    // ==== 建構式 =====

    P68_IntLinkedList() {
        
    }

    P68_IntLinkedList(P68_IntLinkedList L2) {
        // copy constructor: DIY 
        head = L2.head;
        numItems = L2.numItems;

        Node cur2 = L2.head;
        Node cur = head;
        while (cur2.next != null) {
            cur.next = new Node(cur2.item, null);
            cur = cur.next;
            cur2 = cur2.next;
        }
    }
    // ==== 成員函數 =====

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int size() {
        return numItems;
    }

    public void add(int item) {
        // DIY,  將item附加在串列末尾
        add(numItems, item);
        
    }

    public void add(int index, int item) {
        // DIY, 將item插入成為第index個元素，index由0 起算
        // number of elements: n
        // add(0,item), add(1,item), add(n-1,item), add(n, item)
        if (index < 0 || index > numItems) {
            return;
        }

        if (index == 0) {
            head = new Node(item, head);
        } else {
            Node prev = (find(index - 1));
            Node cur = prev.next;
            prev.next = new Node(item, cur);
        }
        numItems++;
    }

    public int get(int index) {
        if (index < 0 || index >= numItems) {
            System.out.println("out of bound");
            System.exit(1);
        }
        if (index == 0) {
            return head.item;
        }

        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.item; // DIY, 自行修改
    }

    public void remove(int index) {
        // DIY, 刪除串列中的第index個元素，index由0起算      
        if (index < 0 || index >= numItems) {
            System.out.println("out of bound");
            System.exit(1);
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node prev = find(index - 1);
            Node cur = prev.next;
            prev.next = cur.next;
        }
        numItems--;
    }
    // -- 傳回串列中的第index個節點(Node)的參考位置，index由0起算

//    private Node find(int index) {
//        return head; // DIY 自行修改
//    }
    private Node find(int index) {
        // index的範圍: 0 <= index <= numItems
        if (index < 0 || index > numItems) {
            return null; // 不妥，應該 report error!
        }
        Node cur = head; // cur指向第一個元素(index 0)
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    void display(String msg) {
        System.out.print(msg);
        Node cur = head;
        // DIY 
        String s = "";
        while (cur != null) {
            s += cur.item + " ";
            cur = cur.next;
        }
        System.out.println(s);
    }

    public boolean equals(Object obj) {
        P68_IntLinkedList L2 = (P68_IntLinkedList) obj;
        // 比較 this and L2 
        if (L2 == this) {
            return true;
        }
        if (this.size() != L2.size()) {
            return false;
        }
        Node cur1 = head;
        Node cur2 = L2.head;
        while (cur1.next != null) {
            if (cur1.item != cur2.item) {
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;

        }
        // DIY here
        return true;
    }

    public String toString() {
        String s = "";
        for (Node cur = head; cur != null; cur = cur.next) {
            s += cur.item + " ";
        }
        return s;
        // return "IntLinkedList"; // DIY 自行修改
    }
}

public class HWK7_409630497_01 {

    public static void main(String[] args) {
        P68_IntLinkedList L1 = new P68_IntLinkedList();
        for (int i = 10; i <= 40; i += 10) {
            L1.add(i);
        }
        L1.display("L1="); // L1=10 20 30 40

        L1.add(0, 8);
        L1.add(L1.size(), 55);
        System.out.println("L1=" + L1); // L1=[8,10,20,30,40,55]

        System.out.println("---- test get()---- ");
        for (int i = 0; i < L1.size(); i++) {
            int item = L1.get(i);
            System.out.print(item + " ");
        }
        System.out.println("");

        System.out.println("---- test remove(index) -----");
        L1.remove(2); // remove 20
        L1.remove(0); // remove 8
        L1.remove(L1.size() - 1); // remove 55
        System.out.println("L1=" + L1); // L1=[10,30,40]
    }
}
