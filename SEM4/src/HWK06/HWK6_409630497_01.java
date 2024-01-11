class LinearIntQueue {
    // Data Structure 
    private static final int MAX_QUEUE = 8 ;
    int[] items ;
    int front, back, size, capacity ;

    public LinearIntQueue() { this(MAX_QUEUE); }
    public LinearIntQueue(int cap) {
        if (cap<1) cap = MAX_QUEUE ;
        capacity = cap ;
        items = new int[capacity] ;
        front = 0; back = -1; size = 0 ; // why?
    }
    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size==capacity;}
    private void errHandle(String msg) {
        System.out.println(msg) ;
        System.exit(0) ;
    }
    public int front() {
        if (isEmpty()) errHandle("Queue:peek() fails");
        return items[front] ;
    }
    public void enqueue(int x) {
        // DIY 
        
        if(back==items.length-1)compact();
        size++;
        items[++back]=x;
    }
    public int dequeue() {
        size--;
        return items[front++] ; // DIY 自行修改
    }
    private void compact() {
        // DIY:　將Queue內容搬移，由items[0]開始存儲
         while(front!=0){
            for (int i=front-1; i<back; i++){//0 0 2 3 4
                items[i]=items[i+1];
            }
            front--;
            back--;
        }
    }
    public String toString() {
        StringBuffer sb = new StringBuffer(4*size) ;
        for (int i = front; i<= back; i++) {
                sb.append("[").append(items[i]).append("] ");
        }
        sb.append(" (front=").append(front).append(", back=").append(back).append(")") ;
        return sb.toString() ;
 
    }
}

public class HWK6_409630497_01 {
    public static void main(String[] args) {
        LinearIntQueue LQ = new LinearIntQueue(5) ; 
        for (int i=0; i<5; i++) {
            LQ.enqueue(i);
        }
        System.out.println("LQ="+LQ);
        int x1 = LQ.dequeue(), x2= LQ.dequeue() ; 
        System.out.println("dequeue twice =>"+x1+", "+x2);
        System.out.println("LQ="+LQ);
         LQ.enqueue(101);
        System.out.println("LQ="+LQ);
        System.out.println("front of LQ = "+LQ.front);
        
    }
}
