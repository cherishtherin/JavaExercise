
class Matrix {

    double[][] v;
    int r, c; // 為了簡化程式, 特別用二個變數來儲存列數與欄數
    // === 建構式(Constructors) ===

    Matrix() {
    }

    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        this.v = new double[r][c];
    }

    Matrix(double[][] v2) {
        r = v2.length;
        c = v2[0].length;
        v = new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                v[i][j] = v2[i][j];
            }
        }
    }

    Matrix(Matrix m2) {
        this(m2.v);
    }

    // === 操作函數(Operation functions) ===
    Matrix transpose() { // 傳回矩陣轉置後的結果
        Matrix m2 = new Matrix(c, r);
        for (int i = 0; i < m2.r; i++) {
            for (int j = 0; j < m2.c; j++) {
                m2.v[i][j] = this.v[j][i];
                /*DIY */
            }
        }
        return m2;
    }

    Matrix add(Matrix m2) {
        Matrix m3 = new Matrix(this);
        // DIY 
        for (int i = 0; i < m2.v.length; i++) {
            for (int j = 0; j < m2.v[i].length; j++) {
                m3.v[i][j] = m2.v[i][j] + m2.v[i][j];
            }
        }
        return m3;
    }

    Matrix mul(Matrix m2) {
        Matrix m3 = new Matrix(r, m2.c);
        // DIY f
        for (int i = 0; i < m3.v.length; i++) {
            for (int j = 0; j < m3.v[i].length; j++) {
                m3.v[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    m3.v[i][j] += (v[i][k] * m2.v[k][j]);
                }
            }
        }
        return m3;
    }

    public String toString() {
        String s = "";
        // DIY here
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                s += v[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }
}

public class HWK07_03 {

    public static void main(String[] args) {
        double[][] v1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] v2 = {{1, 2}, {3, 4}, {5, 6}};
        Matrix m1 = new Matrix(v1), m2 = new Matrix(v2), m3, m4;
        System.out.println("m1=\n" + m1);
        System.out.println("m2=\n" + m2);

        m3 = m1.transpose();
        System.out.println("m3=transpose(m1)=\n" + m3);

        m3 = m1.add(m1);
        System.out.println("m3=m1+m1=\n" + m3);

        m3 = m1.mul(m2);
        System.out.println("m3=m1*m2=\n" + m3);
    }
}
/* [程式輸出]
m1=
1.0     2.0     3.0
4.0     5.0     6.0
m2=
1.0     2.0
3.0     4.0
5.0     6.0
m3=transpose(m1)=
1.0     4.0
2.0     5.0
3.0     6.0
m3=m1+m1=
2.0     4.0     6.0
8.0     10.0    12.0
m3=m1*m2=
22.0    28.0
49.0    64.0

 */