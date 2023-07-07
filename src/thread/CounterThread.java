// 2023-07-07 2.week4
package thread;

public class CounterThread implements Runnable{ // Add unimplemented methods
    public static Integer count = 5;
    public static Integer interval = 1000;

    @Override
    synchronized public void run() {
        // synchronized(count){
            while (count > 0){
                try {
                    Thread.sleep(interval); // Surround try&catch
                    String message = Thread.currentThread().getName() + ":" + count;
                    System.out.println(message);
                    count --;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count = 5; // thread2を実行するために countを戻す
            System.out.println("---End thread---");
        }
    // }
}
