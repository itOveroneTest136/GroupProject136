public enum Novik {
    BELARUS(9_412_446, 9_3496_45),
    RUSSIA(146_459_803, 145_864_296),
    UKRAINE(42_153_201, 41_167_236);

    private int population2019;
    private int population2021;

    Novik(int population2019, int population2021) {
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

