package exceptions;

public class PlyosovException extends Exception {
    private String details;

    public PlyosovException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "PlyosovException{" +
                "details='" + details + '\'' +
                '}';
    }
}

