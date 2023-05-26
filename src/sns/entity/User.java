// 2023-05-26
package sns.entity;

public class User {
    
    // ↓ みんなに見える
    // public String email;

    // ↓ 違うパッケージだと認識できなくなる
    // ↓ 自分の家族だけ知っている感じ
    // protected String email;

    // ↓ 同じパッケージの中なら認識できる
    // String email;
    
    // ↓ ほかのファイルの email がエラーになる
    private String email;
    private String name;
    private String password;

     // ソースアクション → Generate Getters Setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }  
}
