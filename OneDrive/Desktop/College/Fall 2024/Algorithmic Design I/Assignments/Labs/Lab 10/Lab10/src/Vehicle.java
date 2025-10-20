
public class Vehicle {

	// Sebastian Gaviria 
	
	private String manuName;
	private int cylinders;
	private String ownersName;
	
	public Vehicle()
	{
		this.manuName = "no name";	
		this.cylinders = 1;
		this.ownersName = "no name";
	}
	
	public Vehicle(String xManuName, int xCylinders, String xOwnersName )
	{
		this.setManuName(xManuName);
		this.setCylinders(xCylinders);
		this.setOwnersName(xOwnersName);
	}
	
	public String getManuName()
	{
		return this.manuName;
	}
	
	public int getCylinders()
	{
		return this.cylinders;
	}
	
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	public void setManuName(String xManuName)
	{
		this.manuName = xManuName;
	}
	
	public void setCylinders(int xCylinders)
	{
		if (xCylinders > 0)
		{
			this.cylinders = xCylinders;
		}
		else
		{
			System.out.println("\nInvalid number of cylinders.");
		}
	}
	
	public void setOwnersName(String xOwnersName)
	{
		this.ownersName = xOwnersName;
	}
	
	public boolean equals(Vehicle v)
	{
		return v.getManuName().equalsIgnoreCase(this.manuName)
				&& v.getCylinders() == this.cylinders
				&& v.getOwnersName().equalsIgnoreCase(this.ownersName);
	}
	
	public String toString()
	{
		return "Manufacturer: " + this.manuName
				+ "\nNumber of Cylinders: " + this.cylinders
				+ "\nOwner: " + this.ownersName; 
	}
}
