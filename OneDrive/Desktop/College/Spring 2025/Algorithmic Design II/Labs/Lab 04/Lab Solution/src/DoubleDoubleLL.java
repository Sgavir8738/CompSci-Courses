
public class DoubleDoubleLL {
	//Sebastian Gaviria
	
	protected class ListNode {
		double data;
		ListNode nextLink;
		ListNode prevLink;
		public ListNode(double aData, ListNode aNextLink, ListNode aPrevLink)
		{
			data = aData;
			nextLink = aNextLink;
			prevLink = aPrevLink;
		}
	}
	protected ListNode head;
	protected ListNode current;
	protected ListNode previous;
	public DoubleDoubleLL()
	{
		head = current = previous = null;
	}
	public void gotoNext()
	{
		if (current != null)
		{
			previous = current;
			current = current.nextLink;
		}
	}
	public void gotoPrev()
	{
		if (current != null)
		{
			current = previous;
			previous = previous.prevLink;
		}
	}
	public void reset()
	{	//Sets current to first node in list
		current = head;
		previous = null;
	}
	public void gotoEnd()
	{
		reset();
		while (current.nextLink != null)
		{	
			//Moves node forward as long as it it within the list
			previous = current;
			current = current.nextLink;
		}
	}
	public boolean hasMore()
	{
		return current != null;
	}
	public double getCurrent()
	{
		if (current == null)
		{
			return 0;
		}
		return current.data;
	}
	public void setCurrent(double aData)
	{
		if (current != null)
		{
			current.data = aData;
		}
	}
	public void add(double aData)
	{
		ListNode newNode = new ListNode(aData, null, null);
		if (head == null)
		{
			head = current = newNode;
			return;
		}
		ListNode temp = head;
		while (temp.nextLink != null)
		{
			temp = temp.nextLink;
		}
		temp.nextLink = newNode;
	}
	public void addAfterCurrent(double aData)
	{
		if (current != null)
		{
			ListNode newNode = new ListNode(aData, current.nextLink, current);
			current.nextLink.prevLink = newNode;
			current.nextLink = newNode;
		}
	}
	public void remove(double aData)
	{
		ListNode temp = head;
		while (temp != null)
		{
			if (aData == temp.data)
			{	
				if (temp != null && temp.prevLink != null)
				{
					previous.nextLink = current.nextLink;
					current = current.nextLink;
				}
				else if (temp != null && temp.prevLink == null)
				{
					head = head.nextLink;
					current = head;
				}
			}
			temp = temp.nextLink;
		}
	}
	public void removeCurrent()
	{
		if (current != null && previous != null)
		{
			//Removes all references to the node in memory
			previous.nextLink = current.nextLink;
			current = current.nextLink;
	 	}
		else if (current != null && previous == null)
		{
			//Removes reference to the head in memory
			head = head.nextLink;
			current = head;
		}
	}
	public void print()
	{
		ListNode temp = head;
		while (temp != null)
		{	//Prints all existing node data
			System.out.println(temp.data);
			temp = temp.nextLink;
		}
	}
	public boolean contains(double aData)
	{
		boolean contains = false;
		ListNode temp = head;
		while (temp != null)
		{
			if (aData == temp.data)
			{	//Checks if specified data is stored in the list
				contains = true;
				break;
			}
			temp = temp.nextLink;
		}	
		return contains;
	}
}
