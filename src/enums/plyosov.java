package enums;

public enum plyosov {
    BELARUS(9_413_446,9_349_645),
    RUSSIA(146_459_803,145_864_296),
    UKRAINE(42_153_201,41_167_336);
    private double population2019;
    private double population2021;

   plyosov(double population2019, double population2021) {
        this.population2019 = population2019;
        this.population2021 = population2021;
    }

    public double getPopulation2019() {
        return population2019;
    }

    public double getPopulation2021() {
        return population2021;
    }
}
