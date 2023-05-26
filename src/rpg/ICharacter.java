// 2023-05-26 week7
package rpg;

// interface~ を選択
public interface ICharacter {

    // ↓ abstract は省略可
    // public abstract void attack(Monster monster);
    public void attack(Monster monster);
    public boolean isAlive();

    public void magic(Monster monster, String key);

}
