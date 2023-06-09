// 2023-05-19 1.week6
package rpg;

public class App2 {
    public static void main(String[] args) {
        
        Wizard wizard = new Wizard("アリス"); // wizardクラスのインスタンス
        Warrior warrior = new Warrior("ボブ"); // warriorクラスのインスタンス
        
        wizard.talk(warrior, "こんにちは");

        Monster monster1 = new Monster();
        wizard.attack(monster1);
        System.out.println("Monster" + monster1.hp);
        warrior.attack(monster1);
        System.out.println("Monster:" + monster1.hp);
        monster1.attack(wizard);
        System.out.println("Mizard:" + wizard.hp);
    }
}
