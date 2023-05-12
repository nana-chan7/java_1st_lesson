// 2023-05-12 week5
package rpg;

public class App {
    public static void main(String[] args) {
        // ↓ rpgパッケージの Character を選択
        // Character character = new Character();

        Character wizard = new Character();
        System.out.println(wizard);

        wizard.name = "アリス";
        wizard.job = "Wizard";
        wizard.hp = 30;

        Character worrior = new Character();
        worrior.name = "ボブ";
        worrior.job = "Worrior";
        worrior.hp = 50;

        System.out.println(wizard.name);
        System.out.println(wizard.job);
        System.out.println(wizard.hp);

        System.out.println("-----------------");

        System.out.println(worrior.name);
        System.out.println(worrior.job);
        System.out.println(worrior.hp);

        System.out.println("-----------------");

        wizard.walk("left");
        wizard.talk(worrior, "勝負しよう！");

        System.out.println("-----------------");

        wizard.attack(worrior);
        worrior.attack(wizard);

        System.out.println(wizard.hp);
        System.out.println(worrior.hp);
    }
}
