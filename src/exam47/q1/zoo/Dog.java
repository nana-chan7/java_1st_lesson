// 2023-07-14 2.week5

package exam47.q1.zoo;

import exam47.q1.food.Food;

public class Dog extends Animal {
    public Dog(String name){
        // String name = "タロー";
        this.name = name;
    }

    public void eat(Food food){
        // Food food = new Food();
        String message = this.name + "は" + food.name + "を食べている";
        System.out.println(message);

        // @Override
        // public static void greed(){
        //     System.out.println("スーパークラスのstaticメソッドですか");
        // }
    }

    public static void greed(String message){
        System.out.println(message);
    }

    @Override
    public void walk() {

    }
}
