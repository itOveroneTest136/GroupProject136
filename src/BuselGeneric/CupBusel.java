package BuselGeneric;

public class CupBusel<T> implements Liquid {

    private T cup;

    public CupBusel(T cup) {
        this.cup = cup;
    }

    public T getCup() {
        return cup;
    }

    public void setCup(T cup) {
        this.cup = cup;
    }

    @Override
    public void pour() {

    }
}
