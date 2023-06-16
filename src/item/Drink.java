// 2023-04-14 1.week1

// パッケージ名は小文字がいいかも？

// クラスファイル名は最初が大文字
// ファイルから作成する場合は .java が必要 / JAVA PROJECT で作成する場合は名前のみ
package item;
// ↑ 消去するとエラー
// Ctrl + . (クイックフィックス)でヒントをくれる → タイピングしなくてもある程度修正できる
public class Drink {
    // Java は静的型付け (python は動的型付け) 静的のほうがバグが少ないかも？
    public static void main(String[] args) {
        // データ型 変数名;
        // 名称 (文字列型)
        String name;
        // 価格 (整数型)
        int price;
        // 個数 (整数型)
        int amount;
        // セール品か？ (boolean型)
        boolean isSale;

        name = "コーヒー";
        price = 150;
        amount = 3;
        isSale = true;  // ← すべて小文字(python と違う)

        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
        System.out.println(isSale);

        amount = 2;

        // ↓ 宣言した型と違うのでエラーになる
        // amount = "2";
        // isSale = 1;
        // name = 1111;
    }
}

