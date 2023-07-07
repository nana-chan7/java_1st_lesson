// 2023-07-07 2.week4
package thread;

public class CounterThread implements Runnable{ // Add unimplemented methods
    public static Integer count = 5;
    public static Integer interval = 1000;

    @Override
    public void run() {
        System.out.println("---End thread---");
    }

}
