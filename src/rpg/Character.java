// 2023-05-12 week4
package rpg;

public class Character {

    // field (property)
    String name;
    String job;
    int hp;
    
    // class-method
    // ※ pub → public_method を選択
    public void walk(String direction) {
        // ↓ この場合、name だけでも良いが、明示的にするために this. を付ける
        String message = this.name + " move to " + direction;
        System.out.println(message);
    }

    public void talk(Character character, String message) {
        message = character.name + "!" + message;
        System.out.println(message);
    }
    
    public void attack(Character character) {
        int damage = 5;
        character.hp -= damage;
    }
}