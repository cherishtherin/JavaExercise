class Rect {
	double w, h ;
	void set(double a, double b) {
		w=a;  h=b ;	} 
	// 依照main()中的需求，完成calArea(), draw(), larger()等函數
        // calArea():3%
        double calArea(){
            return w*h;
        }
        // draw(): 5%
        void draw(String sym){
            for( int i=0; i<h; i++){
                for (int j=0; j<w; j++){
                    System.out.print(sym);
                }
                System.out.println("");
            }
        }
        // larger(): 4%
        boolean larger(Rect r){
            return calArea()>=r.calArea();
        }
       
}
public class MI2A_409630497_01{
	public static void main(String[] args) {
		Rect r1 = new Rect() ;
		r1.set(5, 3) ; // w=5, h=3 
		double a = r1.calArea() ;
		System.out.println("area="+(int)a) ; 
		r1.draw("*") ; // 用星號畫出r1, 若有小數點四捨五入
		Rect r2 = new Rect() ; 	r2.set(4.5, 3.5) ;
		boolean b = r1.larger(r2); // 比較r1的面積是否筆r2大
		if (b) System.out.println("r1 is larger than r2") ;
		else System.out.println("r1 is not larger than r2") ;
	}
}
/* [程式輸出]
area=15
r1 is not larger than r2
*/
