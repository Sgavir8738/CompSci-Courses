
public class Pet {

	
	//instance variables
	private String name;
	private double weight;
	private String type;
	
	//default constructor
	public Pet()
	{
		this.name = "no name selected";
		this.weight = 0;
		this.type = "unknown";
	}
	
	//parameterized constructor
	public Pet(String xName, double xWeight, String xType)
	{
		this.setName(xName);
		this.setWeight(xWeight);
		this.setType(xType);
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setWeight(double xWeight)
	{
		if (xWeight> 0)
		{
			this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid input.");
		}
	}
	
	public void setType(String xType)
	{
		if (xType.equalsIgnoreCase("dog")
				|| xType.equalsIgnoreCase("cat")
				|| xType.equalsIgnoreCase("bird")
				|| xType.equalsIgnoreCase("fish")
				|| xType.equalsIgnoreCase("turtle"))
		{
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid input.");
		}
	}
	
	//other methods
	public boolean equals(Pet p)
	{
		return p.getName().equals(this.name)
				&& p.getWeight() == this.weight
				&& p.getType().equals(this.type);
	}
	
	public String toString()
	{
		return "Name: " + this.name
				+ "\nWeight: " + this.weight + " lbs"
				+ "\nPet Type: " + this.type;
	}
}
