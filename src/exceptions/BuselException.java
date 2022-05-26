package exceptions;

public class BuselException extends Exception{

    private String details;

    public BuselException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "BuselException{" +
                "details = '" + details + '\'' +
                '}';
    }
}
