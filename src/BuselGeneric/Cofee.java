package BuselGeneric;

public class Cofee implements Liquid {

    private String name;

    public Cofee(String name) {
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
        return "В чашке кофе " + name;
    }
}