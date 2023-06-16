// 2023-06-09 week9
// 2023-06-15 2.week1

package rpg.item;

import java.util.ArrayList;

public class ItemList {

    private final String CSV_PATH = "data/item.csv";  // csvファイルを読み込む
    ArrayList<Item> list = new ArrayList<>();

    public ItemList() {  // 空のコンストラクタを作成
        this.loadCSV();
    }

    public void loadCSV(){
        System.out.println("CSV 読み込み");
    }
}
