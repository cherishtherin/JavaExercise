

import java.util.* ;
class ListQueue<T> {
	ArrayList<T> data = new ArrayList<>() ;

	public boolean isEmpty() { return data.isEmpty();}
	public boolean isFull() { return false; }
	public void enqueue(   T  item) { data.add(item);}
	public    T   dequeue() { return isEmpty()?null:data.remove(0); }
	public    T   front() {  return data.get(0);}
	public String toString() { return data.toString(); }
}
public class HWK6_409630497_04 {
	// === 測試程式 ===
	public static void main(String[] args) {
            ListQueue<String> q =  new ListQueue<String>();
            q.enqueue("Peter"); q.enqueue("Mary"); q.enqueue("Paul") ;
            System.out.println("queue="+q) ;
            String  front = q.front()  ;
            System.out.println("Item ="+front) ;
	}
}

