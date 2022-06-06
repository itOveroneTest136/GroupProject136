package generic;

public class Konstantinovich <T extends Number,E> {
    public  T value;
    private  E value2;

    public Konstantinovich(T value, E value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public E getValue2() {
        return value2;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setValue2(E value2) {
        this.value2 = value2;
    }

}
