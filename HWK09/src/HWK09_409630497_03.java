
import java.util.Arrays; 
public class HWK09_409630497_03 {
    public static void main(String[] args) {
        String htmlText = "This is my office <img src=\"https://s.yimg.com/zz/nn/lib/metro/g/my/s38417-5.jpg\" width=\"16\" height=\"16\"> contact me. <br>"+
                           " <center><img src=\"https://google.com/imageSearch/result/anti-atom.gif\">this img is not original.</center>";        
        System.out.println(htmlText);                
        String[] imgURLs = getImgURL(htmlText) ; 
        System.out.println(Arrays.toString(imgURLs));
    }
    public static String[] getImgURL(String htmlText) {
        // [功能]: 找出htmlText中所有圖片的url字串，存於imgURL[]中傳回 
        int noOfImg =  (htmlText.split("<img").length -1); // 判別HTML中共有幾張圖片，有點危險
        String[] imgURL = htmlText.split("<img src=\"");  
        for(int i=1; i<imgURL.length;i++){
            String []s = imgURL[i].split("\"");
            imgURL[i-1]=s[0];
        }
        String []imgURLs= new String[noOfImg];
        System.arraycopy(imgURL, 0, imgURLs, 0, noOfImg);
        // DIY here,      
        
        return imgURLs ; 
    }
}
/*
[https://s.yimg.com/zz/nn/lib/metro/g/my/s38417-5.jpg, https://google.com/imageSearch/result/anti-atom.gif]
*/

