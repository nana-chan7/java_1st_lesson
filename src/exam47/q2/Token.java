package exam47.q2;

class Token implements {
    // static変数
    static long number = 1;
    // インスタンス変数(フィールド, プロパティ)
    long num;
    String attibute;

    Token(){
        num = number;
        number = number + 1;
    }

    void setAttibute(String attibute) {
        this.attibute = attibute;
    }

}
