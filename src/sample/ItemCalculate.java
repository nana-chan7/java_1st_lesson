package sample;

public class ItemCalculate {
    public static void main(String[] args){
        int answer;

        // 2項演算
        // answer = 1 + 2;
        // answer = answer + 3;
        // answer = answer - 2;
        // answer = answer * 5;
        // answer = answer / 2;

        // 複合演算
        answer = 1 + 2;
        answer += 3;
        answer -= 2;
        answer *= 5;
        answer /= 2;
        System.out.println(answer);

        // cast
        int price = 200;
        float pointRate = 0.1f;
        int point;

        point = (int) (price * pointRate);  // 小数点で切り捨てられている？
        System.out.println(point + "pt");

        int amount = 5;
        // インクリメント(increment)
        // 1 ずつ加算
        amount++;   // → 結果 : 6
        amount++;   // → 結果 : 7
        System.out.println(amount);

        // デクリメント(decrement)
        // 1 ずつ減算 
        amount--;   // → 結果 : 6
        amount--;   // → 結果 : 5
        System.out.println(amount);

        // over flow
        // int price = 10000;
        price = 100000;
        amount = 100000;
        // long型にキャスト
        long totalPrice = (long) price * (long) amount;
 
        // int totalPrice = price * amount;
        System.out.println(totalPrice);


        // 論理演算
        System.out.println("----- 論理演算 -----");

        boolean is_match = false;
        price = 100;

        // price は 100 と等しいですか？
        is_match = (price == 100);
        System.out.println(is_match); 

        // price は 100 より小さいですか？
        is_match = (price < 100);
        System.out.println(is_match); 

        // price は 100 より大きいですか？
        is_match = (price > 100);
        System.out.println(is_match); 

        // price は 100 と等しくないですか？ -いいえ、100です
        is_match = (price != 100);
        System.out.println(is_match); 
        
        // price は 100 以下ですか？
        is_match = (price <= 100);
        System.out.println(is_match); 

        // price は 100 以上ですか？
        is_match = (price >= 100);
        System.out.println(is_match); 

        // 同値
        System.out.println("----- 同値 -----");
        String str1 = "20";
        String str2 = "20";
        int number1 = 20;
        int number2 = 30;

        is_match = (str1 == str2);
        System.out.println(is_match);

        is_match = (number1 == number2);
        System.out.println(is_match);

        // コンパイルエラー
        // is_match = (str1 == number1);
        is_match = (Integer.parseInt(str1) == number1);
        System.out.println(is_match);

        // ※ Python, PHP, JavaScript 
        // is_match = (str1 === number1);

        // 三項演算
        System.out.println("----- 三項演算 ---");
        // 商品価格
        price = 150;
        // 所持金
        int money = 200;

        String message = (price <= money) ? "購入できます。" : "所持金が足りません。";
        System.out.println(message);

    }
}

