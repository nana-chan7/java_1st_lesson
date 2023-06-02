// 2023-05-12 week5
// 2023-05-19 week6
// 2023-05-26 week7
package rpg;
// public class Character {

// public class Character extends CharacterAbstract {
public class Character implements ICharacter {
    // 初期化ブロック
    {
        System.out.println("初期化ブロック");
    }
    
    // constructer
    public Character(String name, String job) {
        this.name = name;
        this.job = job;
        this.hp = 50;
    }

    // マウス右クリック → ソースアクション → enerateConstruct
    public Character(String name) {
        this.name = name;
        this.lrevel = 1;
        this.exp = 0;
    }

    // field (property)
    public String name;
    public String job;
    public int hp;
    public int mp;
    public int lrevel;
    public int exp;
    public int attackPower;
    public int defencePower;
    
    // instance-method
    // class-method
    // ※ pub → public_method を選択
    public void walk(String direction) {
        // ↓ この場合、name だけでも良いが、明示的にするために this. を付ける
        String message = this.name + " move to " + direction;
        System.out.println(message);
    }

    public void talk(Character character, String message) {
        message = character.name + "! " + message;
        System.out.println(message);
    }

    public void attack(Character character) {
        int damage = this.attackPower - character.attackPower;
        if(damage > 0) character.hp -= damage;
    }

    // public void attack(Monster monster) {
    //     int damage = this.attackPower - monster.defencePower;
    //     if(damage > 0) monster.hp -= damage;
    // }
    @Override
    public void attack(Monster monster) {
        int damage = this.attackPower - monster.defencePower;
        if(damage > 0) monster.hp -= damage;
    }

    // interface
    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'isAlive'");
        return (this.hp > 0);
    }

    @Override
    public void magic(Monster monster, String key) {

    }
    @Override
    public void magic(Character character, String key) {

    }

    // abstract
    // @Override
    // public boolean isAlive() {
    //     // TODO Auto-generated method stub
    //     //throw new UnsupportedOperationException("Unimplemented method 'isAlive'");
    //     return (this.hp > 0);
    // }
}