
class Node {

    int item; // private int item ;
    Node next; // private Node next ;

    public Node() {
    }

    public Node(int newItem) {
        item = newItem;
        next = null;
    }

    public Node(int newItem, Node next) {
        item = newItem;
        this.next = next;
    }

    public String toString() {
        return String.valueOf(item);
    }
}

class IntLinkedList { // 整數版
    // ==== Data Structure ===

    Node head = null;
    int numItems = 0; // 亦可用 int size = 0 ;

    // ==== 建構式 =====
    IntLinkedList() {
    }

    IntLinkedList(IntLinkedList L2) {
        // copy constructor: DIY 
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

        if (this.isEmpty()) {
            head = new Node(item);

        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(item, null);
        }

        numItems++;
    }

    public void add(int index, int item) {
        // DIY, 將item插入成為第index個元素，index由0 起算
        Node newNode= new Node(item, head);
        if(index<0||index>numItems)System.out.println("out of index");
        
        else if (index==0){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node cur= head;
            for (int i=1; i<index; i++){//cur is the node before index
                cur=cur.next;
            }
            newNode.next=cur.next;
            cur.next=newNode;
            
        }
        
        numItems++;
    }

    public int get(int index) { // 取得的index節點的值(item)
        if(index<0||index>numItems){
            System.out.println("out of index");
            return Integer.MIN_VALUE;
        }
        else if (index==0)return head.item;
        Node cur= head;
        for (int i=0; i<index; i++){
            cur=cur.next;
        }
        
        return cur.item; // DIY, 自行修改
    }

    public void remove(int index) {
        // DIY, 刪除串列中的第index個元素，index由0起算
        if (index < 0 || index > numItems) {
            System.out.println("bound out of index");
        } else if (index == 0) {
            head = head.next;
        } else {
            Node prev = find(index - 1);
            Node cur = find(index);
            prev.next = cur.next;
        }
        numItems--;
    }

    // -- 傳回串列中的第index個節點(Node)的參考位置，index由0起算
    private Node find(int index) {
        if (index < 0 || index > numItems) {
            return null;
        } else if (index == 0) {
            return head;
        }

        Node cur = head;//index=0
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        
        return cur; // DIY 自行修改
    }

    void display(String msg) {
        System.out.print(msg);
        Node cur = head;
        // DIY 
        while(cur!=null){
            
            System.out.print(cur+" ");
            cur=cur.next;
        }
        System.out.println("");
    }

    public String toString() {
        String s="";
        Node cur=head;
        for (int i=0; i<numItems; i++){
            s+=(cur.item+" ");
            cur=cur.next;
        }
        return s; // DIY 自行修改
    }
}

public class HWK7_409630497_01 {

    public static void main(String[] args) {
        System.out.println("----- test add(item) ------");
        IntLinkedList L1 = new IntLinkedList();
        for (int i = 10; i <= 40; i += 10) {
            L1.add(i);
        }
        System.out.println("----- test display(msg) ------");
        L1.display("L1="); // L1=10 20 30 40

        System.out.println("----- test add(index,item) ------");
        
        L1.add(0, 8);
        L1.add(3, 25);
        L1.add(L1.size(), 55);
        System.out.println("L1=" + L1); // L1=[8,10,20,25,30,40,55]

        System.out.println("---- test get()---- ");
        for (int i = 0; i < L1.size(); i++) {
            int item = L1.get(i);
            System.out.print(item + " ");
        }
        System.out.println(""); // 8 10 20 25 30 40 55

        System.out.println("---- test remove(index) -----");
        L1.remove(2); // remove 20
        L1.remove(0); // remove 8
        L1.remove(L1.size() - 1); // remove 55
        System.out.println("L1=" + L1); // L1=[10,25,30,40]
    }
}
