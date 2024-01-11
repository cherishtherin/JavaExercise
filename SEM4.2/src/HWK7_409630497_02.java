
import java.util.* ;
public class HWK7_409630497_02 {        
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>() ;
		for (int i = 0 ; i<10; i++)
			list.add((int)(Math.random()*101)-50);//-50~50
		System.out.println("list="+list) ;

		int sum = sumUpList(list) ;
                System.out.println("sum="+sum);
		LinkedList<Integer> posList = positiveList(list) ;
		System.out.println("posList="+posList) ;
	}	
	public static int sumUpList(LinkedList<Integer> L) {
            int sum=0;
            for (int i=0; i<L.size(); i++){
             sum+=L.get(i);
            }
            return sum ;
	}
	public static LinkedList<Integer> positiveList(LinkedList<Integer> L){
            LinkedList<Integer> pList= new LinkedList<>();
            for (int i=0; i<L.size(); i++){
                if(L.get(i)>=0)pList.add(L.get(i));
            }
            return pList ;
	}
}

