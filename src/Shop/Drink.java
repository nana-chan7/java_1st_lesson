// 2023-05-19 1.week6
// 2023-05-26 1.week7
// 2023-06-09 1.week9 :enum

package shop;
public class Drink {
    
    public String name;
    public int price;
    public int stock;

    // enum型
    public Size size;

    public Drink(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Constructors: name, price, size
    public Drink(String name, int price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    
}