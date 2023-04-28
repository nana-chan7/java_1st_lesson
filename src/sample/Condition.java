package sample;

// 条件分岐
public class Condition {
    public static void main(String[] args) {
        // 価格
        int price = 100;
        // 最大価格
        int maxPrice = 100000000;
        // 所持金
        int money = 100;
        // メッセージ
        String message = "";

 
        // if (money >= price) {
        //     message = "お買い上げありがとうございます。";
        // } else { 
        //     message = "所持金が足りません。";
        // }

        // if (money >= price) {
        //     message = "お買い上げありがとうございます。";
        // } else { 
        //     message = "所持金が足りません。";
        // }

        // if (price <= 0){
        //     message = "価格が正しくありません。";
        // }
        // 論理演算子追加
        // OR : || (どちらかが true だったら)
        if (price <= 0 || price >= maxPrice){
            message = "価格が正しくありません。";
        }
        else if (money >= price){
            message = "お買い上げありがとうございます。";
        }
        else {
            message = "所持金が足りません。";
        }



        System.out.println(message);
    }
}
