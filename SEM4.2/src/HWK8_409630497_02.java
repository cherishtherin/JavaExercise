

class LinkedListWithHeader {
    private class Node { 
        Object item; Node next; 
        Node() {}
        Node(Object obj, Node n) {item=obj; next=n;}
    }
    private Node head; 
    private int numItems;
    public LinkedListWithHeader() {
        head = new Node("x",null);
        numItems=0;
      
    }
    int size() {return numItems; }
    private Node find(int index) {
        Node cur = head ;
        for (int i = 0 ; i<=index ; i++) cur = cur.next ;
        return cur;
    }
    public void add(Object item) {
        add(size(), item) ;
    }
    public void add(int index, Object item) {
      
        // DIY here, 將item加入成為第index個元素(由0算起)
        Node temp = new Node();
        temp.item = item;

        if (index == 0) {
            temp.next=head.next;
            head.next = temp;
        } 
        
        else {
            Node prev = find(index - 1);
            temp.next=prev.next;
            prev.next=temp;

        }

        numItems++;

    }
    public Object remove(int index) { 
        Node prev= find(index-1);
        Node cur=prev.next;
        if(index==numItems-1){
            prev.next=null;
            
        }
        
        else prev.next=cur.next;
            numItems--; 
        return cur.item; // 傳回被刪除的元素
    }
    public String toString(){
        String s="";
        Node cur=head.next;
        for (int i=0; i<numItems; i++){
            s+=cur.item+"  ";
            cur=cur.next;
        }
        return s;
    }
}
public class HWK8_409630497_02 {
    public static void main(String[] args) {
        LinkedListWithHeader list = new LinkedListWithHeader() ;
        list.add("Peter"); list.add("Paul"); list.add("Mary") ;
        // 測試add()
        System.out.println("list="+list);
        list.add(0,"Sam"); 	System.out.println("list="+list);
        list.add(2,"Zebra"); System.out.println("list="+list);	
        // 測試remove()
        list.remove(2); list.remove(3); list.add("Moto");
        System.out.println("list="+list);	
    }	    
}
