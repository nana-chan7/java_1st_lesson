package sample;

public class Method {
    
    public static void main(String[] args) {
        Float answer;
        answer = calculate(2.f);  // ← float型で指定
        System.out.println(answer);
    }

    // public_static_method
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

}
