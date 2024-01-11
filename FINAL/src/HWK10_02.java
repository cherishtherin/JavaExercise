class Employee { //公司員工
    int ID ;	String name ;  
    void set(int id, String n) {
	this.ID = id; this.name = n ;
    }
} 
class Worker  extends   Employee{ // 作業員 
    // int ID ;	String name ; 
    double hourPay ;
	// DIY: 自行加入set(), display(), calSalary()
    void set (int id, String name, double hour){
        super.set(id,name);
        this.hourPay=hour;
    }
    void display(){
        System.out.println("");
    }
    double calSalary(int hr){
        
        return hr*this.hourPay;
    }
}
public class HWK10_02 {
    public static void main(String[] args) {
	Worker w1 = new Worker() ;
	w1.set(1002,"Peter"); // OK ?
	w1.hourPay = 12 ; // US$12       
        
	Worker w2 = new Worker() ;
	w2.set(1002,"Peter",12.5); 
	w2.display() ;
	System.out.println(w2.calSalary(128)); // 128 hours        
    }
}

