
import java.util.*;

/* 使用包含概念實現SortedList */
class SortedList_V1<T extends Comparable<T>> { //假設由小到大排序

    private final ArrayList<T> data = new ArrayList<>();

    int size() {
        return data.size();
    }

    public SortedList_V1() {
    }

    public void add(T item) {
        // DIY: (a) 使用data.get(i)為item在data中找到適當的位置
        //      (b) 再用data.add(index, item)將item加入
        // [提示]: 如何比較2個物件obj1,obj2的大小(不可用>,<)， 使用compareTo()函數
        //        令int x = obj1.compareTo(obj2) ;
        //        若x>0表示obj1比obj2大，x=0表示obj1與obj2相等，x<0表示obj1比obj2小
        if (data.isEmpty() || item.compareTo(data.get(data.size() - 1)) > 0) {
            data.add(item);
        } else {
            int index = 0;
            for (int i = 0; i < data.size(); i++) {
                if(item.compareTo(data.get(i))<0){
                    index=i;break;
                }
            }
            data.add(index, item);
        }

    }

    public boolean remove(T item) {
        return data.remove(item);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

public class HWK3_409630497_03_TestSortedList_Contain {

    public static void main(String[] args) {
        testCompareTo();

        String[] data = {"Mary", "Wendy", "Amber", "Cathy", "Lotus", "Peter"};
        SortedList_V1<String> sList = new SortedList_V1<>();
        for (int i = 0; i < data.length; i++) {
            sList.add(data[i]);
        }
        System.out.println("sList=" + sList); // [Amber, Cathy, Lotus, Mary, Peter, Wendy]

        sList.remove("Lotus"); //刪除元素9
        System.out.println("remove(Lotus), sList=" + sList);
    }

    public static void testCompareTo() {
        System.out.println("---- Test compareTo() ---");
        String s1 = "Hello", s2 = "World";
        int c1 = s1.compareTo(s2);
        int c2 = s2.compareTo(s1);
        int c3 = s1.compareTo(s1);
        System.out.printf("(%s).compareTo(%s)=%d\n", s1, s2, c1);
        System.out.printf("(%s).compareTo(%s)=%d\n", s2, s1, c2);
        System.out.printf("(%s).compareTo(%s)=%d\n", s1, s1, c3);
        System.out.println("------------------------");
    }
}
