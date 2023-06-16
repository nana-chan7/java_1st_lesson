// 2023-05-26 1.week7
package rpg;

// abstract~ を選択
public abstract class CharacterAbstract {
    
    // 実際の中身は分からないけど 設定的
    public abstract void attack(Monster monster); //モンスターを攻撃する
    public abstract boolean isAlive(); //キャラクターが生きているかどうか
    public void magic(Monster monster, String key);
    public void magic(Character character, String key);
}   
