public enum Busel {

    BELARUS(9_413_446,9_349_645),
    RUSSIA (146_459_803, 145_864_296),
    UKRAINE (42_153_201,41_167_336);

    private int population2019;
    private int population2021;

    Busel(int population2019, int population2021) {
        this.population2019 = population2019;
        this.population2021 = population2021;
    }

    public int getPopulation2019() {
        return population2019;
    }

    public int getPopulation2021() {
        return population2021;
    }
}
