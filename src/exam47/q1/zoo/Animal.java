// 2023-07-14 2.week5

package exam47.zoo;

public class Animal {
    public String name;

    // オーバーロード
    public static void greed(){
        System.out.println("スーパークラスのstaticメソッドですか");
    }

    // オーバーライド
    public static void greed(String message){
    System.out.println(message);
    }

}
