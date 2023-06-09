// 2023-06-09 week9
package sample;

public class ExceptionApp {
    public static void main(String[] args) {
        float average;

        average = calculateAverage(300, 110);
        System.out.println(average);

        average = calculateAverage(300, 0);
        System.out.println(average);
    }

    public static Float calculateAverage(int score, int count) {
        // return (float) score / (float)count;

        // 0 の除算でエラーにならないために(とりあえず)if文で処理
        if (count == 0){
            System.out.println("count が 0 です");
            return 0.f;
        }
        int average = score / count;
        return (float) average;

    }
}
