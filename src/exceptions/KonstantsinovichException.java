package exceptions;

public class KonstantsinovichException extends Exception{
        private String details;
    public KonstantsinovichException(String details) {
        this.details = details;
    }
}

