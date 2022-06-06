package exceptions;

public class SamokException extends Exception{
    private String details;

    public SamokException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "SamokException{" +
                "details='" + details + '\'' +
                '}';
    }
}
