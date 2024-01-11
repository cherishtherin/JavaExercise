package ExtremeValue;

import java.util.*;
import java.util.Arrays;
import java.text.DecimalFormat;
class Function {

    String str_func;
    ArrayList<Double> coefficient;
    String opr;
    Double constant;

    Function() {

    }

    Function(String s) {
        str_func = s;
        coefficient = new ArrayList<>();
        String[] ss = s.split(" ");
        for (int i = 0; i < ss.length - 2; i++) {
            this.coefficient.add(Double.parseDouble(ss[i]));
        }
        opr = ss[ss.length - 2];
        constant = Double.parseDouble(ss[ss.length - 1]);
    }

    String getFunction() {
        String s = "";

        for (int i = 0; i < this.coefficient.size(); i++) {

            if (this.coefficient.get(i) >= 0 && i != 0) {
                s += "+";
            }
            if (this.coefficient.get(i) == this.coefficient.get(i).intValue()) {
                s += this.coefficient.get(i).intValue() + "X" + i + " ";
            } else {
                s += this.coefficient.get(i) + "X" + i + " ";
            }

        }

        return s + this.opr + " " + this.constant;
    }

    public int getVar() {
        return coefficient.size();
    }

    public void formatNeg() {
        for (int i = 0; i < coefficient.size(); i++) {
            coefficient.set(i, coefficient.get(i) * (-1));

        }
        if (opr.equals("<=")) {
            opr = ">=";
        } else if (opr.equals(">=")) {
            opr = "<=";
        }
        constant = constant * (-1);
    }

    void format(int varM) {
        while (coefficient.size() < varM) {
            this.coefficient.add(0.0);
        }

    }

    public String toString() {
        String s = getFunction();

        return s;
    }

}

class TFunction {

    String str_func;
    ArrayList<Double> coefficient;
    Double val;

    TFunction(String s) {
        str_func = s;
        coefficient = new ArrayList<>();
        String[] ss = s.split(" ");
        for (int i = 0; i < ss.length; i++) {
            this.coefficient.add(Double.parseDouble(ss[i]));
        }
        val = 0.0;
    }

    String getFunction() {
        String s = "";

        for (int i = 0; i < this.coefficient.size(); i++) {

            if (this.coefficient.get(i) >= 0 && i != 0) {
                s += "+";
            }
            if (this.coefficient.get(i) == this.coefficient.get(i).intValue()) {
                s += this.coefficient.get(i).intValue() + "X" + i + " ";
            } else {
                s += this.coefficient.get(i) + "X" + i + " ";
            }

        }

        return s;
    }

    double[] getArr(int len) {
        double[] x = new double[len + 2];

        x[0] = 1;
        for (int i = 1; i < x.length; i++) {
            x[i] = 0;
        }
        for (int i = 0; i < this.coefficient.size(); i++) {
            x[i + 1] = this.coefficient.get(i) * (-1);
        }
        x[x.length - 1] = val;
        return x;
    }

    public void printArr(int len) {
        double[] x = getArr(len);
        System.out.println(Arrays.toString(x));
    }

    boolean AllPositive() {
        for (int i = 0; i < this.coefficient.size(); i++) {
            if (this.coefficient.get(i) < 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String s = "P=" + getFunction();

        return s;
    }
}

class FunctionSet {

    ArrayList<Function> sys;
    int cnt;

    FunctionSet() {
        sys = new ArrayList<>();
        cnt = 0;
    }

    void Add(Function fx) {
        sys.add(fx);
        cnt++;
    }

    int getVar() {
        int varMax = 0;
        for (int i = 0; i < sys.size(); i++) {
            if (sys.get(i).getVar() > varMax) {
                varMax = sys.get(i).getVar();
            }
        }
        return varMax;
    }

    void format() {

        int varM = this.getVar();
        for (int i = 0; i < sys.size(); i++) {
            while (sys.get(i).getVar() < varM) {
                sys.get(i).coefficient.add(0.0);
            }
        }

    }

    void calcFormatMax() {
        for (int i = 0; i < cnt; i++) {
            if (!sys.get(i).opr.equals("<=")) {
                sys.get(i).formatNeg();
            }
        }
    }

    void calcFormatMin() {
        for (int i = 0; i < cnt; i++) {
            if (!sys.get(i).opr.equals(">=")) {
                sys.get(i).formatNeg();
            }
        }
    }

    double[][] getArray() {

        double[][] tbl = new double[cnt][getVar() + cnt + 2];
        for (int i = 0; i < tbl.length; i++) {
            for (int j = 0; j < tbl[i].length; j++) {
                tbl[i][j] = 0;
            }
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < this.getVar(); j++) {
                tbl[i][j + 1] = sys.get(i).coefficient.get(j);
            }
            tbl[i][getVar() + i + 1] = 1;
            tbl[i][getVar() + cnt + 1] = sys.get(i).constant;
        }
        return tbl;
    }

    void printArr() {
        double[][] tbl = getArray();
        for (int i = 0; i < tbl.length; i++) {
            System.out.println(Arrays.toString(tbl[i]));
        }
    }

    public String toString() {
        System.out.println("------ Printing System Funcion ------");
        format();
        String s = "";
        for (int i = 0; i < sys.size(); i++) {
            s += sys.get(i).getFunction() + "\n";
        }
        return s;
    }
}

   

public class ExtremeValue_409630497 {

    public static TFunction P;
    public static FunctionSet Set;
    public static int Type;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("------Please input the coefficient value as example bellow-----");
        System.out.println("/*Do note to add spacing in before each value or equation");
        System.out.println("[input] 5 + 0 + 3 - 2 <= 20");
        System.out.println(">>> 5x1 + x3 - 2x4 <= 20");

        System.out.println("[input]exit");
        System.out.println(">>> to finish input function");
        int cnt = 0;
        Set = new FunctionSet();
        while (true) {
            System.out.println("------ Input function " + cnt + " ------");

            String s = cin.nextLine();

            if (s.equalsIgnoreCase("exit")) {
                System.out.println("------ Input target function ------");
                String ss = cin.nextLine();
                P = new TFunction(ss);
                System.out.println("------ Enter [Max] or [Min]------");
                String type = cin.nextLine();
                if (type.equalsIgnoreCase("max")) {
                    Type = 1;
                } else if (type.equalsIgnoreCase("min")) {
                    Type = 2;
                }
                break;
            }
            Function fx = new Function(s);

            Set.Add(fx);
            cnt++;
        }
        System.out.println(Set);
        System.out.print(P);
        if (Type == 1) {
            System.out.println("   (Max)");
        } else if (Type == 2) {
            System.out.println("    (Min)");
        }
        System.out.println("------ Format -------");

        System.out.println(Set);//print functions
        System.out.println(P);//print target p

        System.out.println(Execute()); //print type
        System.out.println("------ Base Matrix -------");
        Set.printArr();
        P.printArr(Set.getVar() + Set.cnt);
        System.out.println("");
        System.out.println("");
        NormalExtremeMax();
    }

    public static String Execute() {
        if (Type == 1) {
            Set.calcFormatMax();
            for (int i = 0; i < Set.cnt; i++) {
                if (Set.sys.get(i).constant < 0) {
                    return "Mixed Max";
                }

            }
            return "Normal Max";
        } else if (Type == 2) {
            Set.calcFormatMin();
            for (int i = 0; i < Set.cnt; i++) {
                if (Set.sys.get(i).constant < 0) {
                    return "Mixed Min";
                }
            }
            if (P.AllPositive()) {
                return "Normal Min";
            }
        }
        return " non";
    }

    public static void NormalExtremeMax() {
        double[] value = P.getArr(Set.getVar() + Set.cnt);
        double[][] matrix = Set.getArray();
        
        int cnt=1;
        while (checker(value) != -1) {
            System.out.println("--------Calculation "+cnt+"----------");
        int col = checker(value);
       
        int row=0;
        double min= Double.MAX_VALUE;
        for (int i = 0; i < Set.cnt; i++) {
            if(matrix[i][matrix[i].length-1] / matrix[i][col]<min){
                min=matrix[i][matrix[i].length-1] / matrix[i][col];
                row=i;
            }
            
        }
        
       
        double pivot = Math.round(matrix[row][col]);//setting pivot to 1
       System.out.printf("Pivot= %.2f" ,pivot);
            System.out.println(" at row "+row+" column "+col);
        for (int j = 0; j < matrix[row].length; j++) {
            matrix[row][j] /= pivot;
        }
        printMatrix(matrix, value);
        System.out.println("");
        //setting other rows to 0
        double divider;
        for (int i = 0; i < Set.cnt; i++) {
            if (i == row || matrix[i][col] == 0); else {
                divider = matrix[i][col] * -1;
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] += matrix[row][j] * divider;

                }
            }
        }
        //P to 0
        divider=value[col]*(-1);
        for (int j = 0; j < value.length; j++) {
            value[j]+=matrix[row][j] * divider;
        }
        printMatrix(matrix, value);
        cnt++;
}     
       printAns(matrix,value);
    }

    public static void NormalExtremeMin() {

    }

    public static void NormalMixedMax() {

    }

    public static void NormalMixedMin() {

    }

    public static int checker(double[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void printMatrix(double[][] sys, double[] target) {
        for (int i = 0; i < sys.length; i++) {
            System.out.print("[");
            for (int j=0; j<sys[0].length; j++){
                System.out.printf("%.2f ",sys[i][j]);
            }
            System.out.println("]");
        }
         System.out.print("[");
            for (int j=0; j<target.length; j++){
                System.out.printf("%.2f ",target[j]);
            }
         System.out.println("]");
    }
     public static void printAns(double[][] sys, double[] target) {
         int [] bv= new int[sys.length];
         for (int i=0; i<bv.length; i++){
             for (int j=0; j<sys[0].length; j++){
                 if(sys[i][j]==1){
                     bv[i]=j;
                     break;
                 }
             }
             
         }
         System.out.println("-----Answer-----");
         int degree= (sys[0].length-sys.length-2);
        for (int i=0; i<bv.length; i++){
             if(bv[i]>0&&bv[i]<=degree){//x=sys[0].length-sys.length-2
                 System.out.print("x"+ bv[i]);
                 System.out.printf("= %.3f", sys[i][sys[0].length-1]);
             }
             else {
                 System.out.print("s"+ (bv[i]-degree));
                 System.out.printf("= %.3f", sys[i][sys[0].length-1]);
             }
             System.out.print ("  ");
         }
         System.out.println("");
         System.out.printf("Max= %.2f\n",target[target.length-1]);
     }
}

