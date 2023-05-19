// 2023-05-12 week5
package zoo;

public class Animal {

    // constructer : コンストラクタ
    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    // property : プロパティ
    public String type;
    public String name;
    public String crying;

    // method : メソッド
    public void walk() {
        String message = this.name + "が歩いた";
        System.out.println(message);
    }

    public void cry() {
        System.out.println(this.crying);
    }

    public void escape() {
        String message = this.name + "が逃げた";
        System.out.println(message);
    }
}
    

