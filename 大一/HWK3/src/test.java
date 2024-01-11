 public static int[] add(int[] x1, int[] x2) {
        int greater = x1.length;
        if (x2.length > x1.length) {
            greater = x2.length;
        }
        int unit = 1, sum = 0;
        for (int i = 0; i < greater; i++) {
            x1[i] *= unit;
            x2[i] *= unit;
            sum = sum + x1[i] + x2[i];
            unit *= 10;
        }

        int[] rlt = new int[x1.length + 1];
        for (int i = rlt.length - 1; i >= 0; i--) {
            rlt[i] = sum % 10;
            sum /= 10;
        }

        return rlt;
    }

    public static int[] mul(int[] x1, int[] x2) {

         int[] rlt = new int[x1.length * 2];
        // DIY here
        int index;
        int next = 0;
        for (int i = 0; i < x1.length; i++) {
            index = i;
            for (int j = 0; j < x2.length; j++) {
                
                    rlt[index] += (next + x1[i] * x2[j]) % 10;
                    next = (next + x1[i] * x2[j]) / 10;
               
                if(rlt[index] >= 10){
                    rlt[index+1] += rlt[index]/10;
                    rlt[index] = rlt[index]%10;
                }
                index++;
            }
            if (next > 0) {
                rlt[index] += next;
                next = 0;
            }
        }
        return rlt;
    }
}