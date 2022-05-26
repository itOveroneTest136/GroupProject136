public enum Konstantinovi {

    BELARUS(9413446,9349645),
    RUSSUA(146458030,145864296),
    UKRAINE(42153201,41167336);


    private double populatoin2019;
    private double populatoin2021;

    Konstantinovi(double populatoin2019, double populatoin2021) {
        this.populatoin2019 = populatoin2019;
        this.populatoin2021 = populatoin2021;
    }

    public double getPopulatoin2019() {
        return populatoin2019;
    }

    public double getPopulatoin2021() {
        return populatoin2021;
    }
}
