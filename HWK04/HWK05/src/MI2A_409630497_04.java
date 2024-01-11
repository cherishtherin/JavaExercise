import java.util.*;
class StudentInfo {
    String id, name ;
    double[] avgScore; //  紀錄大學各學年的平均成績
    static int DEFAULT_SCORE = -1; 

    void setScore(int pos, double score) { // 設定第pos年的成績
        if (avgScore==null || pos<1 || pos>avgScore.length)  return ;
        this.avgScore[pos-1] = score ;
    }
    void set(int id, String name, double[] score) { // 8%
        this.id=Integer.toString(id);
        this.name= name;
        this.avgScore=score;
    }
    // DIY, getGrades(): 將各年平均分數對應至A-E，存於一字串陣列傳回, 7%
    // 80~: "A", 70-79: "B", 60-69:"C", 50-59:"D", 0-49: "E"
    String[] getGrades(){
        String [] x= new String[this.avgScore.length];
        for (int i=0; i<x.length; i++){
            if(this.avgScore[i]<50)x[i]="E";
            else if(this.avgScore[i]<60)x[i]="D";
            else if(this.avgScore[i]<70)x[i]="C";
            else if(this.avgScore[i]<80)x[i]="B";
            else x[i]="A";
        }
        return x;
    }

    void display() { // 5%
        System.out.print("["+id+"] "+name+" ");
        for (int i=0; i<this.avgScore.length; i++){
            System.out.print(" [y"+i+"] "+this.avgScore[i]);
        }
        System.out.println("");
    } 
}
public class MI2A_409630497_04 {
    public static void main(String[] args){
        StudentInfo card1 =new StudentInfo() ;
        double[] score = {75, 84, 63, 89, 55} ; 
        card1.set(1001, "Mary", score) ;
        card1.display() ; 

        StudentInfo card2 = new StudentInfo() ;
        card2.set(1002,"Peter", new double[]{85,78,88,85}) ; 
        card2.display() ;
        
        String[] gs = card1.getGrades() ; // [B, A, C, A, D]
        System.out.println("Grades of Mary="+Arrays.toString(gs));
    }
}
/* [程式輸出]
[1001] Mary [y1]75 [y2]84 [y3]63 [y4]89 [y5]55
[1002] Peter [y1]85 [y2]78 [y3]88 [y4]85
Grades of Mary=[B, A, C, A, D]
*/
