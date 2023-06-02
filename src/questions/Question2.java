package questions;

public class Question2 {
    public static void main(String[] args) {
        int point = calculatePoint(400);
        System.out.println(point + "pt");
        point = calculatePoint(400, 0.05f);
        System.out.println(point + "pt");
    }
    
    public static int calculatePoint(int price) {
        float point = price * 0.01f;
        return (int) point;
    }
    
    public static int calculatePoint(int price, float pointRate) {
        float point = (float) price * pointRate;
        return (int) point;
    }
}
