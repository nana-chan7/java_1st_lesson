// 2023-06-02 week8
package rpg.item;

public class Item {
    
    private String name;
    private int price;
    private int attackPower;
    private int defencePower;

    // 変数下の空白行を右クリック → ソースアクション → Generate:Getter Setter
    // accessor method
    public String getName() { // getter
        return name;
    }
    public void setName(String name) { //setter
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public int getDefencePower() {
        return defencePower;
    }
    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

    
}
