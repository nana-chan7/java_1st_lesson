package exam47.q7;

class Purchase {
    String date;
    int amount;
    int point;

    Purchase(String date, int amount){
        this.date = date;
        this.amount = amount;
        point = amount / 100;
        if (isDoublePointDay(date.substring(8, 10))) {
            point *= 2;
        }
        private boolean isDoublePointDay(String date){
            return date.equals("10") || date.equals("20");
        }
    }
}
