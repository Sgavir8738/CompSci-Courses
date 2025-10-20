
public class UnknownOperatorException extends Exception {

	public UnknownOperatorException()
	{
		super("Unknown operator entered.");
	}
	
	public UnknownOperatorException(String msg)
	{
		super(msg);
	}
}
