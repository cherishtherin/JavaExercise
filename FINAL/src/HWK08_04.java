
class Pattern {

    public static int occurrence(String seq, String pat) {
// 在seq中找出pat出現的次數
        int count = 0, lastIndex = 0;
        while (true) {
            
            lastIndex = seq.indexOf(pat, lastIndex);
            if(lastIndex!=-1){
            count++;
            lastIndex++;
            }
            else break;
        }

        // DIY, 自行修改
        return count;
    }
}

public class HWK08_04 {

    public static void main(String[] args) {
        String sequence = "AABBABABABBBBAB", pattern = "BAB";
        int times = Pattern.occurrence(sequence, pattern);
        System.out.println("#times=" + times); // 印出BAB在sequence出現的次數(4)
    }
}
