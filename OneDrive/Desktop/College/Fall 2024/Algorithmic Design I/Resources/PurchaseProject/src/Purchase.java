
public class Purchase {

	//instance variables
	private String itemName;
	private double itemPrice;
	private int quantity;
	
	//default constructor
	public Purchase()
	{
		this.itemName = "unknown";
		this.itemPrice = 1;
		this.quantity = 0;
	}
	
	//parameterized constructor
	public Purchase(String xItemName, double xItemPrice, int xQuantity)
	{
		this.setItemName(xItemName);
		this.setItemPrice(xItemPrice);
		this.setQuantity(xQuantity);
	}
	
	//copy constructor
	public Purchase(Purchase pc)
	{
		this.setItemName(pc.getItemName());
		this.setItemPrice(pc.getItemPrice());
		this.setQuantity(pc.getQuantity());
	}
	
	//accessors
	public String getItemName()
	{
		return this.itemName;
	}
	
	public double getItemPrice()
	{
		return this.itemPrice;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	//mutators
	public void setItemName(String xItemName)
	{
		this.itemName = xItemName;
	}
	
	public void setItemPrice(double xItemPrice)
	{
		while (true)
		{
			if (xItemPrice > 0)
			{
				this.itemPrice = xItemPrice;
				break;
			}
		}
	}
	
	public void setQuantity(int xQuantity)
	{
		while (true)
		{
			if (xQuantity > 0)
			{
				this.quantity = xQuantity;
				break;
			}
		}
	}
	
	//other methods
	public String toString()
	{
		return "Item Name: " + this.itemName
				+ "\nItem Price: $" + this.itemPrice
				+ "\nQuantity: " + this.quantity;
	}
	
	public double totalCost()
	{
		return this.itemPrice * this.quantity;
	}
	
	//method overloading
	//--> same method definition but different args/parameters
	public double totalCost(int xCount)
	{
		return this.itemPrice * xCount;
	}
	
	public double totalCost(int xCount, double xPrice)
	{
		return xPrice * xCount;
	}
	
	
	
}
