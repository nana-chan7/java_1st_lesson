// 2023-06-09 week9
package sample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoadApp {
    public static void main(String[] args) {
        String path = "data/sample.txt";
        // filein → FileInputStream file = new と入力 →
        // new → FileInputStream(String name) を選択
        // ↑ そのままだと波線つくので クイックフィックス: Surround with try/catch を選択
        try {
            FileInputStream file = new FileInputStream(path);

            // input → InputStreamReader → new → InputStreamReader(in)
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
            
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした。");
        } catch (IOException e) {
            System.out.println("ファイル読み込みエラー");
        }

    }
}
