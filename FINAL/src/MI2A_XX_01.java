//package MI2A_0104_Practice.EX1;

import java.util.* ; // for ArrayList
        
class MyList<T> extends ArrayList<T> {
    public static int addCnt = 0 ; // 記錄祖先類別提供的addLast()被呼叫幾次
    public void addDuplicate(T item, int n) { // 呼叫祖先類別提供的add(item)n次
        // DIY
        for (int i=0 ; i<n; i++){
            super.add(item);
        }
    }
    public boolean add (T item) { // 先呼叫祖先類別提供的addLast(item), 
        // DIY 
        boolean success= super.add(item);
        MyList.addCnt++;
        return true ; // 勿刪除此行
    }
   
}

public class MI2A_XX_01 {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>() ;
        intList.addDuplicate(10, 5); // 將元素10加入串列5次
        System.out.println("intList="+intList) ;  // 印出list1=[10, 10, 10, 10, 10] 
        
        MyList<String> strList = new MyList<>() ;
        for (int i = 0 ; i<3; i++) {
            strList.add("ID"+(1000+i)) ;
        }
        System.out.println("strList="+strList);
        System.out.println("#calls of addList()="+MyList.addCnt) ;
        // 印出 #calls of addList()=8
    }
}

