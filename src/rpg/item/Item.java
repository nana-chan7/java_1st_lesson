// 2023-06-02 1.week8
// 2023-06-15 2.week1
package rpg.item;

public class Item {
    
    // ソースアクション → Generate Constracters
    public Item(String name, int price, int attackPower, int defencePower) {
        this.name = name;
        this.price = price;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }


    public Item(long id, String name, ItemType type, int price, int attackPower, int defencePower) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }


    private long id;
    private String name;
    private ItemType type;

    private int price;
    private int attackPower;
    private int defencePower;

    // 変数下の空白行を右クリック → ソースアクション → Generate:Getter Setter
    // private なので外部にアクセスするために accessor method を使う
    // accessor method
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getName() { // getter
        return name;
    }
    public void setName(String name) { //setter
        this.name = name;
    }
    public ItemType getType() {
         return type;
    }
    public void setType(ItemType type){
        this.type = type;
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
