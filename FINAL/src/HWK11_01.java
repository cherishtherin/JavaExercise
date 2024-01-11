class Employee {
    int ID; String name ;
    Employee() { this.ID=-1; this.name="XXX"; }
    Employee(int id, String n) { ID=id; name=n;}
}
class Worker extends Employee {
    double hourPay ;	
    // 自行加入建構式與toString() 
    Worker (){super.ID=-1;super.name="XXX";this.hourPay=-1;}
    Worker(int id, String n,double hp){
    super.ID=id;
    super.name=n;
    this.hourPay=8.5;
}
    public String toString(){
        return this.ID+"\t"+this.name+"\t"+this.hourPay;
    }
}
public class HWK11_01 {
    public static void main(String[] args){
        Worker w1 = new Worker() ; // -1, XXX, -1
        Worker w2 = new Worker(1001,"Peter", 8.5) ;
        System.out.println(w1+", "+w2) ; // (-1,XXX,-1), (1001,Peter,8.5)
    }
}

