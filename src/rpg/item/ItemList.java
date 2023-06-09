// 2023-06-09 week9
package rpg.item;

import java.util.ArrayList;

public class ItemList {
    
    ArrayList<Item> list = new ArrayList<>();

    public ItemList() {  // 空のコンストラクタを作成
        this.loadCSV();
    }

    public void loadCSV(){
        System.out.println("CSV 読み込み");
    }
}
