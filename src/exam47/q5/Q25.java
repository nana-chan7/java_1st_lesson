package exam47.q5;

public class Q25 {
    public static void main(String[] args) {
        int[][] t = {{1,2}, {3, 4}, {5}};
        for (int[]a : t){ // forearch
            for (int n : a){
                System.out.print(n + ", ");
            }
        }
    }
}
