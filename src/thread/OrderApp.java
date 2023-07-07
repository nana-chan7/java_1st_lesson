// 2023-07-07 2.week4
package thread;

import java.util.ArrayList;

public class OrderApp {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add( new Item("コーヒー"));
        items.add( new Item("紅茶"));
        items.add( new Item("ほうじ茶"));

        for (Item item : items) {
            ShopThread thread = new ShopThread(item);
            thread.start();
        }
    }
}
