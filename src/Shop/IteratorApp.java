// 2023-05-26 1.week7
package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorApp {
    public static void main(String[] args) {
        
        ArrayList<Drink> drinkList = new ArrayList<>();
        Drink drink1 = new Drink("コーヒー", 350, 100);
        Drink drink2 = new Drink("紅茶", 400, 10);
        Drink drink3 = new Drink("ほうじ茶", 300, 50);

        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);

        System.out.println("-----イテレータ-----");
        // イテレータに変換
        Iterator<Drink> iterator = drinkList.iterator();
        // 次のデータがあれば、ずっと繰り返す
        while (iterator.hasNext()) {
            // 次のデータを取得
            Drink drink = iterator.next();
            System.out.println(drink.name);
        }

        System.out.println("-----リストイテレータ-----");
        // リストイテレータ
        ListIterator<Drink> listIterator = drinkList.listIterator();

        while (listIterator.hasNext()) {
            Drink drink = listIterator.next();
            System.out.println(drink.name);
        }

        System.out.println(">>>>>");

        while (listIterator.hasPrevious()){
            Drink drink = listIterator.previous();
            System.out.println(drink.name);
        }
    }
}
