// 1. 將以下ArrayListX改為泛型版本<T>，讓main()中的測試程式程式可以順利執行。
// [程式片段]
import java.util.Arrays ;
class ArrayListX<T> {
    T[] data = (T[])new Object[10]; 
    // int [] data (int[]) new Object[10];
    int itemCnt=0;    
    
    ArrayListX() { }

    ArrayListX(int capacity) {
        // capacity指定ArrayList的最大容量
        if(capacity>data.length)
            data=(T[]) new Object[capacity];
        // DIY here
    }
    int size() { return itemCnt;}
    void add(T item) {  // 原為 Object item
        if (itemCnt<data.length) 
            data[itemCnt++] = item ;
        else
            System.out.println("List is full!");
    }
    Object get(int index) { // 原為 Object get(int index)
        return data[index] ;
    }
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, itemCnt)) ;
    }
}
class Memo {
    String date, content ;
    Memo(String d, String c) { this.date = d; this.content = c ;  }
    public String toString() { return "("+date+","+content+")" ;  }
}

public class HWK2_409630497_01 {
    public static void main(String[] args) {
        
        
        ArrayListX<Memo> memoList = new ArrayListX<>() ;
        memoList.add(new Memo("5/29","兵役體檢"));
        memoList.add(new Memo("6/11","期末考"));
        memoList.add(new Memo("6/18","幫忙搬家"));
        System.out.println("memoList="+memoList) ;
        System.out.println("memo[1]: "+memoList.get(1)) ; 
       
        
        // Test-2
        ArrayListX<Integer> list2 = new ArrayListX<>(5) ;
        for (int i=1; i<=5; i++) {
            list2.add(1000+i) ;
        }
        System.out.println("list2="+list2) ;          
        
    }
}


