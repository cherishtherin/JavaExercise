/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWK02;

// 3. [MyArrayList] 完成以下程式中的DIY部分，使MyArrayList能正常運作。
import java.util.*;

// 3. [MyArrayList] 完成以下程式中的DIY部分，使MyArrayList能正常運作。
class MyArrayList<T> {

    // --- [資料結構]: Data Structure of an Array List ----
    int DEFAULT_MAX_SIZE = 5;
    T[] items;
    int size = 0; // 就是之前的itemCnt

    // ---  [操作函數]: operation functions of Array List -----
    public MyArrayList() {
        if(size==this.DEFAULT_MAX_SIZE)this.DEFAULT_MAX_SIZE++;
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
        if (this.size > items.length) {
            System.out.println("add():list is full! size=" + size);
            System.exit(1);
        }

        add(this.size(), item);
        // [建議]轉發給add(index, item)來執行
    }

    public void add(int index, T item) { //將item加入，成為第index元素
        if (this.size >= items.length) {
           
            items=Arrays.copyOf(items, items.length+1); // 結束程式執行，太粗魯???
        }
        if (index < 0 && index > size) {
            System.out.println("add(): index out of bound:" + index);
            System.exit(1);
        }
        // 挪動index之後的元素(含index處的元素)，之後再將item加入成為items[index]
        
       
       for (int i=size()-1; i>=index; i--){
           items[i+1]=items[i];
       }items[index]=item;
       size++;
    }

    public T get(int index) {
        if (index < 0 && index >= size) {
            System.out.println("get(): index out of bound: " + index);
            System.exit(1);
        }
        return items[index];
    }

    public void set(int index, T item) {
        if (index < 0 && index >= size) {
            System.out.println("set(): index out of bound: " + index);
            System.exit(1);
        }
        items[index] = item;
    }

    public void remove(int index) {
        if (index < 0 && index >= size) {
            System.out.println("remove(): index out of bound: " + index);
            System.exit(1);
        }
        // DIY here
        for (int i = index; i < size-1; i++) {
            items[i]=items[i+1];
        }
        size--;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, size));
    }
}
public class HWK2_409630497_03 {

    public static void main(String[] args) {

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
        System.out.println(L1.get(0));
    }
}
