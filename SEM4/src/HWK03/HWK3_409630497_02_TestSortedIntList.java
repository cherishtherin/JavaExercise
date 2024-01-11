
import java.util.Arrays;

class SortedIntList { // 儲存由小到大排序的整數串列

    int DEFAULT_SIZE = 10;
    int[] items;
    int size = 0;

    // ====================================
    public SortedIntList() {
        items = new int[DEFAULT_SIZE];
    }

    public SortedIntList(int capacity) {
        items = new int[(capacity > 0) ? capacity : 1];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return items.length;
    }

    public void add(int data) {
        // DIY: 作法如下
        // 找到第一個比data大的元素(令其註標為index)	，
        //   (a) 若存在，則將data插入成為items[index]，其餘元素向後挪
        //   (b) 若不存在(串列為空或data是最大值)，則將data加在串列末端  
        
        if (size == 0 || data > items[size - 1]) {
            items[size++] = data;
        } else {
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (data < items[i]) {
                    index = i;break;
                }
            }
            for (int i = size-1; i >= index; i--) {
                items[i+1] = items[i];
            }
            items[index] = data;
            size++;
        }

    }

    public boolean remove(int data) {
        // DIY: (a) 在串列中刪除元素 data，並回傳true 
        //      (b) 若data不存在則do nothing，並回傳false
        int index=find(data);
        if(index==-1){
            return false;
        }
        
        for(int i=index; i<size-1; i++){
            items[i]=items[i+1];
        }
        size--;
        return true;
    }

    public int find(int data) {
        // DIY: 傳回data在items[]中的註標，若不存在傳回-1
        for (int i=0; i<size; i++){
            if(data==items[i])return i;
        }
        return -1;
    }

    public int get(int index) {
        if (index < 0 || index >= size()) {
            return Integer.MIN_VALUE;
        }
        return items[index];
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, size));
    }
}

public class HWK3_409630497_02_TestSortedIntList {

    public static void main(String[] args) {
        int[] data = {18, 23, 7, 3, 1, 9, 35, 28};
        SortedIntList sList = new SortedIntList(10);
        for (int i = 0; i < data.length; i++) {
            sList.add(data[i]);
        }
        System.out.println("sList=" + sList); // sList=[1,3,7,9,18,23,28,35]
        System.out.println("find(9)=" + sList.find(9)); // 3
        System.out.println("find(19)=" + sList.find(19)); // -1
        sList.remove(9); //刪除元素9
        System.out.println("remove(9), sList=" + sList);
    }
}
