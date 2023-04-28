package sample;
// 繰り返し処理
public class ItemRepeat {
    
    public static void main(String[] arg) {

        // for文 (fori を選択)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // forのネスト
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                String plot = "(" + i + "," + j + ")";
                System.out.println(plot);
            }
        }
    }
}
