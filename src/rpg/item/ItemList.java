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
    public ArrayList<Item> list = new ArrayList<>();  // ItemListApp がアクセスできるように publicにする

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
            while ((line = buffere.readLine()) != null) {  // 値が nullでなければ読み込み続ける
                // System.out.println(line);

                // カンマ区切りで配列 (文字列)
                String[] data = line.split(","); 

                Long id = Long.parseLong(data[0]);  // 文字列を Long型にキャスト
                String name = data[1];  // ここは文字列のままなのでキャストしない
                Integer price = Integer.parseInt((data[3]));  // ←↓ 文字列を Integer型にキャスト 
                Integer attackPower = Integer.parseInt((data[4]));  
                Integer defencePower = Integer.parseInt((data[5]));  

                // アイテム生成
                Item item = new Item(name, price, attackPower, defencePower);
                // アイテムリストに追加
                list.add(item);
            }

        } catch (FileNotFoundException e) {
            System.out.println(CSV_PATH + "が開けません");

        } catch (IOException e) {
            System.out.println("読み込みエラー");
        }  
    }
}

// <<< memo >>>
// Long (長整数型) 変数は、-2,147,483,648 から 2,147,483,647 までの符号付き 32 ビット (4 バイト) 数として格納する

// Integer (整数) 型は符号付き整数のバイナリ形式で格納され、通常、カウントや数量などの格納に使用される
    // 整数データに対しては、算術演算および比較ソートは浮動小数点や 10 進数のデータよりも効率的に実行される 
    // ただし、整数 (INTEGER) 型列は (2 31-1) を超えた絶対値を格納できない