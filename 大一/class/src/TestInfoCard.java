class InfoCard{
    int id;
    String name;
    Boolean gender;
    String comments;
}
class Frac{
    int up, down;
}
        

public class TestInfoCard {

    public static void main(String[] args) {
       InfoCard is= new InfoCard();
       is.id=123850;
       is.name="cherish";
       is.gender= true;
       is.comments="yay";
        System.out.println(is.id);
        
        
        //--------------frac--------------
        Frac d,a,x;
         d= new Frac();
        d.down=5;
        d.up=3;
        int d1= d.up, d2=d.down;
        a= new Frac();
        a.down=8;
        a.up=7;
        int a1= a.up, a2=a.down;
        x= new Frac();
        x.up=d1*a2+a1*d2;
        x.down=a2*d2;
        System.out.println(d1+"/"+d2+"+"+a1+"/"+a2+"="+x.up+"/"+x.down);
    }
}