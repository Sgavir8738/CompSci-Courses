public class Sheep implements Comparable<Sheep> {
	//Sebastian Gaviria
	
	private String name;
	private int arrivalTime;
	private int shearingTime;
	public int shearingTimeLeft;
	
	public Sheep()
	{
		this.name = "none";
		this.arrivalTime = 0;
		this.shearingTime = this.shearingTimeLeft = 1;
	}
	public Sheep(String xName, int xShearingTime, int xArrivalTime)
	{
		this.setName(xName);
		this.setShearingTime(xShearingTime);
		this.setArrivalTime(xArrivalTime);
		this.setShearingTimeLeft(xShearingTime);
	}
	public String getName()
	{
		return this.name;
	}
	public int getShearingTime()
	{
		return this.shearingTime;
	}
	public int getArrivalTime()
	{
		return this.arrivalTime;
	}
	public int getSheringTimeLeft()
	{
		return this.shearingTimeLeft;
	}
	public void setName(String xName)
	{
		if (xName != null)
		{
			this.name = xName;
		}
	}
	public void setShearingTime(int xShearingTime)
	{
		if (xShearingTime > 0)
		{
			this.shearingTime = xShearingTime;
		}
	}
	public void setArrivalTime(int xArrivalTime)
	{
		if (xArrivalTime > 0)
		{
			this.arrivalTime = xArrivalTime;
		}
	}
	public void setShearingTimeLeft(int xShearingTimeLeft)
	{
		if (xShearingTimeLeft <= this.shearingTime)
		{
			this.shearingTimeLeft = xShearingTimeLeft;
		}
	}
	public String toString()
	{
		return "Name: " + this.name
				+ ", Shear Time: " + this.shearingTime
				+ ", Arrival Time: " + this.arrivalTime;
	}
	public int compareTo(Sheep s)
	{	//Returns different values using a single line of code
		return this.shearingTime > s.getShearingTime() ? 1 : (this.shearingTime == s.getShearingTime() ? 0 : -1);
	}
	public void shearForOneMinute()
	{
		this.shearingTimeLeft--;
	}
	public boolean isDone()
	{
		return this.shearingTimeLeft == 0;
	}
}
