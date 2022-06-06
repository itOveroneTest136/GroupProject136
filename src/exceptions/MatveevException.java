package exceptions;

public class MatveevException extends Exception {
    private String details;

    public MatveevException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "MatveevException " + '\n' +
                "details = " + details;
    }
}
