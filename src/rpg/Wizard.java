// 2023-05-19 week6
package rpg;

public class Wizard extends Character{

    public Wizard(String name) {
        super(name);
        this.job = "wizard";
        this.hp = 30;
        this.mp = 20;
        this.attackPower = 3;
        this.defencePower = 2;
    }
}
