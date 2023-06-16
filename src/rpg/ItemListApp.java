// 2023-06-09 1.week9
// 2023-06-15 2.week1
package rpg;

import rpg.item.Item;
import rpg.item.ItemList;

public class ItemListApp {
    public static void main(String[] args) {
        ItemList itemList = new ItemList();
        
        for (Item item : itemList.list) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }

        System.out.println(itemList.list.get(0).getName());
    }
}
