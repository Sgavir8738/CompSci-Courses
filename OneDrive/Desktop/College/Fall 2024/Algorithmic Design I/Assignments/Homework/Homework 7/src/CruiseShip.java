
public class CruiseShip extends Ship {

	private int capacity;
	private int crew;
	
	public CruiseShip()
	{
		super();
		capacity = 0;
		crew = 0;
	}
	
	public CruiseShip(String xName, String xDate, int xCapacity, int xCrew) throws Exception
	{
		super(xName, xDate);
		this.setCapacity(xCapacity);
		this.setCrew(xCrew);
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public int getCrew()
	{
		return this.crew;
	}
	
	public void setCapacity(int xCapacity)
	{
		if (xCapacity > 0)
		{
			this.capacity = xCapacity;
		}
		else
		{
			
		}
	}
	
	public void setCrew(int xCrew)
	{
		if (xCrew > 0)
		{
			this.crew = xCrew;
		}
		else
		{
			
		}
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Passenger Capacity: " + this.capacity
				+ "\nCrew: " + this.crew);
	}
}
