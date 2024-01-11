import java.util.*;
public class HWK3_409630497_01 {
    public static void main (String[]args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Input score(0-100): ");
        int score= cin.nextInt();
        char gc= getGrade(score);
        System.out.println("Grade : "+gc);
    }
    public static char getGrade(int score){
        char level;
        if(score>=90){
            level='A';
        }else if(score>=80){
            level='B';
        }
        else if(score>=70){
            level='C';
        }
        else if(score>=60){
            level='D';
        }
        else {
            level='F';
        }
        return level;
    }
    
}
