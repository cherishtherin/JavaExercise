class Monster {
    String name ;
    int hp ; // 生命點數
    int damage, attack, defense ; // 傷害力，攻擊力，防守力
}


public class HWK4_409630497_02 {
    public static void main(String[] args) {
        Monster m1 = new Monster(), m2 = new Monster() ; 
        set(m1, "Knight", 110, 20, 16, 13) ; 
        set(m2, "Black Dragon", 150, 40, 19, 16) ; 
        print(m1); print(m2) ;
        System.out.println("------ Knight attacks Black Dragon -------");
        attack(m1, m2); // m1 attack m2 
        
        print(m1); print(m2) ;
        System.out.println("------ Black Dragon attacks Knight -------");
        attack(m2, m1); // m2 attack m1
        print(m1); print(m2) ;
    }
    static void set(Monster m, String n, int hp, int dam, int att, int def) {
        m.name=n;
        m.hp=hp;
        m.attack=att;
        m.damage=dam;
        m.defense=def;
        
    }
    static void print(Monster m) {
       System.out.println(m.name+ " hp ="+m.hp);
    }
    static void attack(Monster a, Monster b) {
        System.out.println("att "+a.attack +"def "+b.defense);
         if(a.attack>b.defense){
             double x=(a.attack-b.defense)*5;
             a.damage+=a.damage*x/100;
         }
         else if(a.attack<b.defense){
             double y=(b.defense-a.attack)*2.5;
             a.damage-=a.damage*y/100;
         }
         
         System.out.println("final damage is "+a.damage);
         b.hp-=a.damage;
    }
    // 互相攻擊時，攻方造成防方生命點數損失的計算方式
    // (1) 攻擊者造成之傷害點數計算: 
    //     除攻方原始傷害點數(damage)外，若攻方的attack大於防方的defense，每大一點，攻擊傷害增加5%
    // (2) 防守者實際受到之傷害點數計算: 
    //     若防守者(m2)的defense大於m1的attack，每大一點，對方造成傷害減少2.5%    
}
/*
<Knight hp=110>
<Black Dragon hp=150>
------ Knight attacks Black Dragon -------
final damage is 20
<Knight hp=110>
<Black Dragon h=130>
------ Black Dragon attacks Knight -------
final damage is 52
<Knight hp=58>
<Black Dragon hp=130>
*/