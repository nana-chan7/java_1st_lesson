// 2023-07-14 2.week5

package exam47.zoo;

import exam47.food.Food;

public class AnimalApp {
    public static void main(String[] args) {
        // サブクラスのオブジェクト
        Food food= new Food();
        food.name = "リンゴ";

        Dog dog = new Dog("タロー");
        dog.eat(food);

        // スーパークラスのオブジェクト
        Animal animal = new Animal();

        // スーパークラスにサブクラスのオブジェクトは代入できる
        // キャスト無し
        animal = dog;
        // キャスト
        animal = (Animal)dog;

        System.out.println(animal.name);

        // サブクラスにスーパークラスのオブジェクトは代入できない
        // dog = animal;

        // staticメソッドの実行
        Dog.greed();
    }
}
