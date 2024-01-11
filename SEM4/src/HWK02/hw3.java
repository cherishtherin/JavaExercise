

import java.util.ArrayList;
import java.util.Random;

//2. [ArrayList應用]: 請依照程式中的說明完成無人機軌跡距離計算。
class Point3D {
    int x,y,z ;
    Point3D(int a, int b, int c) {
        x =a; y=b; z= c ;
    }
    
    @Override
    public String toString(){
        //return "("+x+" "+y+" "+z+")";
        return String.format("(%3d,%3d,%3d)", x,y,z);
    }
}

public class hw3 {
    public static void main(String[] args) {
        // *** 本題請使用JDK內建的ArrayList
        
        
        // 宣告一個可以儲存Point3D物件的ArrayList容器pList
	ArrayList<Point3D> pList=new ArrayList<>();
        
        // 用亂數產生60座標(x,y,z)，建立60個Point3D物件，依序放入List中
        Random r = new Random(111);
        
//        for(int i=0;i<10;i++){
//            System.out.println(r.nextInt(200)+" "+r.nextInt(200)+" "+r.nextInt(200));
//        }
        
       //int a=r.nextInt(200);
        for(int i=0;i<60;i++){
            pList.add(new Point3D(r.nextInt(200),r.nextInt(200),r.nextInt(200)));
            //pList.add(new Point3D(a,a,a));
        }
        // x,y,z介於[0,200]，亂數種子: 111 
        // 印出所有座標，每6個一列
        
        int times=0;
        for(int i=0;i<60;i++){
            if(i%6==0)
                System.out.println();
            System.out.print(pList.get(i)+" ");
            
        }
        System.out.println();
        int x1,x2,y1,y2,z1,z2,dis;
        double all_distance=0;
        for(int i=1;i<(60);i++){
            x1=pList.get(i-1).x;
            x2=pList.get(i).x;
            y1=pList.get(i-1).y;
            y2=pList.get(i).y;
            z1=pList.get(i-1).z;
            z2=pList.get(i).z;
            
            all_distance+=Math.sqrt(  Math.pow((x2-x1),2)   +  Math.pow((y2-y1),2)    );
            
            
            
        }
        
        System.out.printf("總飛行距離：%.2f\n",all_distance);
        
        x1=pList.get(0).x;
        x2=pList.get(59).x;
        y1=pList.get(0).y;
        y2=pList.get(59).y;
        z1=pList.get(0).z;
        z2=pList.get(59).z;
        
        
        //三點距離 ( x的距離平方 + y的距離平方 + z的距離平方  )   相加後再開根號
        double direct_dis=Math.sqrt(  Math.pow((x2-x1),2)+Math.pow((y2-y1),2)  + Math.pow((z2-z1),2)  );
        
        System.out.printf("直線距離：%.2f\n",direct_dis);
        //System.out.println(pList);
        // 最後計算並印出 (1) 總飛行距離, (2)直線距離
    }
}



