package exam47.Q3;

public class Q15 {
    enum Attendance {
        ATTEND, ABSENCE, LEAVE
    }
    
    public static void main(String[] args) {
        Attendance today;
        //コンパイルエラー
        // today = Attendance.LATE;
    }
}