
class GPAInfo {

    static final int defaultNo = 20;
    static final float defaultGPA = -1f;

    float[] GPAList;

    GPAInfo() {
        GPAList = new float[defaultNo];
        for (int i = 0; i < GPAList.length; i++) {
            GPAList[i] = defaultGPA;
        }

    }

    GPAInfo(int studNo, float gpa) {
       GPAList = new float[studNo];
        for (int i = 0; i < GPAList.length; i++) {
            GPAList[i] = gpa;
        }
        
    }
    void display(){
         for (int i = 0; i < GPAList.length; i++) {
             System.out.print("["+(i+1)+"]:"+GPAList[i]+"  ");
         }
         System.out.println("");
    }
    }

    public class HWK7_03 {

        public static void main(String[] args) {
            GPAInfo cg1 = new GPAInfo();
            cg1.display();
            GPAInfo cg2 = new GPAInfo(15, 3.0f);
            cg2.display();
        }
    }
