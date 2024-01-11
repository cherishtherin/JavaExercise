
import java.util.*;

class Item {

    int itemID;
    String name;
    int uPrice;

    public Item() {
    }

    public Item(int id, String name, int uPrice) {
        this.itemID = id;
        this.name = name;
        this.uPrice = uPrice;
    }

    public int get_Uprice() {
        return this.uPrice;
    }

    public String toString() {
        if (this.name.length() <= 4) {
            return this.itemID + "\t" + this.name + "\t\t" + this.uPrice;
        }
        return this.itemID + "\t" + this.name + "\t" + this.uPrice;
    }

}

class Order extends Item {

    Item item;
    int amount;
    int total;
    Order[] order_list;

    public Order() {
    }

    public Order(Item id, int q) {
        this.item = id;
        this.amount = q;
        this.total = item.get_Uprice() * q;
    }
    
    @Override
    public String toString() {
        return this.item.toString() + "x" + this.amount + "\t" + this.total;
    }
}
//class Customer_order extends Order{
//    int customer;
//    Order [] order_list;
//    int order_total;
//    
//    
//}

public class HWK_409630497_飲料店 {

    public static Scanner cin = new Scanner(System.in);
    public static Item[] drinks = new Item[6];
    public static int[] drinks_id = {1001, 1002, 1005, 1007, 1008, 1009};
    public static String[] drinks_name = {"阿薩姆奶茶", "珍珠奶茶", "茉香綠茶", "烏梅汁", "黑咖啡(美式)", "拿鐵"};
    public static int[] drinks_uPrice = {55, 65, 35, 45, 40, 55};
    public static ArrayList<Order> orderList = new ArrayList<>();
    public static ArrayList<Object> orderlistpool = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < drinks.length; i++) {

            drinks[i] = new Item(drinks_id[i], drinks_name[i], drinks_uPrice[i]);
        }

        int action = action();
        while (action == 1) {

            
            System.out.println("-------------------------------------------------------------------");

            System.out.println("ItemsID\tItems Name\tPrice");
            for (Item x : drinks) {
                System.out.println(x);}

                int selection;
                while (true) {

                    options();
                    selection = cin.nextInt();
                    if (selection == 2 || selection == 4) {
                        break;
                    }
                    if (selection == 1) {
                        order();
                    } else if (selection == 3) {
                        erase_order();
                    }

                }
                if (selection == 2) {
                    System.out.println("");
                    orderlistpool.add(orderList);
                    print_receipt();
                   
                } else if (selection == 4) {
                    cancel_order();
                }
                action=action();
        }
        if (action == 2) {
                System.out.println("----orders are done----");
                
            }
    }

    public static int action() {
        System.out.println("<<<<<<<< QQ 飲料店 點餐系統 >>>>>>>>>");
        System.out.print("(1) 建立訂單 (2) 離開:");
        int input_1 = cin.nextInt();

        return input_1;
    }

    public static void options() {
        System.out.print(">(1) 點餐 (2) 完成 (3) 取消單項 (4) 取消訂單:");
    }

    public static void order() {

        System.out.println(">> 輸入代號與數量:");
        int input_id = cin.nextInt();
        int amount = cin.nextInt();
        int list_id = get_list_num(drinks, input_id);
        Order item = new Order(drinks[list_id], amount);
        orderList.add(item);
        int cnt = 1;
        for (Order x : orderList) {
            System.out.println("[" + (cnt++) + "]" + x);
        }
    }

    public static int get_list_num(Item[] a, int id) {
        int no = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].itemID == id) {
                no = i;
            }
        }
        return no;
    }

    public static void erase_order() {
        System.out.println(">> 輸入編號:");
        int index = cin.nextInt();
        orderList.remove(index - 1);
        int cnt = 1;
        for (Order x : orderList) {
            System.out.println("[" + (cnt++) + "]" + x);
        }
    }

    public static void print_receipt() {
        System.out.println("**** 列印明細 ****");
        System.out.println("");
        int cnt = 1;
        for (Order x : orderList) {
            System.out.println("[" + (cnt++) + "]" + x);
        }
        System.out.print("總價");
        int total = 0;
        for (Order x : orderList) {
            total += x.total;
        }
        System.out.println("");
        System.out.println("\t\t\t\t" + total);
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
    }

    public static void cancel_order() {
        for (int i=0 ;i<orderList.size(); i++){
            orderList.remove(orderList.get(i));
        }
        System.out.println("--------------order has been canceled-----------------");
    }
}
