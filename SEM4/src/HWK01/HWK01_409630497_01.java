/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWK01;
import java.util.*;
public class HWK01_409630497_01 {
    public static void main (String[] args){
        Scanner cin = new Scanner (System.in);
        ArrayList <Integer> l1= new ArrayList<>();
        for (int i=0; i<=100; i++){
            if (isPrimeNumber(i))l1.add(i);
        }
        System.out.print("List 1:[");
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println("] #no 1:"+l1.size());
        ArrayList <Integer> l2= new ArrayList<>();
        for (int i=1001; i<=1100; i++){
            if (isPrimeNumber(i))l1.add(i);
          
        }
        System.out.print("List 2:[");
        for (int i=0; i<l2.size(); i++){
            System.out.print(l2.get(i)+" ");
        }
        System.out.println("] #no 2:"+l2.size());
    }
    public static boolean isPrimeNumber(int x){
        if(x<2)return false;
        if( x==2)return true;
        
        for (int i=2; i<x; i++){
            if(x%i==0)return false;
        }
        return true;
    }
}
