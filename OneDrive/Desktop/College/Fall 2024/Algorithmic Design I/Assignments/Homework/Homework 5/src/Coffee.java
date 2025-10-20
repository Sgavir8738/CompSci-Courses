import java.util.Scanner;
public class Coffee {

	// Sebastian Gaviria
	
	public String name;
	public double caffeine;
	
	// default constructor
	public Coffee()
	{
		this.name = "None";
		this.caffeine = 50;
	}
	
	
	// parameterized constructor
	public Coffee(String xName, double xCaffeine)
	{
		this.setName(xName);
		this.setCaffeine(xCaffeine);
	}
	
	// accessors
	public String getName()
	{
		return this.name;
	}
	
	public double getCaffeine()
	{
		return this.caffeine;
	}
	
	
	// mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setCaffeine(double xCaffeine)
	{	
		this.caffeine = xCaffeine;
	}
	
	// other methods
	public double RiskyAmount(double xCaffeine)
	{
		double maxAmount = 0.0;
		
		maxAmount = 180.0 / ((xCaffeine / 100.0) * 6.0);
		
		return maxAmount;
	}
	
	public boolean equals(Coffee c)
	{
		return c.getName().equals(this.name)
				&& c.getCaffeine() == this.caffeine;
	}
	
	public String toString()
	{
		return "Name: " +  this.name 
				+ "\nCaffeine Amount: " + this.caffeine;
	}
	
	
}
