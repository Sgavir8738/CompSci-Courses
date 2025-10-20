public class Command {
	//Sebastian Gaviria
	
	private String name;
	
	public Command()
	{
		name = "none";
	}
	public Command(String xName)
	{
		this.setName(xName);
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String xName)
	{
		if (xName != null)
		{
			name = xName;
		}
		else
		{
			name = "none";
		}
	}
	public String toString()
	{
		return "Command: " + this.name;
	}
}
