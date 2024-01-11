
import java.util.*;

class IntSet {

    ArrayList<Integer> data;

    IntSet() {
        data = new ArrayList<>();
    }

    IntSet(Collection<Integer> c) {
        data = new ArrayList<>(c);
    }

    IntSet(IntSet s2) {
        data = new ArrayList<>(s2.data);
    }

    void add(Integer x) {
        data.add(x);
    }

    void add(Collection<Integer> c) {
        data.addAll(c);
    }

    void add(IntSet s2) {
        data.addAll(s2.data);
    }

    void clear() {
        data.clear();
    }

    boolean contains(Integer x) {
        return data.contains(x);
    }

    boolean remove(Integer x) {
        return data.remove(x);
    }

    IntSet union(IntSet s2) {
        IntSet s3 = new IntSet(this);
        // DIY here
        for (int i = 0; i < s2.data.size(); i++) {
            
            if(!s3.data.contains(s2.data.get(i)))s3.data.add(s2.data.get(i));
        }
        return s3;
    }

    IntSet intersect(IntSet s2) {
        IntSet s3 = new IntSet();
        // DIY here
        for (int i=0; i<s2.data.size(); i++){
            if (this.data.contains(s2.data.get(i)))s3.data.add(s2.data.get(i));
        }
        return s3;
    }

    IntSet excluOR(IntSet s2) {
        IntSet s3 = new IntSet(this.union(s2));
        
        // DIY here
        for (int i=0; i<this.data.size(); i++){
            if(s2.data.contains(this.data.get(i)))s3.data.remove(this.data.get(i));
        }
        return s3;
    }

    public String toString() {
        return data.toString();
    }

}

public class HWK01_409630497_03 {

    public static void main(String[] args) {
        IntSet s1 = new IntSet(List.of(1, 2, 3, 4, 5, 6));
        IntSet s2 = new IntSet(List.of(2, 4, 6, 18, 25));
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        System.out.println("------------------------------");

        IntSet s3 = s1.union(s2);
        System.out.println("s3=" + s3);
        IntSet s4 = s1.intersect(s2);
        System.out.println("s4=" + s4);
        IntSet s5 = s1.excluOR(s2);
        System.out.println("s5=" + s5);
    }
}
