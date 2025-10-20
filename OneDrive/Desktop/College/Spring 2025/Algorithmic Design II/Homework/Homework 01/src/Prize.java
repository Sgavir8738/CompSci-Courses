
public class Prize {
	//Sebastian Gaviria
	private String name;
	private double price;
	
	public Prize()
	{
		name = "none";
		price = 0;
	}
	public Prize(String xName, double xPrice)
	{
		this.setName(xName);
		this.setPrice(xPrice);
	}
	public String getName()
	{
		return this.name;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setName(String xName)
	{
		this.name = xName;
	}
	public void setPrice(double xPrice)
	{
		this.price = xPrice;
	}
	public String toString()
	{
		return "Name: " + this.name
				+ "\tPrice: " + this.price;
	}
	
}
