// 2023-05-26
package sns.entity;

public class App {
    public static void main(String[] args) {
        User user = new User();

        // user.email = "yse@test.com";
        user.setEmail("yse@test.com");
        user.setName("東京 太郎");
        user.setPassword("xxxxxxx");

        System.out.println(user.getEmail());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
    }
}
