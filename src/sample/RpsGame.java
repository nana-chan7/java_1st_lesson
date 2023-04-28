package sample;

public class RpsGame {
    
    public static void main(String[] args){
        final int ROCK = 0;
        final int SCISSORS = 1;
        final int PAPER = 2;
        int playerHand;
        int pcHand;
        int result = 0;
        String message = "";

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
        
        System.out.println(message);

    }
}
