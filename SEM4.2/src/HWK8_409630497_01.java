
class CircularList {

    private class Node {

        Object item;
        Node next;
       
    }
    private Node head = null,tail=null; // 考慮方式一或方式二
    
    private int numItems = 0; // 目前串列中有幾個元素
    private int size = 3;
    public int size(){
        return numItems;
    }
    void add(Object item) {
        /* DIY */
        add(numItems, item);
    }

    void add(int index, Object item) {
       
        Node temp = new Node();
        temp.item = item;

        if (index == 0) {
            temp.next = head;
            head = temp;
        } else {
            Node prev = find(index - 1);
            Node cur = prev.next;
            prev.next = temp;
            temp.next=cur;

        }if(index==numItems){
            tail=temp;
            tail.next=head;
        }

        numItems++;
    }

    Object remove(int index) {
        /* DIY */
        Node temp = new Node();
        if (index == 0) {
            temp=head;
            head = head.next;
            
        } else {
            Node prev = find(index - 1);
            Node cur = prev.next;
           if(index==numItems-1){
               tail=prev;
               tail.next=head;
           }
           else  prev.next = cur.next;
            
        }
        
        numItems--;
        return temp.item;
    }

    private Node find(int index) {
        /* 假設可用 */
        if (index >=size()-1)return tail; {
            
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur; // 自行修改
    }

    public String toString() {
        String s = "";
        Node cur=head;
        for (int i=0; i<numItems; i++) {
            s += cur.item + " ";
            cur=cur.next;
        }
        return s;
    }
}

public class HWK8_409630497_01 {

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.add("Peter");
        list.add("Paul");
        list.add("Mary");
        // 測試add()
        System.out.println("list=" + list);
        list.add(0, "Sam");
        System.out.println("list=" + list);
        list.add(2, "Zebra");
        System.out.println("list=" + list);
        // 測試remove()
        list.remove(2);
        list.remove(3);
        list.add("Moto");
        System.out.println("list=" + list);
    }
}
