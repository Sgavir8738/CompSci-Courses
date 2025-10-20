
public class Undergraduate extends Student {

	private String minor;
	private int level;
	
	//default constructor
	public Undergraduate()
	{
		super();	//calls student's default constructor
		this.minor = "no minor selected";
		this.level = 1;
	}
	
	//parameterized constructor
	public Undergraduate(String xName, int xAge, int xID, double xGpa, String xMajor, String xMinor, int xLevel)
	{
		super(xName, xAge, xID, xGpa, xMajor);
		this.setMinor(xMinor);
		this.setLevel(xLevel);
	}
	
	//accessors
	public String getMinor()
	{
		return this.minor;
	}
	
	public int getLevel()
	{
		return this.level;
	}
	
	//mutators
	public void setMinor(String xMinor)
	{
		if (xMinor.equalsIgnoreCase("Business")
				|| xMinor.equalsIgnoreCase("Dance")
				|| xMinor.equalsIgnoreCase("Spanish")
				|| xMinor.equalsIgnoreCase("History"))
		{
			this.minor = xMinor;
		}
		else
		{
			System.out.println("Invalid minor");
		}
	}
	
	public void setLevel(int xLevel)
	{
		if (xLevel >= 1 && xLevel <= 4)
		{
			this.level = xLevel;
		}
		else
		{
			System.out.println("Invalid level");
		}
	}
	
	public void writeOutput()
	{
		super.writeOutput();	//calls Student's writeOutput()
		System.out.println("Minor: " + this.minor
				+ "\nStudent Level: " + this.level);
	}
}
