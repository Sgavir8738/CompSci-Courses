
public class Ship {

	private String name;
	private String date;
	
	// default constructor
	public Ship()
	{
		name = "no name";
		date = "01/01/2000";
	}
	
	// parameterized constructor
	public Ship(String xName, String xDate) throws Exception
	{
		this.setName(xName);
		this.setDate(xDate);
	}
	
	// accessors
	public String getName()
	{
		return this.name;
	}
	
	public String getDate()
	{
		return this.date;
	}
	
	// mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setDate(String xDate) throws Exception
	{
		String dateDay = xDate.substring(0, 2);
		int xDay = Integer.parseInt(dateDay);
		
		String dateMonth = xDate.substring(3, 5);
		int xMonth = Integer.parseInt(dateMonth);
		
		String dateYear = xDate.substring(6);
		int xYear = Integer.parseInt(dateYear);
				
		if (xDay > 0 && xDay <= 31
				&& xMonth > 0 && xMonth >= 12
				&& xYear >= 1990 && xYear <= 2019)
		{
			this.date = xDate;
		}
		else
		{
			throw new Exception();
		}
	}
	
	// other methods
	public void writeOutput()
	{
		System.out.println("Name: " + this.name
				+ "\nLaunch Date: " + this.date);
	}
}
