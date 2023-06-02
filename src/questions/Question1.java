package questions;

public class Question1 {
    public static void main(String[] args) {
        String message = loginMessage("東京 太郎");
        System.out.println(message);
    }
    
    public static String loginMessage(String userName) {
        String message = "ようこそ" + userName + "さん！";
      return message;
    }
    
}
