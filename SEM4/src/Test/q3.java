import java.util.* ;

class ListStack<T> extends ArrayList<T> { // Stack繼承ArrayList
    
    ArrayList<T> data=new ArrayList<>();
    
    
    // 自行完成 push(x), pop(), peek(), toString(), 3%, 4%, 4%, 3%
    void push(T x){
        data.add(x);
    }
    
    T pop(){
        if(data.size()<=0){
            //System.out.println("null");
            return null;
        }
        else   
            return data.remove(data.size()-1);
        
    }
    
    T peek(){
        if(data.size()>0)
            return data.get(data.size()-1);
        return null;
    }
    
    @Override
    public String toString(){
       return data.toString();
    }
    
}
public class q3 {
    public static void main(String[] args) {
        ListStack<Integer> stk = new ListStack();

        for (int i = 1; i <= 10; i++) { stk.push(i);}
        System.out.println("stk=" + stk);

        for (int i = 1; i <= 10; i++) {
            int x = stk.pop();
            System.out.print("pop:" + x + " ");
        }
        System.out.println();
        System.out.println("pop again->"+stk.pop()) ;
        System.out.println("peek again->"+stk.peek()) ;        
    }    
}
/* [程式輸出]
stk=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
pop:10 pop:9 pop:8 pop:7 pop:6 pop:5 pop:4 pop:3 pop:2 pop:1 
pop again->null
peek again->null
*/
