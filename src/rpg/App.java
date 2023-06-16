// 2023-05-12 1.week5
package rpg;

public class App {
    public static void main(String[] args) {
        // ↓ rpgパッケージの Character を選択
        // Character character = new Character();

        // Character wizard = new Character();
        Character wizard = new Character("アリス", "Wizard");
        Character warrior = new Character("ボブ", "Warrior");

        // wizard.name = "アリス";
        // wizard.job = "Wizard";
        // wizard.hp = 30;

        // Character warrior = new Character();
        // warrior.name = "ボブ";
        // warrior.job = "Warrior";
        // warrior.hp = 50;

        System.out.println(wizard.name);
        System.out.println(wizard.job);
        System.out.println(wizard.hp);

        System.out.println("-----------------");

        System.out.println(warrior.name);
        System.out.println(warrior.job);
        System.out.println(warrior.hp);

        System.out.println("-----------------");

        wizard.walk("left");
        wizard.talk(warrior, "勝負しよう！");

        System.out.println("-----------------");

        wizard.attack(warrior);
        warrior.attack(wizard);

        System.out.println(wizard.hp);
        System.out.println(warrior.hp);
    }
}
