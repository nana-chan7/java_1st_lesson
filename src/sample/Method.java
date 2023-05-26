// 2023-05-12 week5
package sample;

public class Method {
    
    public static void main(String[] args) {
        System.out.println("-------static method--------");

        Float answer;
        answer = calculate(2.f);  // ← float型で指定
        System.out.println(answer);

        // method をつくることで、ひとつの処理で引数を変えても実行できる
        answer = calculate(6.f);
        answer = calculate(8.f);
        // ↓ non-static method は直接呼び出せない
        // answer = calculate2(10.f);

        System.out.println(">>> 合計額を求める");
        int totalPrice = calculateTotalPrise(200, 5);
        System.out.println(totalPrice);

        // System.out.println(">>> 購入額を求める");
        // int totalPrice = calculateTotalPrise(200, 5, 0.1f);
        // System.out.println(totalPrice);
        // int purchasePrice = calculateTotalPrise(200, 5, 0.1f);
        // System.out.println(purchasePrice);


        System.out.println("--------オーバーロード--------");
        // 引数の数で自動的にメソッドを判別する
        // ※ メソッド名が同じで混乱することもあるのでケースバイケース
        greet("YSE");
        greet("YSE", "晴れ");
    }

    // public static method  
    // pub と入力 → public_static_method を選択
    public static Float calculate(Float x) {
        Float y = x + 5;
        return y;
    }

    // ※ ↓ だと return y がエラーになる → void を Float に
    // public static void calculate(Float x) {
    //     Float y = x + 5;
    //     return y;
    // }

    // ※ non-static method
    // public Float calculate2(Float x){
    //     Float y = x + 5;
    //     return y;
    // }

    // 商品の合計額
    public static int calculateTotalPrise(int price, int amount){
        int totalPrice = price * amount;
        return totalPrice;
    }
    // 商品の購入額
    public static int calculateTotalPrise(int price, int amount, float taxRate){
        float totalPrice = price * amount * (1 + taxRate);
        return (int) totalPrice;
    }
    // ※Float などの頭が大文字(参照型)の場合は .intValue() を付けて参照型に統一するとできる
    // 頭が小文字(floatなど) はプリミティブ型
    // public static int calculateTotalPrise(int price, int amount, Float taxRate){
    //     Float totalPrice = price * amount * (1 + taxRate);
    //     return totalPrice.intValue();
    //}


    // ------- オーバーロード -------
    public static void greet(String name) {
        String message = name + "さん、こんにちは";
        System.out.println(message);        
    }
    // ↓ 上の処理をコピーしたままだとエラーになるが、
    // 数の数が異なっているか、引数のデータ型が異なっていると実行できるようしなる
    // ※ 引数の変数名だけが異なる場合・戻り値だけが異なる場合 はオーバーロードできない
    public static void greet(String name, String weather) {
        String message = name + "さん、こんにちは" + "今日は" + weather + "ですね";
        System.out.println(message);        
    }
}

