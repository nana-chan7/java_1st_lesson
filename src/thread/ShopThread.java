// 2023-07-07 2.week4
package thread;

public class ShopThread extends CounterThread{

    private Item item;

    // Constructor
    ShopThread(Item item){
        this.item = item;
    }

    @Override
    public void run(){
        item.order();
    }
}
