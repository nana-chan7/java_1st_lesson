// 2023-04-28 week3
package sample;
// 繰り返し処理
public class ItemRepeat {
    
    public static void main(String[] arg) {
        System.out.println("-------for文--------");
        // for文 (fori を選択)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("-------forのネスト--------");
        // forのネスト
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                String plot = "(" + i + "," + j + ")";
                System.out.print(plot);  
                // println : ln ← 改行コード
                // print だと改行なしで出力
                // CR, LF, CRLF : 改行コードの種類
            }
            System.out.println("");
        }

        System.out.println("-------配列の繰り返し--------");
        // 配列の繰り返し
        String[] drinks = {"コーヒー", "紅茶", "ほうじ茶"};
        // fori : 直前に配列があると自動で入力してくれる
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }

        System.out.println("-------foreach文--------");
        // foreach文
        for (String drink : drinks) {
            System.out.println(drink);
        }

    }
}
