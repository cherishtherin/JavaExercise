
class LinkedListWithTail {

    private class Node {

        Object item;
        Node next;
    }
    private Node head = null, tail = null;
    private int numItems = 0;

    public int size() {
        return numItems;
    }

    private Node find(int index) {
        if (index >= size() - 1) {
            return tail;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    void add(Object item) {
        add(size(), item);
    }

    void add(int index, Object item) {
        Node temp = new Node();
        temp.item = item;
        if (index == 0) {
            temp.next = head;
            head = temp;
        } else {
            Node prev = find(index - 1), cur = prev.next;
            temp.next = cur;
            prev.next = temp;
        }
        if (index == numItems) {
            tail = temp; //don't move this line
        }
        numItems++;
    }

    Object remove(int index) {
        /* DIY */
        if (index < 0 || index >= numItems) {
            System.out.println("out of bound");
            System.exit(1);
        }
        Node temp = new Node();
        if (index == 0) {
            temp.item = head.item;
            head = head.next;

        } else {
            Node prev = find(index - 1);
            Node cur = prev.next;
            temp.item = cur.item;
            prev.next = cur.next;
            if(index==numItems-1)tail=prev;
        }

        numItems--;
        return temp.item;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node cur = find(0); cur != null; cur = cur.next) {
            sb.append("[").append(cur.item).append("] ");
        }
        return sb.toString();
    }
}

public class HWK7_409630497_03 {

    public static void main(String[] args) {
        LinkedListWithTail list = new LinkedListWithTail();
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
