package HWK02;
import java.util.ArrayList;
import java.util.Random;
class Point3D {
    int x,y,z ;
    
    Point3D(int a, int b, int c) {
        x =a; y=b; z= c ;
    }
    public String toString(){
        return "("+x+","+y+","+z+")";
    }
}

public class HWK2_409630497_02 {
    public static void main(String[] args) {
        // *** 本題請使用JDK內建的ArrayList
        // 宣告一個可以儲存Point3D物件的ArrayList容器pList
        Random r= new Random (111);
	ArrayList<Point3D> pList= new ArrayList<>();
        for (int i=0; i<60; i++){
            int x,y, z;
            x=r.nextInt(201);
            y=r.nextInt(201);
            z=r.nextInt(201);
            Point3D p= new Point3D(x,y,z);
            if(i%6==0)System.out.println("");
            System.out.print(p+"\t");
            
            pList.add(p);
        }
        System.out.println("");
        System.out.println("total distance:"+totaldist(pList));
        System.out.println("linear distance:"+lineardist(pList));
        
        // 用亂數產生60座標(x,y,z)，建立60個Point3D物件，依序放入List中
        // x,y,z介於[0,200]，亂數種子: 111 
        // 印出所有座標，每6個一列

        // 最後計算並印出 (1) 總飛行距離, (2)直線距離
    }
    public static double totaldist(ArrayList x){
        double sum=0;
        for (int i=1; i<x.size();i++){
            Point3D p1=(Point3D)x.get(i-1);
            Point3D p2=(Point3D)x.get(i);
            sum+=Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2)+Math.pow(p2.z-p1.z,2));
        }
        return sum;
    }
    public static double lineardist(ArrayList x){
        Point3D p1=(Point3D)x.get(0);
        Point3D p2=(Point3D)x.get(x.size()-1);
        return Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2)+Math.pow(p2.z-p1.z,2));
    }
}



