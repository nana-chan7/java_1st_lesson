// 2023-06-09 1.week9
package shop;

public enum Size {
    // LARGE, MEDIUM, SMALL;

    LARGE("L"), MEDIUM("M"), SMALL("S");
    // ↑ を実装するために ↓ ３つを追加
    private String value;

    private Size(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
