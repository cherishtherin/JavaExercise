/* 參考講義P41 */
import java.util.Arrays;
class GenericStack<T> {
	private final int MAX_LIST = 10 ;
	private T[] items ;
	private int top;
      
       
	// DIY here, size(), push(), pop(), peek(), toString()
        GenericStack(){
            items= (T[])new Object[MAX_LIST];
            
            top=-1;
        }
        int size(){
            return top+1;
        }
        void push(T item){
            items[++top]=item;
        }
        T pop(){
          
            return items[top--];
        }
        T peek(){
            return items[top];
        }
        
        public String toString(){
            return Arrays.toString(Arrays.copyOf(items,size()));
        }
}

public class HWK4_409630497_02 {
    public static void main(String[] args) {
	GenericStack<String> stk = new GenericStack<>() ;
       
	stk.push("Peter"); stk.push("Paul"); stk.push("Mary") ;
        System.out.println("stk="+stk);
        
	String s = stk.pop() ; 
        System.out.println("stk.pop()->"+s) ;
        
	System.out.println("peek()="+stk.peek()) ;
	System.out.println("size()="+stk.size()) ;
        System.out.println(stk);
        
    }
}

