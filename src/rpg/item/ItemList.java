// 2023-06-09 1.week9
// 2023-06-15 2.week1

package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ItemList {

    private final String CSV_PATH = "data/item.csv";  // csvファイルを読み込む
    ArrayList<Item> list = new ArrayList<>();

    public ItemList() {  // 空のコンストラクタを作成
        this.loadCSV();
    }

    public void loadCSV(){
        System.out.println("CSV 読み込み");
        FileInputStream file;
        InputStreamReader reader;
        BufferedReader buffere;

        // quick fix: surround try/catch
        try {
            // ファイルを開く 
            file = new FileInputStream(CSV_PATH);
            reader = new InputStreamReader(file, "UTF-8");
            // バッファを用意
            buffere = new BufferedReader(reader);
            String line = buffere.readLine();  // 1行ずつ読み込む quick fix:Add catch clause to surrounding try
            System.out.println(line);

            // アイテムデータ読み込み (2行目以降)

        } catch (FileNotFoundException e) {
            System.out.println(CSV_PATH + "が開けません");

        } catch (IOException e) {
            System.out.println("読み込みエラー");
        }  
    }
}