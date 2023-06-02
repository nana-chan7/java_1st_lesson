package rpg;

import rpg.item.Item;

public class EquipApp {
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("アリス");
        // ↓ Item.java に Generate Constracters した後
        Item weapon = new Item("ナイフ", 300, 5, 0);
        Item armor = new Item("布の服", 200, 0, 3);
        
        System.out.println(wizard1.name);
        System.out.println("----- before -----");
        System.out.println("攻撃力：" + wizard1.attackPower);
        System.out.println("防御力：" + wizard1.defencePower);
        
        // 武器と防具を装備
        wizard1.equip(weapon);
        wizard1.equip(armor);

        System.out.println("----- after -----");
        System.out.println("攻撃力：" + wizard1.attackPower);
        System.out.println("防御力：" + wizard1.defencePower);
        // ※ 変数名は分かりやすいようにちゃんとつける！(日本語× 英単語)
    }   
}
