
public class Process {
	//Sebastian Gaviria
	
	private String name;
	private double time;
	
	public Process()
	{
		name = "none";
		time = 0;
	}
	public Process(String aName, double aTime)
	{
		this.setName(aName);
		this.setCompletionTime(aTime);
	}
	public String getName()
	{
		return this.name;
	}
	public double getCompletionTime()
	{
		return this.time;
	}
	public void setName(String aName)
	{
		if (aName != null)
		{
			name = aName;
		}
		else
		{
			name = "none";
		}
	}
	public void setCompletionTime(double aTime)
	{
		if (aTime >= 0)
		{
			time = aTime;
		}
		else
		{
			time = 0;
		}
	}
	public String toString()
	{
		return "Process Name: " + this.name + 
				" Completion Time: " + this.time;
	}
}
