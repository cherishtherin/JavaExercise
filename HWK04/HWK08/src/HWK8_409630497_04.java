
class Pattern {

    public static int occurrence(String seq, String pat) {
// 在seq中找出pat出現的次數
        int n=0;
        int counter=0;
        while (true){
              n=seq.indexOf(pat,n);
              if(n==-1)break;
              else counter ++;
        }
        return counter; // DIY, 自行修改
    }
}

public class HWK8_409630497_04 {

    public static void main(String[] args) {
        String sequence = "AABBABABABBBBAB", pattern = "BAB";
                System.out.println(sequence);

        int times = Pattern.occurrence(sequence, pattern);
        System.out.println("#times=" + times);
        // 印出BAB在sequence出現的次數(4)
    }
}
