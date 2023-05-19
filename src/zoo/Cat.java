// 2023-05-19 week6
package zoo;

public class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
        this.type = "cat";
        this.crying = "にゃー！";
    }

    @Override
    public void walk(){
        String message = this.name + "が警戒して歩いている";
        System.out.println(message);
    }

    public void soloAction() {
        System.out.println("単独行動する");
    }
}