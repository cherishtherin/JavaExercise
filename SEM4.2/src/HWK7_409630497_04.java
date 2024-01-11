
class CircularList {

    private class Node {

        Object item;
        Node next;
    }
    private Node list = null; // 考慮方式一或方式二
    private int numItems = 0; // 目前串列中有幾個元素
    private int size = 3;

    void add(Object item) {
        /* DIY */
        add(numItems, item);
    }

    void add(int index, Object item) {
       
        Node temp = new Node();
        temp.item = item;

        if (index == 0) {
            temp.next = list;
            list = temp;
        } else {
            Node prev = find(index - 1);
            Node cur = prev.next;
            prev.next = temp;
            if (index == numItems) {
                temp.next = list;
            } else {
                temp.next = cur;
            }

        }

        numItems++;
    }

    Object remove(int index) {
        /* DIY */
        Node temp = new Node();
        if (index == 0) {
            temp = list;
            list = list.next;
        } else {
            Node prev = find(index - 1);
            Node cur = prev.next;
            temp = cur;
            prev.next = cur.next;
            if(index==numItems-1)prev.next=list;
        }
        
        numItems--;
        return temp.item;
    }

    private Node find(int index) {
        /* 假設可用 */
        if (index == 0) {
            return list;
        }
        Node cur = list;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur; // 自行修改
    }

    public String toString() {
        String s = "";
        Node cur=list;
        for (int i=0; i<numItems; i++) {
            s += cur.item + " ";
            cur=cur.next;
        }
        return s;
    }
}

public class HWK7_409630497_04 {

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
