package exam47.q6;

public class City {
    private String name; // 都市名
    private int population; // 人口

    public City(String name, String population) {
        this.name = name;
        this.population = Integer.parseInt(population);
    }

    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }

}
