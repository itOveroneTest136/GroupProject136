package exceptions;

public class NovikException extends Exception{

    private String details;

    public NovikException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "NovikException{" +
                "details='" + details + '\'' +
                '}';
    }
}
