
import java.util.*;

class Set<T> { // 使用串列來儲存集合內容    

    ArrayList<T> data;

    Set() {
        data = new ArrayList<>();
    }

    Set(ArrayList<T> d) {
        data = d;
    }

    void add(T item) {
        data.add(item);
    }

    Set<T> union(Set<T> s2) { // 5%    
        // [功能]: 傳回this與s2的聯集     
        Set ss = new Set();
        ss.data = this.data;
        for (int i = 0; i < s2.data.size(); i++) {
            if (ss.data.contains(s2.data.get(i))) {
                ss.data.remove(s2.data.get(i));
            }
        }
        for (int i = 0; i < s2.data.size(); i++) {
            ss.data.add(s2.data.get(i));
        }

        return ss; // DIY 自行修改   
    }

    void unify() { // 5%     
        // [功能]: 去除集合中重複的元素
        ArrayList x = new ArrayList<>();
        for (int i = 0; i < this.data.size(); i++) {
            if (!x.contains(this.data.get(i))) {
                x.add(this.data.get(i));
            }
        }
        this.data = x;
    }

    Set<T>[] split(int pno) { // 9%   
        // [功能]: 將本集合內容分成pno份，分別存於pno個Set<T>中   
        // [注意]: 本操作並不會改變本集合的內容    
        Set<T>[] rlt = new Set[pno];
        // DIY here      
        for (int i = 0; i < pno; i++) {
            rlt[i] = new Set();
        }
        int m=data.size()/pno;
        if(data.size()%pno!=0)m+=1;
        int d=0;
        for (int i=0; i<pno; i++){
            int cnt=0;
            while(cnt<m){
                if(d>=this.data.size())break;
                rlt[i].add(this.data.get(d));
                cnt++;
                d++;
            }
            
        }
            
        
        return rlt;
    }

    public String toString() {
        if (data == null) {
            return "NULL Set";
        }
        return data.toString();

    }
}

public class q2 {

    public static void main(String[] args) {
        Set<Integer> s1 = new Set<>();
        Set<Integer> s2 = new Set<>();
        s1.add(2);
        s1.add(3);
        s1.add(1);
        s1.add(5);
        s1.add(4);
        s2.add(8);
        s2.add(2);
        s2.add(9);
        s2.add(5);
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        System.out.println("s3=s1 U s2=" + s1.union(s2));
        Set<Integer> s3 = new Set<>();
        s3.add(2);
        s3.add(3);
        s3.add(2);
        s3.add(5);
        s3.add(3);
        s3.unify();
        System.out.println("s3.unify()=" + s3);
        Set<Integer> s4 = new Set<>();
        for (int i = 0; i < 16; i++) {
            s4.add(i);
        }
        System.out.println("s4=" + s4);
        Set<Integer>[] ss = s4.split(3);
        System.out.println("--- 將s4分成3份 ---");
        System.out.println("s4.split(3)=" + Arrays.toString(ss));
    }
}/* [程式輸出]
s1=[2, 3, 1, 5, 4]
s2=[8, 2, 9, 5]
s3=s1 U
s2=[3, 1, 4, 8, 2, 9, 5]
s3.unify()=[2, 3, 5]
s4=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
--- 將s4分成3份 ---
s4.split(3)=[[0, 1, 2, 3, 4, 5], [6, 7, 8, 9, 10, 11], [12, 13, 14, 15]]
 */
