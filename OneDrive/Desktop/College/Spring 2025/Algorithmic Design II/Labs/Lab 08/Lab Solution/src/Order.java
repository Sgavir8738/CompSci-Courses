public class Order implements Comparable<Order> {
	//Sebastian Gaviria
	
	private String customer;
	private String foodOrder;
	private int cookingTime;
	private int arrivalTime;
	private int cookingTimeLeft;
	
	public Order()
	{
		this.customer = this.foodOrder = "none";
		this.cookingTime = cookingTimeLeft = 1;
		this.arrivalTime = 0;
	}
	public Order(String xCustomer, String xFoodOrder, int xCookingTime, int xArrivalTime)
	{
		this.setCustomer(xCustomer);
		this.setFoodOrder(xFoodOrder);
		this.setCookingTime(xCookingTime);
		this.setArrivalTime(xArrivalTime);
		this.setCookingTimeLeft(xCookingTime);
	}
	public String getCustomer()
	{
		return this.customer;
	}
	public String getFoodOrder()
	{
		return this.foodOrder;
	}
	public int getCookingTime()
	{
		return this.cookingTime;
	}
	public int getArrivalTime()
	{
		return this.arrivalTime;
	}
	public int getCookingTimeLeft()
	{
		return this.cookingTimeLeft;
	}
	public void setCustomer(String xCustomer) 
	{
		if (xCustomer != null)
		{
			this.customer = xCustomer;
		}
	}
	public void setFoodOrder(String xFoodOrder) 
	{
		if (xFoodOrder != null)
		{
			this.foodOrder = xFoodOrder;
		}
	}
	public void setCookingTime(int xCookingTime) 
	{
		if (xCookingTime > 0)
		{
			this.cookingTime = xCookingTime;
		}
	}
	public void setArrivalTime(int xArrivalTime) 
	{
		if (xArrivalTime > 0)
		{
			this.arrivalTime = xArrivalTime;
		}
	}
	public void setCookingTimeLeft(int xCookingTimeLeft) 
	{
		if (xCookingTimeLeft <= this.cookingTime)
		{	//Initialize time left equal to initial
			this.cookingTimeLeft = xCookingTimeLeft;
		}
	}
	public String toString()
	{
		return "Customer: " + this.customer
			+ " Order: " + this.foodOrder
			+ " Cooking Time Left: " + this.cookingTimeLeft;
	}
	public int compareTo(Order o)
	{
		return this.cookingTime > o.getCookingTime() ? 1 : (this.cookingTime == o.getCookingTime() ? 0 : -1);
	}
	public void cookForOneMinute()
	{
		this.cookingTimeLeft--;
	}
	public boolean isDone()
	{	//Order is completed
		return this.cookingTimeLeft == 0;
	}
}
