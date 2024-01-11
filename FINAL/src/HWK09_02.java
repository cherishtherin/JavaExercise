
class URLInfo {

    String protocol, host, directory, filename;

    URLInfo() {
    }

    URLInfo(String urlStr) {
        // DIY, 利用split()字串切割函數，分解urlStr，並將結果填入成員變數
        // 例如，urlStr="http://www.tku.edu.tw/teach/pub/javaex.doc"
        String [] arr= urlStr.split("/");
        String [] arr2= arr[0].split(":");
        protocol=arr2[0];
        host=arr[2];
        directory="/"+arr[3]+"/"+arr[4];
        filename=arr[5];
    }

    public String toString() {
        // DIY, 格式請按照[程式輸出]
        return "protocol: "+protocol+"\nhost: "+host+ "\ndirectory: "+directory+"\nfilname: "+filename;
    }
}

public class HWK09_02 {

    public static void main(String[] args) {
        String urlStr = "http://www.tku.edu.tw/teach/pub/javaex.doc";

        URLInfo urlInfo = new URLInfo(urlStr);
        System.out.println(urlInfo);
    }
}
/* [程式輸出]	
protocol: ftp 
host: im.tku.edu.tw
directory: /teach/pub
filename: java-lib.rar
 */
