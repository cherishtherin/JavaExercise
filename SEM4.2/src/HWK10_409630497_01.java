import java.util.*;
public class HWK10_409630497_01 {
    public static void main (String[]args){
        HashMap<Integer, Integer> cntTable= new HashMap<>();
        for (int i=1; i<=6; i++)cntTable.put(i,0);
           System.out.println(cntTable);
           System.out.println("---------------");
        Random r = new Random(333);
        int times=1000;
        for (int i=0; i<times; i++){
            int point=1+r.nextInt(6);
            int y=cntTable.get(point)+1;
            cntTable.put(point,y);
        }
        System.out.println(cntTable);
    }
}
