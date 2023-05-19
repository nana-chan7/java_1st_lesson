// 2023-05-19 week6
package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCollection {
    
    public static void main(String[] args) {
        List<String> drinks = Arrays.asList("コーヒー", "紅茶", "ほうじ茶");
        System.out.println(drinks);

        ArrayList<String> drinkList = new ArrayList<>();
        // ↑ new ArrayList<String> でも良いが先に <String> を宣言しているので省略できる
        drinkList.add("コーヒー");
        drinkList.add("紅茶");
        drinkList.add("ほうじ茶");
        System.out.println(drinkList);

        // リストの要素番号を指定して取得
        String selectDrink = drinkList.get(1);
        System.out.println(selectDrink);
        // ※ drinkList[1]; ← Java ではこのような記述ができない

        // リストの要素番号を指定して値を変える
        drinkList.set(1, "オレンジジュース");
        System.out.println(drinkList);

        // リストの要素番号を指定して値を削除
        drinkList.remove(2);
        System.out.println(drinkList);

        // リストの要素数を取得
        int iteCount = drinkList.size();
        System.out.println(iteCount);

        // リストを for文で出力
        for (String drinkName : drinkList){
            System.out.println(drinkName);
        }

        // リストの中身を初期化
        drinkList.clear();
        System.out.println(drinkList);
    }
}
