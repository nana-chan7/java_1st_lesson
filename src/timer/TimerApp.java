// 2023-07-07 2.week4
package timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {
    public static int seconds = 3;
    public static void main(String[] args) {
        String messeage = seconds + "秒後に実行します";
        System.out.println(messeage);

        Timer timer = new Timer(); // Timer: java.util
        TimerTask task = new TimerTask() { // Anonymous Inner Type
        
        };
    }
}
