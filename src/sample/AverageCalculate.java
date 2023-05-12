// 2023-04-21 week2
package sample;

import java.util.Scanner;

public class AverageCalculate{

    // 標準入力
    public static void main(String[] args){
        System.out.println("平均点の計算");
    
        Scanner sc = new Scanner(System.in);

        System.err.println("国語の点数を入力してください");
        int japanese = sc.nextInt();

        System.err.println("数学の点数を入力してください");
        int mathmatic = sc.nextInt();

        System.err.println("理科の点数を入力してください");
        int science = sc.nextInt();

        System.err.println("社会の点数を入力してください");
        int society = sc.nextInt();

        // 平均点(average)
        // 整数.0f
        float average = (japanese + mathmatic + science + society) / 4.0f;

        String message = "平均点は" + average + "です。";
        System.out.println(message);

    }
    
}