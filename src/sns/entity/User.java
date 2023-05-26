// 2023-05-26
package sns.entity;

public class User {
    
    // ↓ みんなに見える
    // public String email;

    // ↓ ほかのファイルの email がエラーになる
    private String email;
    private String name;
    private String password;

    // ↓ 違うパッケージだと認識できなくなる
    // ↓ 自分の家族だけ知っている感じ
    // protected String email;

    // ↓ 同じパッケージの中なら認識できる
    // String email;
    
}
