// 2023-05-26
package sns;

// どこのパッケージか明示的にする
import sns.entity.User;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.email = "yse@test.com";
    }
}
