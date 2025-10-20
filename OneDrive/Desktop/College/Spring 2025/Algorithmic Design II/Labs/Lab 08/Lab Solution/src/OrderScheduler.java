public class OrderScheduler {
	//Sebastian Gaviria
	
	private MinHeap<Order> orders;
	private Order currOrder;
	private int currMin = 0;
	private int totalOrders = 0;
	private int totalWaitingTime = 0;
	
	public OrderScheduler()
	{
		init();
	}
	public void init()
	{	
		orders = new MinHeap<Order>();
	}
	public void addOrder(Order o)
	{
		if (currOrder != null)
		{	//Add new order to schedule
			orders.add(o);
		}
		else
		{	//Sets order to be cooked
			currOrder = o;
		}
		totalOrders++;
	}
	public void advanceOneMinute()
	{
		currMin++;
		currOrder.cookForOneMinute();
		if (currOrder.isDone())
		{
			totalWaitingTime += (currMin - currOrder.getArrivalTime());
			currOrder = null;
			this.addOrder(orders.remove());
		}
	}
	public boolean isDone()
	{	//All orders have been completed
		return currOrder == null;
	}
	public double getAverageWaitingTime()
	{
		return totalWaitingTime / totalOrders;
	}
	public String getCurrentOrder()
	{
		return currOrder.toString();
	}
}
