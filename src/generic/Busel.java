package generic;

public class Busel <T extends Number,E> {
    public T value;
    private E value2;

    public Busel(T value, E value2) {
        this.value = value;
        this.value2 = value2;
    }

    public E getValue2() {
        return value2;
    }

    public void setValue2(E value2) {
        this.value2 = value2;
    }
}
