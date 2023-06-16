// 2023-05-26 1.week7
package shop;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        
        // Ctrl + . : Quick Fix (クイックフィックス)
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

        // データ削除
        drinkMap.remove("D0002");

        System.out.println("-----繰り返し-----");
        // 繰り返し
        for (String key : drinkMap.keySet()) {
            String name = drinkMap.get(key);
            System.out.println(key + ":" + name);            
        }
        
        System.out.println("=============================");
        Map<String, Drink> drinkMap2 = new HashMap<>();
        drinkMap2.put("D0001", new Drink("コーヒー", 350, 100));
        drinkMap2.put("D0002", new Drink("紅茶", 400, 10));
        drinkMap2.put("D0003", new Drink("ほうじ茶", 30, 50));

        Drink seleDrink = drinkMap2.get("D0001");
        System.out.println(seleDrink.name);

        System.out.println("-----合計金額-----");
        // 合計金額
        int totalPrice = 0;
        for (Drink drink : drinkMap2.values()) {
            totalPrice = drink.price * drink.stock;
        }
        System.out.println(totalPrice);
    }
}
