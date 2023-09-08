// 2023-06-09 1.week9
// exception
package sample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoadApp {
    public static void main(String[] args) {
        String path = "data/sample.txt";  // 一応画像でも読み込める(文字化け？するし処理はできない？)
        loadFile(path);

        // loadFile2(path); → クイックフィックス: Surround with try/catch
        try {
            loadFile2(path);
        } catch (FileNotFoundException e) {
            System.out.println("ファイルを読み込めませんでした");
        } catch (IOException e) {
            System.out.println("処理が終了しました");  
        }
    }

    public static void loadFile(String path) {
        // filein → FileInputStream file = new と入力 →
        // new → FileInputStream(String name) を選択
        // ↑ そのままだと波線つくので クイックフィックス: Surround with try/catch を選択
        try {
            FileInputStream file = new FileInputStream(path);

            // input → InputStreamReader → new → InputStreamReader(in) 必ず文字コードを指定
            InputStreamReader reader = new InputStreamReader(file, "UTF-8");
            System.out.println("ファイルを開きました。");

            // new → BufferedReader(in)
            BufferedReader buffer = new BufferedReader(reader);

            // クイックフィックス → Add catch clause to surriuding try
            // buffer.readLine();

            String line;
            // ファイルの行に何か入ってる場合 (null でなければ)
            // １行ずつ受け取る
            while ((line = buffer.readLine()) != null){
                System.out.println(line);
            }
            
            // なくても処理は行われるが、作法的に記述する
            buffer.close();
            reader.close();
            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした");
        } catch (IOException e) {
            System.out.println("ファイル読み込みエラー");
        }finally{  // 最後に必ず処理される
            System.out.println("処理が終了しました");  
        }
    }

    public static void loadFile2(String path) 
        throws FileNotFoundException, IOException {  
        //↑: ↓ の後、throws FileNotFoundException の後ろに , IOException を追加

        FileInputStream file = new FileInputStream(path);  // クイックフィックス: Add throws declaretion
        InputStreamReader reader = new InputStreamReader(file, "UTF-8");
        System.out.println("ファイルを開きました。");

        BufferedReader buffer = new BufferedReader(reader);

        String line;
        while ((line = buffer.readLine()) != null){
            System.out.println(line);
            }

        buffer.close();
        reader.close();
        file.close();


    }
}
