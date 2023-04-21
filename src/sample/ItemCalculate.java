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
        long totalPrice = (long)price * (longd)amount;
 
        // int totalPrice = price * amount;
        System.out.println(totalPrice);

        
    }
}
