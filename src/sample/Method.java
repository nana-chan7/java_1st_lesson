package sample;
// 2023-05-12 week4
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
        int totalPrice = calculateTotalPlise(200, 5);
        System.out.println(totalPrice);
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

    public static int calculateTotalPlise(int price, int amount){
        int totalPrice = price * amount;
        return totalPrice;
    }
}
