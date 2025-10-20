import java.io.*;
public class TaskLL <T> {
	//Sebastian Gaviria
	
	private class ListNode
	{
		T data;
		ListNode link;
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}	
	}
	private ListNode head;
	private ListNode current;
	private ListNode previous;
	public TaskLL()
	{
		head = current = previous = null;
	}
	public void add(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if (head == null)
		{
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
	public void print()
	{
		ListNode temp = head;
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public void write(String fileName)
	{
		try
		{
			FileWriter fileWriter = new FileWriter((fileName), true);
			ListNode temp = head;
			while (temp != null)
			{
				fileWriter.write(temp.data + "\n");
				temp = temp.link;
			}
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void addAfterCurrent(T aData)
	{
		if (current == null)
		{
			return;
		}
		ListNode newNode = new ListNode(aData, current.link);
		current.link = newNode;
	}
	public T getCurrent()
	{
		if (current == null)
		{
			return null;
		}
		return current.data;
	}
	public void setCurrent(T aData)
	{
		if (aData == null || current == null)
		{
			return;
		}
		current.data = aData;
	}
	public void goToNext()
	{
		if (current == null)
		{
			return;
		}
		previous = current;
		current = current.link;
	}
	public void reset()
	{
		current = head;
		previous = null;
	}
	public boolean hasMore()
	{
		return current != null;
	}
	public void removeCurrent()
	{
		if (current == head)
		{
			head = head.link;
		}
		else
		{
			previous.link = current.link;
			current = current.link;
		}
	}
	public boolean contains(T aData)
	{
		ListNode temp = head;
		while (temp != null)
		{
			if (temp.data.equals(aData))
			{
				return true;
			}
			temp = temp.link;
		}
		return false;
	}
}

