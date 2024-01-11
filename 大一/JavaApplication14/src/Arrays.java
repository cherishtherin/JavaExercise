
class Arrays {
    public static void main (String[]args){
        int [][] a = new int[3][5];
        System.out.print(" \t");
        for(int i=0; i<a[0].length; i++){
            System.out.print(i+"\t");
        }
        System.out.println("");
        for(int i=0; i<a.length; i++){
            System.out.print(i+"\t");
            for (int j=0; j<a[i].length; j++){
                if(j%2==0){
                    System.out.print("1\t");
                }
                else{
                    System.out.print("-1\t");
                }
            }System.out.println("");
        }
    }
}
