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

        System.out.println("-----データ取得-----");
        // データ取得
        String drinkName = drinkMap.get("D0003");
        System.out.println(drinkName);

        System.out.println("-----データ個数-----");
        // データ個数
        int drinkCount = drinkMap.size();
        System.out.println(drinkCount);

        System.out.println("-----キーの繰り返し-----");
        // キーの繰り返し
        for (String key : drinkMap.keySet()){
            System.out.println(key);
        }

        System.out.println("-----値の繰り返し-----");
        // 値の繰り返し
        for (String value : drinkMap.values()) {
            System.out.println(value);            
        }

        System.out.println("-----繰り返し-----");
        // 繰り返し
        for (String key : drinkMap.keySet()) {
            String name = drinkMap.get(key);
            System.out.println(key + ":" + name);            
        }
        
    }
}
