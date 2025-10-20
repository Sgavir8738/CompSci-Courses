
public class Taco {
	private String name;
	private String location;
	private double price;
	
	public Taco()
	{
		this.name = "none";
		this.location = "none";
		this.price = 0.0; 
	}
	
	public Taco(String xName, String xLocation, double xPrice)
	{
		this.setName(xName);
		this.setLocation(xLocation);
		this.setPrice(xPrice);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	
	public double getPrice()
	{
		return this.price;
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
	
	public void setLocation(String xLocation)
	{
		if (xLocation != null)
		{
			this.location = xLocation;
		}
		else
		{
			this.location = "none";
		}
	}
	
	public void setPrice(double xPrice)
	{
		if (xPrice >= 0)
		{
			this.price = xPrice;
		}
		else
		{
			this.price = 0;
		}
	}
	
	public String toString()
	{
		return "Name: " + this.name
				+ "\tLocation: " + this.location
				+ "\tPrice: $" + this.price;
	}
	
	public boolean equals(Taco t)
	{
		return t != null &&
				this.name.equals(t.getName()) &&
				this.location.equals(t.getLocation()) &&
				this.price == t.getPrice();
	}
}
