/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class dennis {
    public static void main (String args[]){
        
        char[] tt={'7','5','4'};
        int sum=0;
        for (int i=0; i<tt.length; i++){
            sum+=Integer.valueOf(tt[i]);
        }
        System.out.println(Integer.valueOf(sum));
    }
}
