
class ID {

    private int id;

    ID(int a) {
        this.id = a;
    }

    void reset() {
        id = -1;
    }

    public String toString() {
        return id + "";
    }
}

class ScoreX extends ID {

    private float gpa;

    ScoreX(int a, float b) {
        super(a);
        this.gpa =b;
    }

    void reset() {
        // DIY 
        super.reset();
        this.gpa = -1;
    }
      public String toString() { /* DIY */
      return String.format(super.toString()+", %.1f",this.gpa);}
}

class RecordX extends ScoreX {

    private String comment;

    RecordX(int a, float b, String s) {
        super(a, b);
        this.comment = s;
    }

    void reset() {
        // DIY here       
        super.reset();
        this.comment = "XXX";
    }

    public String toString() {/* DIY */
        
        return "("+super.toString()+", "+this.comment+")" ;  }
}

public class HWK11_04 {

    public static void main(String[] args) {
        RecordX r = new RecordX(1001, 3.8f, "Good");
        System.out.println("Record=" + r); // 印出(1001,3.8,Good)
        r.reset(); // id=-1,  gpa=-1,  comment="XXX"
        System.out.println("Record=" + r); // 印出(-1,-1,XXX)
    }
}
