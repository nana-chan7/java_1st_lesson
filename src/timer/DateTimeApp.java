// 2023-07-07 2.week4
package timer;

// import java.sql.Date;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class DateTimeApp {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 6); // ※ Calendarクラスや Dateクラスは月を0から始める
        calendar.set(Calendar.DATE, 7);
        calendar.set(Calendar.HOUR_OF_DAY, 13);
        calendar.set(Calendar.MINUTE, 17);
        calendar.set(Calendar.SECOND, 0);

        Date scheculeTime = calendar.getTime();
        // GMT
        System.out.println("GMT: " + scheculeTime);
        // UTC
        System.out.println("UTC: " + scheculeTime.toInstant());

        Timer timer = new Timer(); 
        TimerTask task = new TimerTask() { 

            @Override 
            public void run() {
                System.out.println("実行しました！");
                timer.cancel();
            } 
        };
        timer. schedule(task, scheculeTime);
    }
}

// GMT（Greenwich Mean Time）: グリニッジ・ミーン・タイム
// 昔、標準時として使っていた時間で、1884年の国際子午線会議が始まりで、国際的な基準時刻のひとつである世界標準時
// 基本的な発想としては、経度が15度ずれるごとに時刻が1時間ずれるとしている

// UTC（Coordinated Universal Time）: 協定世界時の略称 
// 原子時計の時刻(国際原子時)と、地球の自転に基づく時刻(世界時)のずれを補正するために、うるう秒で調整されている