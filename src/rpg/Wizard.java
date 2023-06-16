// 2023-05-19 1.week6
package rpg;

// public class サブクラス extends スーパークラス｛
public class Wizard extends Character{

    public Wizard(String name) {
        super(name); // Characterクラス(スーパークラス)のコンストラクタ
        this.job = "wizard";
        this.hp = 30;
        this.mp = 20;
        this.attackPower = 3;
        this.defencePower = 2;
    }
}