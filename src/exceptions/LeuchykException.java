package exceptions;

public class LeuchykException extends Exception
{
	private String details;

	public LeuchykException(String details)
	{
		this.details = details;
	}

	public String getDetails()
	{
		return details;
	}

	@Override
	public String toString()
	{
		return "LeuchykException{" + "details='" + details + '\'' + '}';
	}

}
