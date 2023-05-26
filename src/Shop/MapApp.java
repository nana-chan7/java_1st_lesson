// 2023-05-26
package shop;

import java.util.HashMap;
import java.util.Map;


public class MapApp {
    public static void main(String[] args) {
        // Ctrl + . : クイックフィックス
        Map<String, String> drinkMap = new HashMap<>();
        drinkMap.put("D0001", "コーヒー");
        drinkMap.put("D0002", "紅茶");
        drinkMap.put("D0003", "ほうじ茶");

        // データ取得
        String drinkName = drinkMap.get("D0003");
        System.out.println(drinkName);

        // データ個数
        int drinkCount = drinkMap.size();
        System.out.println(drinkCount);
    }
}
