/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class CircularIntQueue {
    // --- Data Structure ---
    private static final int MAX_QUEUE = 8 ; // 可自行設定
    int[] items ;
    int front, back, size, capacity ;
    // --- 建構式 --- 
    public CircularIntQueue() { this(MAX_QUEUE); }
    public CircularIntQueue(int cap) { // 同LinearIntQueue 
        // DIY 自行打一次
        if(cap<1)cap=this.MAX_QUEUE ;
        capacity=cap;
        items= new int[capacity];
        front=0;
        back=-1;
        size=0;
    }
    // --- 成員函數 --- 
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
        if (isFull()) errHandle("Queue:enqueue() fails") ;
        // DIY here
        size++;
        back=++back%items.length;
        items[back]=x;
    }
    public int dequeue() {
        if (isEmpty()) errHandle("Queue:dequeue() fails") ;
        // DIY 
        
        size--;
        int deq=items[front++];
        front=front%items.length;
        return deq ; // DIY 自行修改 4 0

    }
    public String toString() {
        StringBuffer sb = new StringBuffer(4*size+20) ;
        for (int i = 0 ; i<size; i++) {
           sb.append("[").append(items[(front+i)%capacity]).append("] ");
        }
        sb.append(" (front=").append(front).append(", back=").append(back).append(")") ;
        return sb.toString() ;
    }
}

public class HWK6_409630497_02 {
    public static void main(String[] args) {
        CircularIntQueue q = new CircularIntQueue(5) ;
        for (int i = 11; i<=14; i++) q.enqueue(i) ;
        System.out.println(q);
        int x=q.dequeue() ; 	x= q.dequeue() ; // dequeue() 2次
        System.out.println(q) ; // [13] [14] (fornt=2,back=3)
        
        q.enqueue(15); q.enqueue(16) ; q.enqueue(17) ;
        System.out.println(q) ; //[13] [14] [15] [16] [17](front=2,back=1)
        
        q.dequeue(); q.dequeue(); q.dequeue(); q.dequeue() ;
        System.out.println(q) ; // 印出啥?
    }    
}
