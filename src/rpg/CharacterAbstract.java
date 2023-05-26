// 2023-05-26 week7
package rpg;

// abstract~ を選択
public abstract class CharacterAbstract {
    
    // 実際の中身は分からないけど 設定的
    public abstract void attack(Monster monster);
    public abstract boolean isAlive();
}
