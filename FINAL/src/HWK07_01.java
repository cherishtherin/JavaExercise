
import java.util.*;

class Member {

    String name;
    int id;

    static final Member[] VIPList = new Member[10];
    static final Member defaultMem = new Member();

    static {  // static initialization block, 將靜態成員初始化
        for (int i = 0; i < VIPList.length; i++) {
            VIPList[i] = defaultMem;
        }
    }

    Member() {
        this.id = -1;
        this.name = "XXX";
    }

    Member(int d, String n) {
        this.id = d;
        this.name = n;
    }

    public boolean equals(Object obj) {
        Member m2 = (Member) obj;
        return this.name.equals(m2.name) && this.id == m2.id;
    }
    public String toString(){
        return "["+this.id+"]  "+this.name;
    }
}

public class HWK07_01 {

    public static void main(String[] args) {
        Member[] ms = new Member[100];
        for (int i = 0; i < ms.length; i++) {
            ms[i] = new Member(1000 + i, "Name_" + i);
        }
        Random r = new Random(111);
        int [] VIPList= new int [10];
        for (int i = 0; i < VIPList.length; i++) {
            VIPList[i]=r.nextInt(100);
            for (int j=i; j>=0; j--){
                if (VIPList[i]== VIPList[j]) VIPList[i]=r.nextInt(100);
            }
        }
        for (int i = 0; i < VIPList.length; i++) {
            
            System.out.println(ms[VIPList[i]]);
        }
        // 模擬電腦抽獎，隨機從ms[]中挑選10個VIP，將其記錄在VIPList[]中
        // 印出中獎名單-這十位VIP (VIP不可重複)

    }
}










//import java.util.* ;
//class Member {
//    String name; int id ;
//
//    static final Member[] VIPList=new Member[10]; 
//    static final Member defaultMem = new Member() ;
//    static {  // static initialization block, 將靜態成員初始化
//            for (int i = 0 ; i<VIPList.length ; i++) 
//                VIPList[i] = defaultMem ;
//    }
//    Member() { this.id=-1; this.name="XXX"; }
//    Member(int d, String n) { 
//        this.id=d; this.name=n; 
//    }
//    public boolean equals(Object obj) {
//        Member m2 = (Member)obj  ;
//        return this.name.equals(m2.name) && this.id==m2.id ;
//    }
//}
//
//public class HWK07_01{
//    public static void main(String[] args) {
//        Member[] ms = new Member[100] ;
//        for (int i=0; i<ms.length; i++) 
//                ms[i] = new Member(1000+i, "Name_"+i) ;
//        Random r = new Random(111) ;
//        // 模擬電腦抽獎，隨機從ms[]中挑選10個VIP，將其記錄在VIPList[]中
//        // 印出中獎名單-這十位VIP (VIP不可重複)
//        for (int i=0; i<Member.VIPList.length; i++){
//            Member.VIPList[i]=ms[r.nextInt(ms.length)];
//            for (int j=i-1; j>=0; j--){
//                if (Member.VIPList[i]==Member.VIPList[j]){
//                    Member.VIPList[i]=ms[r.nextInt(ms.length)];
//                }
//            }
//        }
//
//    } 
//}
