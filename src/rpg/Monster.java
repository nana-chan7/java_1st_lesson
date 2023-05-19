package rpg;

public class Monster {
    // field (property)
    public String name;
    public String job;
    public int hp;
    public int mp;
    public int lrevel;
    public int exp;
    public int attackPower;
    public int defencePower;

    public void attack(Character character) {
        int damage = this.attackPower - character.defencePower;
        // ダメージが 0より大きい場合は、相手のHPを減らす
        if(damage > 0) character.hp -= damage;
    }

}