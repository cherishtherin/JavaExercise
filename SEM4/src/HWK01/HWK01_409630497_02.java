

import java.util.*;

public class HWK01_409630497_02 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        ArrayList<Integer> s1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> s2 = new ArrayList<>(List.of(2, 4, 6, 18, 25));
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        System.out.println("-----------------------");
        ArrayList<Integer> s3 = new ArrayList<>();
        s3 = combine(s1, s2);
        System.out.println("s3=" + s3);
        ArrayList<Integer> s4 = new ArrayList<>();
        s4 = and(s1, s2);
        System.out.println("s4=" + s4);
        ArrayList<Integer> s5 = new ArrayList<>();
        s5 = xor(s1, s2);
        System.out.println("s5=" + s5);

    }

    public static ArrayList combine(ArrayList l1, ArrayList l2) {
        ArrayList<Integer> l3= new ArrayList<>();
        l3=l1;
        for (int i=0; i<l2.size(); i++){
            if(!l3.contains(l2.get(i)))l3.add((Integer)l2.get(i));
        }
        return l3;
    }

    public static ArrayList and(ArrayList l1, ArrayList l2) {
        ArrayList <Integer> l3= new ArrayList<>();
        
       for (int i=0; i<l1.size(); i++){
            if (l2.contains(l1.get(i)))l3.add((Integer)l1.get(i));
        }
       
       return l3;
    }

    public static ArrayList xor(ArrayList l1, ArrayList l2) {
      ArrayList <Integer> l3= new ArrayList<>();
      l3=combine(l1,l2);
      for (int i=0; i<l2.size(); i++){
          if(l3.contains(l2.get(i)))l3.remove(l2.get(i));
      }
       

        return l3;
    }
}
