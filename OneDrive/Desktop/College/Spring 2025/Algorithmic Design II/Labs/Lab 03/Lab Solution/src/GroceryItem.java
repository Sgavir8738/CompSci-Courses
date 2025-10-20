
public class GroceryItem {
	//Sebastian Gaviria
	private String name;
	private double value;
	
	public GroceryItem()
	{
		name = "none";
		value = 0;
	}
	public GroceryItem(String xName, double xValue)
	{
		this.setName(xName);
		this.setValue(xValue);
	}
	public String getName()
	{
		return this.name;
	}
	public double getValue()
	{
		return this.value;
	}
	public void setName(String xName)
	{
		if (xName != null)
		{
			this.name = xName;
		}
		else
		{
			this.name = null;
		}
	}
	public void setValue(double xValue)
	{
		if (xValue >= 0)
		{
			this.value = xValue;
		}
		else 
		{
			this.value = 0;
		}
	}
	public String toString()
	{
		return "Grocery Item Name: " + this.name
				+ " Value: " + this.value;
	}
	public boolean equals(GroceryItem g)
	{
		return this.name.equals(g.getName()) 
				&& this.value == g.getValue();
	}
}
