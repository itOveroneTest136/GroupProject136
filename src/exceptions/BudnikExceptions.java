package exceptions;

public class BudnikExceptions extends Exception
{
    private String details;

    public BudnikExceptions(String details)
    {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "BudnikExceptions{" +
                "details='" + details + '\'' +
                '}';
    }
}
