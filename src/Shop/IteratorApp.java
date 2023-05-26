package shop;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        
        ArrayList<Drink> drinkList = new ArrayList<>();
        Drink drink1 = new Drink("コーヒー", 350, 100);
        Drink drink2 = new Drink("紅茶", 400, 10);
        Drink drink3 = new Drink("ほうじ茶", 300, 50);

        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);

        // イテレータに変換
        Iterator<Drink> iterator = drinkList.iterator();
        // 次のデータがあれば、ずっと繰り返す
        while (iterator.hasNext()) {
            // 次のデータを取得
            Drink drink = iterator.next();
            System.out.println(drink.name);
        }
    }
}
