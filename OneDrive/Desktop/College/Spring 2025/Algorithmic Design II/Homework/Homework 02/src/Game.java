
public class Game {
	//Sebastian Gaviria
	
	private String name;
	private String console;
	
	public Game()
	{
		name = "none";
		console = "none";
	}
	public Game(String xName, String xConsole)
	{
		this.setName(xName);
		this.setConsole(xConsole);
	}
	public String getName()
	{
		return this.name;
	}
	public String getConsole()
	{
		return this.console;
	}
	public void setName(String xName)
	{
		if (xName != null)
		{
			this.name = xName;
		}
		else
		{
			this.name = "none";
		}
	}
	public void setConsole(String xConsole)
	{
		if (xConsole != null)
		{
			this.console = xConsole;
		}
		else
		{
			this.console = "none";
		}
	}
	public String toString()
	{
		return this.name +"\t" + this.console;
	}
}
