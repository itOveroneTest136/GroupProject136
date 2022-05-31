package exceptions;

public class BeliayevaException extends Exception{

    private String details;

    public BeliayevaException(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "BeliayevaException{" +
                "details='" + details + '\'' +
                '}';
    }
}
