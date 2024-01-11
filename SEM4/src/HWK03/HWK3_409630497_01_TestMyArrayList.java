
import java.util.*;
// 1. [MyArrayList]: 請先完成以下的indexOf(item), remove(item), remove(start,end), equals(obj)，
//    再使用test2()函數測試其功能。

class MyArrayList<T> {

    // --- [資料結構]: Data Structure of an Array List ----
    int DEFAULT_MAX_SIZE = 5;
    T[] items;
    int size = 0; // 就是之前的itemCnt

    // ---  [操作函數]: operation functions of Array List -----
    public MyArrayList() {
        items = (T[]) new Object[DEFAULT_MAX_SIZE];
    }

    MyArrayList(int capacity) {
        // 根據capacity設定串列容量，若size<DEFAULT_MAX_SIZE，則仍設定為5
        if (capacity < DEFAULT_MAX_SIZE) {
            capacity = DEFAULT_MAX_SIZE;
        }
        items = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return items.length;
    }

    public void add(T item) { // 將item加入串列末尾
        add(this.size(), item); // 轉發給add(index, item)來執行
    }

    public void add(int index, T item) { //將item加入，成為第index元素
        if (this.size >= items.length) {
            System.out.println("add(): list is full, size=" + size + ", double it!");
            items = Arrays.copyOf(items, items.length * 2);
        }
        if (index < 0 || index > size) {
            System.out.println("add(): index out of bound:" + index);
            System.exit(1);
        }
        // [特別要求] 若串列已滿，則將容量自動擴充為2倍，再進行後續元素的加入
        // 挪動index之後的元素(含index處的元素)，之後再將item加入成為items[index]
       for (int i=size-1; i>=index; i--){
           items[i+1]=items[i];
       }items[index]=item; size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("get(): index out of bound: " + index);
            System.exit(1);
        }
        return items[index];
    }

    public void set(int index, T item) {
        if (index < 0 || index >= size) {
            System.out.println("set(): index out of bound: " + index);
            System.exit(1);
        }
        items[index] = item;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("remove(): index out of bound: " + index);
        } else {
            for (int i=index; i<size-1; i++){
                items[i]=items[i+1];
            }size--;
        }
    }

    int indexOf(T item) {
        // DIY:  回傳item在items[]中的位置註標，若不存在，則回傳-1
        // [提示]: 請用物件的equals()函數進行物件(item)相等性比較
        //        例如，items[i].equals(item)會回傳true/false
        //        以表示items[i]與item是否相等
        for (int i = 0; i < size(); i++) {
            if (items[i].equals(item)) {
                return i;
            }

        }
        return -1;
    }

    void remove(T item) {
        // DIY, 刪除串列中所有與item相同的元素
        //      若不存在則do nothing
        if(indexOf(item)!=-1){
            for (int i=indexOf(item); i<size-1; i++){
                items[i]=items[i+1];
            }size--;
        }
    }

    void remove(int start, int end) {
        // DIY, 刪除註標start~end-1之元素(不包含end)         
        // [注意]: 1. start<=end，若非如此，請將其互換
        //        2. 只刪除合法範圍內的元素，若有超越邊界的元素，則予以忽略
        //           例如，若元素有10個，則remove(-3,5) -> remove(0,5)
        //                remove(4,20) -> remove(4,10)
       
        for (int i=start; i<end; i++){//1,2,3
            remove(items[start]);
        }
    }

    @Override
    public boolean equals(Object obj) {
        // [功能]: 比較二個串列是否相等，步驟如下: 
        // (1) 如果obj的參考位址與this相同，則傳回true
        if (obj == this) {
            return true;
        }
        // (2) 如果obj的類型不是MyArrayList，則傳回false
        if (!(obj instanceof MyArrayList)) {
            return false;
        }
        // (3) 將obj轉型為MyArrayList
        MyArrayList list2 = (MyArrayList) obj;
        // (4) 開始比較this與list2 (逐一比較元素)
        // DIY here
        
        for (int i=0; i<this.size(); i++){
            if(!this.items[i].equals(list2.items[i]))return false;
        }

        return true; // 自行修改
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, size));
    }
}

public class HWK3_409630497_01_TestMyArrayList {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        MyArrayList<String> L1 = new MyArrayList<>();
        System.out.println("------ test add(item) ----- ");
        for (int i = 1; i <= 9; i += 2) {
            L1.add("n0" + i);
        }
        System.out.println("L1=" + L1); // 1 3 5 7 9

        System.out.println("------ test add(index, item) ----- ");
        L1.add(0, "n11");
        L1.add(2, "n33");
        L1.add(L1.size(), "n99");
        System.out.println("L1=" + L1); // 11 1 33 3 5 7 9 99

        System.out.println("------ test remove(index) ----- ");
        L1.remove(0);
        L1.remove(L1.size());
        L1.remove(1);
        System.out.println("L1=" + L1); // 1 3 5 7 9
    }

    public static void test2() {
        MyArrayList<String> list1 = new MyArrayList<>(5); // 容量5
        for (int i = 1; i <= 5; i++) {
            list1.add("N" + i);
        }
        System.out.println("list1=" + list1);

        System.out.println("------ test add(index,item)自動擴展 ----- ");
        list1.add("N6");
        list1.add("N7");
        list1.add("N8");
        System.out.println("list1=" + list1); // list1=[N1, N2, N3, N4, N5, N6, N7, N8]

        System.out.println("------ test indexOf(item) ----- ");
        System.out.println("list.indexOf(\"N3\")=" + list1.indexOf("N3")); // 2
        System.out.println("list.indexOf(\"N9\")=" + list1.indexOf("N9")); // -1

        System.out.println("------ test remove(item) ----- ");
        list1.remove("N5");
        list1.remove("N7");
        list1.remove("N10");
        System.out.println("list1=" + list1); // list1=[N1, N2, N3, N4, N6, N8]

        System.out.println("------ test remove(start, end) ----- ");
        list1.remove(1, 4);
        System.out.println("list1=" + list1); // list1=[N1, N6, N8]

        System.out.println("------ test equals(list2) ----- ");
        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("N1");
        list2.add("N6");
        list2.add("N8");
        System.out.println("list1.equals(list2)=" + list1.equals(list2)); // true
        list2.remove("N8");
        list2.add("N9");
        System.out.println("list1.equals(list2)=" + list1.equals(list2)); // false
    }
}
