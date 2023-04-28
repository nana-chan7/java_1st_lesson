package sample;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    
    public static void main(String[] args){
        // グー
        final int ROCK = 0;
        // チョキ
        final int SCISSORS = 1;
        // パー
        final int PAPER = 2;
    
        // playerの手(標準入力: Standrd Input)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input hand:(0:グー, 1:チョキ, 2:パー)");
        int playerHand = scanner.nextInt();
        scanner.close();  // 標準入力を開始したら下に書く(あってもなくても？)

        // pcの手 (ランダム)
        Random ramgdom = new Random();
        int pcHand = ramgdom.nextInt(3);

        // int pcHand = SCISSORS;
        int result = 0;
        String message = "";

        // じゃんけんのジャッジ
        result = (playerHand + 3 - pcHand) % 3;

        // じゃんけんの結果
        // if else statement
        if (result == 0) {
            message = "Draw!";
        } 
        else if (result == 1){
            message = "You Lose...";
        }else{
            message = "You Win!!";
        }
        
        String playerResult = "Player:" + playerHand;
        String pcResult = "PC:" + pcHand;

        System.out.println(playerResult);
        System.out.println(pcResult);
        System.out.println(message);

    }
}
