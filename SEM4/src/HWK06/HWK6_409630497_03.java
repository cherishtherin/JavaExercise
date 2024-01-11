import java.util.Arrays;
class CircularQueue<T> {
    private static final int MAX_QUEUE = 8; // 可自行設定
    T[] items;
    int front, back, size, capacity;

    // --- 建構式 --- 
    public CircularQueue() {
        this(MAX_QUEUE);
    }
    public CircularQueue(int cap) {
        if (cap < 1) {
            cap = MAX_QUEUE;
        }
        capacity = cap;
        items = (T[]) new Object[capacity]; // = new T[capacity]; ????
        front = 0;
        back = -1;
        size = 0;
    }

    public void enqueue(T newItem) {
        back = (back + 1) % items.length;
        items[back] = newItem;
        size++;
    }
    // DIY 其他函數, dequeue()
    public T dequeue(){
        size--;
        T x= items[front++];
        front=front%items.length;
        return x;
    }
    
    public String toString() {
        
        // DIY here
        String ss="";
        if(front>back){
            for (int i=front; i<items.length; i++){
                ss+="["+items[i]+"]";
            }
            for (int i=0; i<=back; i++){
                ss+="["+items[i]+"]";
            }
        }
        else{
            for (int i=front; i<=back; i++){
                ss+="["+items[i]+"]";
            }
        }
        return ss+"(front="+front+", back="+back+")";
    }
}

public class HWK6_409630497_03 {

    public static void main(String[] args) {
        CircularQueue<Integer> q = new CircularQueue<Integer>(5) ;
        for (int i = 11; i<=14; i++) q.enqueue(i) ;
         System.out.println("q="+q);
        int x=q.dequeue() ; 	x= q.dequeue() ; // dequeue() 2次
        System.out.println("q="+q) ; // [13] [14] (fornt=2,back=3)

        q.enqueue(15); q.enqueue(16) ; q.enqueue(17) ;
        System.out.println("q="+q) ; //[13] [14] [15] [16] [17](front=2,back=1)
        q.dequeue(); q.dequeue(); q.dequeue(); q.dequeue() ;
        System.out.println("q="+q) ; // 印出啥?
    }
}
