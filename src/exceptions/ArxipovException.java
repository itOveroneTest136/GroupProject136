package exceptions;

public class ArxipovException  extends  Exception{
    private String details;

    public ArxipovException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "ArxipovException{" +
                "details='" + details + '\'' +
                '}';
    }
}
