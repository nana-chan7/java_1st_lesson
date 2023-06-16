// 2023-06-02 1.week8
package rpg.item;

public class Item {
    
    // ソースアクション → Generate Constracters
    public Item(String name, int price, int attackPower, int defencePower) {
        this.name = name;
        this.price = price;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    private String name;
    private int price;
    private int attackPower;
    private int defencePower;

    // 変数下の空白行を右クリック → ソースアクション → Generate:Getter Setter
    // private なので外部にアクセスするために accessor method を使う
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
