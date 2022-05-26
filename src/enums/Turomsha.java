package enums;

public enum Turomsha {
    UKRAINE(44_130_000,44_390_000),
    POLAND(37_950_000,37_970_000),
    URUGUY(3_462_000,3_447_000);
    private int population2020;
    private int population2019;

   Turomsha(int population2020, int population2019) {
        this.population2020 =  population2020;
        this.population2019 = population2019;
    }

    public int getPopulation2020() {
        return population2020;
    }

    public int getPopulation2019() {
        return population2019;
    }
}
