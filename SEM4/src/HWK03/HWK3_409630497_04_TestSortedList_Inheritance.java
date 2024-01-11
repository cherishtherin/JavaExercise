
import java.util.* ;

// 使用繼承概念實現SortedList
class SortedList_V2<T extends Comparable<T>> extends ArrayList<T> {
    public SortedList_V2() { super(); } // super() 可省略
    
    @Override
    public boolean add(T item) {
        // DIY: (a) 使用super.get(i)為item在串列中找到適當的位置
        //      (b) 再用super.add(index,item) 將item加入
       if(super.isEmpty()||item.compareTo(super.get(size()-1))>0){
           super.add(item);return true;
       }
       for (int i=0; i<super.size(); i++){
           if(item.compareTo(super.get(i))<0){
               super.add(i,item);return false;
           }
       }
        // [回傳值] 如果加入item確實造成串列的改變，則回傳true，否則回傳false
        return false; // 此處先假設always return true ;
    }
    @Override
    public boolean remove(Object item) { 
        // 如果item包含在串列中，則刪除之，並回傳true，否則回傳false
        if(!super.contains(item))return false;
        return super.remove(item); // super.可省略
    } 
    @Override
    public String toString() { return super.toString(); }
}

public class HWK3_409630497_04_TestSortedList_Inheritance {
    public static void main(String[] args) {
        String[] data={"Mary", "Wendy", "Amber", "Cathy", "Lotus", "Peter"} ;
        SortedList_V2<String> sList = new SortedList_V2<>() ;
        for (int i = 0 ; i<data.length; i++) sList.add(data[i]) ;
        System.out.println("sList="+sList) ; // [Amber, Cathy, Lotus, Mary, Peter, Wendy]
        
        sList.remove("Lotus"); //刪除元素9
        System.out.println("remove(Lotus), sList="+sList) ;
    }        
}
