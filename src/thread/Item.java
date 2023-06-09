// 2023-07-07 2.week4
package thread;

public class Item {
    public String name;

    // Generate Constructors
    public Item(String name) {
        this.name = name;
    }

    public void order(){
        try {
            System.out.println(name);
            CounterThread.sleep(1000); // Thurround try&catch
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--- 注文完了 ---");
    }
}
