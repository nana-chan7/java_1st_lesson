// 2023-05-26 week7
// 2023-06-02 week8
package rpg;

import rpg.item.Item;

// interface~ を選択
public interface ICharacter {

    // ↓ abstract は省略可
    // public abstract void attack(Monster monster);
    public void attack(Monster monster);
    public boolean isAlive();

    public void magic(Monster monster, String key);
    public void magic(Character character, String key);

    // Item package の item class をインポート
    public void equip(Item item);
    
    

}
