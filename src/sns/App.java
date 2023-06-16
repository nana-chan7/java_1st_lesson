// 2023-05-26 1.week7
package sns;

// どこのパッケージか明示的にする
import sns.entity.User;

public class App {
    public static void main(String[] args) {
        User user = new User();
        // user.email = "yse@test.com";
        user.setEmail("yse@test.com");
    }
}
