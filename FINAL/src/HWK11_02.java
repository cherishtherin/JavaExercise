
class A_Int {

    private int a;

    void set(int x) {
        a = x;
    }

    protected int get() {
        
        return a;
    }

    public String toString() {
        return String.valueOf(a);
    }
}

class Score extends A_Int {

    // 把父類別中的a做為學生的id之用 
    private float gpa;  // 0.0 -> 4.0 (8 byte?)

    /* DIY set(id,gpa) */
    void set(int a, float gpa) {
        this.gpa = gpa;
        super.set(a);
    }

    protected float getgpa() {
        return gpa;
    }
    public String toString(){
        return super.toString()+String.format("%.2f",gpa);
    }
}

class Record extends Score {

    private String comment;

    /*DIY set(id,gpa,comment)*/
    void set(int a, float x, String cm) {
        super.set(a, x);
        this.comment = cm;
    }

    protected String getcmnt() {
        return this.comment;
    }

    public String toString() {
        int id = super.get();
        float gpa = super.getgpa();
        return super.toString()+String.format("\t%s)",  this.comment);
    }
}

public class HWK11_02 {

    public static void main(String[] args) {
        Record r = new Record();
        r.set(1001, 3.14f, "Good"); // 設定r之a,gpa,comment 
        System.out.println(r);  // 覆寫toString()函數
    }
}
