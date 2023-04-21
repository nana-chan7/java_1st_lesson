package sample;

public class Drink {
    
    public static void main(String[] args) {
        // スニペット: syso
        System.out.println("Drink class");

        String name;
        int price;
        int amount;
        boolean isSale;  

        name = "コーヒー";
        price = 350;
        amount = 3;
        isSale = true;

        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
        System.out.println(isSale);

        // int には少数が代入できない
        //amount = 0.1f;

        // String に数値は代入できない
        // name = 100;
        // ※ 文字リテラルは代入できる
        // name = "100"

        // 定数 (constant)
        final Float TAX_RATE = 0.1f;
        System.out.println(TAX_RATE);

        // 定数は値を再代入できない
        // TAX_RATE = 0.08f;

    }
}