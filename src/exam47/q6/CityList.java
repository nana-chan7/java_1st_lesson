package exam47.q6;

class CityList {
    private static final int BASE = 10; // 基数
    private static final int PLACE_MAX = BASE * BASE; // 位の最大
    private City[] cities; // 都市データの配列

    // コンストラクタ
    CityList(City[] cityData){
        cities =  cityData;
        // cities = new City[cityData.length];

        for (int dist = 0; dist < cityData.length; dist++){
            cityData[dist] = cityData[dist];
        }
    }

    void sortData(){
        final int length = cities.length;
        int place = 1;
        while (place <= PLACE_MAX) {
            int next = 0;
            for (int digit = 9; digit >=0; digit--) {
                for (int target = next; target < length; target++) {
                    if (getDigit(target, place) == digit){
                        move(target, next);
                        next++;
                    }
                }
            }
        }
    }
    private int getDigit(int target, int place) {
        return ((cities[target].getPopulation() / place) % BASE);
    }

    private void move(int from, int to) {
        City tmp = cities[from];
        for (int shift = from - 1; shift >= to; shift--) {
            cities[shift + 1] = cities[shift]; 
        }
        cities[to] = tmp;
    }

    void showData() {
        for (City city : cities) {
            String message = city.getName() + "\t" + city.getPopulation();
            System.out.println(message);
        }
    }
}
// 34 エ