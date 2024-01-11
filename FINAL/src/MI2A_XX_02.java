//package MI2A_0104_Practice.EX2;

import javax.swing.* ;
import java.awt.* ;  // for class Graphics
class MyFrame extends JFrame {
	public MyFrame(int w, int h){ 
            super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            super.setSize(w,h); 
            super.setVisible(true); 
        }
        public void paint(Graphics g) {
            super.paint(g) ;
            g.drawOval(50,50,80,100) ; // (x,y):左上角座標, w=80, h=100
            g.setFont(new Font("Times NewRome", (Font.ITALIC|Font.BOLD), 40));
            g.drawString("Hello MI3A!", 40,120) ;
            
            // 取得畫面大小: 300, 200            
            int w = this.getWidth(), h = this.getHeight() ; // 300, 200
            // System.out.println(w+","+h);
            // DIY: 在x,y座標軸上，每10點畫上格線(垂直+水平)
            for (int i=0; i<h; i+=10){
             g.drawLine(0,i,w,i); // 示範畫線: (x1,y1)-(x2,y2)
            }
            for (int i=0; i<w; i+=10){
             g.drawLine(i,0,i,h); // 示範畫線: (x1,y1)-(x2,y2)
            }
                  
        }
} 
public class MI2A_XX_02 {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame(300,200) ;
    }
}

