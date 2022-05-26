package exceptions;

public class TuromshaException extends Exception{
    String details;

    public TuromshaException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}
