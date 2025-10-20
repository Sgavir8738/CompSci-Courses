
public class GroceryList {
	//Sebastian Gaviria
	private class ListNode {
		
		GroceryItem data;
		ListNode link;
		public ListNode(GroceryItem aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head;
	private ListNode current;
	private ListNode previous;
	
	public GroceryList()
	{
		head = current = previous = null;
	}
	public void addItem(GroceryItem aData)
	{	
		ListNode newNode = new ListNode(aData, null);
		if (head == null)
		{	//Create a new list
			head = current = newNode;
			return;
		}
		ListNode temp = head;
		while (temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	public void addItemAfterCurrent(GroceryItem aData)
	{
		if (current == null)
		{
			return;
		}
		//Creates new node between the current node and the next one
		ListNode newNode = new ListNode(aData, current.link);
		current.link = newNode;
	}
	public void showList()
	{
		ListNode temp = head;
		while (temp != null)
		{	//Prints all grocery items
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public GroceryItem getCurrent()
	{
		if (current == null)
		{
			return null;
		}
		return current.data;
	}
	public void setCurrent(GroceryItem aData)
	{
		if (current == null)
		{
			return;
		}
		current.data = aData;
	}
	public void gotoNext()
	{
		if (current != null)
		{
			previous = current;
			current = current.link;
		}
	}
	public void reset()
	{	
		current = head;
		previous = null;
	}
	public void removeCurrent()
	{
		if (current != null && previous != null)
		{
			previous.link = current.link;
			current = current.link;
		}
		else if (current != null && previous == null)
		{
			head = head.link;
			current = head;
		}
		reset();
	}
	public double totalCost()
	{
		double totalCost = 0;
		while (current != null)
		{	//Adds each item's value to the total cost
			totalCost += current.data.getValue();
			gotoNext();
		}
		reset();
		return totalCost;
	}
	public boolean contains(GroceryItem aData)
	{
		while (current != null)
		{
			if (current.data.equals(aData)) //Compares each item's data
			{
				return true;
			}
			gotoNext();
		}
		reset();
		return false;
	}
}
