// 2023-05-19 week6
package rpg;

import java.util.Random;

public class Warrior extends Character{

    public Warrior(String name) {
        super(name);
        this.job = "warrior";
        this.hp = 50;
        this.mp = 0;
        this.attackPower = 7;
        this.defencePower = 3;
    }

    // オーバーライド
    @Override
    public void attack(Monster monster) {
        System.out.println("オーバーライド");
        // 初期の攻撃力を tmp(一時保存)する
        int attackPower = this.attackPower;
        // 1/5 の確率でクリティカルヒットする
        Random rand = new Random();
        int index = rand.nextInt(5);
        if(index == 0){
            // 攻撃力を 2倍する
            System.out.println("Critical Hit!!");
            this.attackPower *=2;
        }
        // 攻撃
        super.attack(monster);
        // 攻撃力を元に戻す
        this.attackPower = attackPower;
    }
}
