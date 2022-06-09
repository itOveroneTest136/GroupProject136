package BuselGeneric;

public class Juice implements Liquid {

    private String name;

    public Juice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void pour() {
    }

    @Override
    public String toString() {
        return "В чашке сок " + name;
    }
}