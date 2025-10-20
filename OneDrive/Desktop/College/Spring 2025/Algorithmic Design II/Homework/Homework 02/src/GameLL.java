import java.io.*;

public class GameLL <T> {
	//Sebastian Gaviria
	
	private static VideoGameDatabase videoGameDatabase = new VideoGameDatabase();
	
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
	public GameLL()
	{
		head = null;
	}
	public void add(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if (head == null)
		{
			head = newNode;
			return;
		}
		ListNode temp = head;
		while (temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	public void searchConsole(String name)
	{
		ListNode temp = head;
		if (name.equals("*"))
		{
			while (temp != null)
			{	//Adds all games to results
				videoGameDatabase.title = ((Game) temp.data).getName();
				videoGameDatabase.console = ((Game) temp.data).getConsole();
				videoGameDatabase.addConsole();
				temp = temp.link;
			}
			return;
		}
		while (temp != null)
		{
			videoGameDatabase.title = ((Game) temp.data).getName();
			videoGameDatabase.console = ((Game) temp.data).getConsole();
			if (((Game) temp.data).getConsole().toUpperCase().contains(name.toUpperCase()))
			{	//Adds game to results if partial match is found
				videoGameDatabase.addConsole();
			}
			temp = temp.link;
		}
	}
	public void searchGame(String name)
	{
		ListNode temp = head;
		if (name.equals("*"))
		{
			while (temp != null)
			{
				videoGameDatabase.title = ((Game) temp.data).getName();
				videoGameDatabase.console = ((Game) temp.data).getConsole();
				videoGameDatabase.addResults();
				temp = temp.link;
			}
			return;
		}
		while (temp != null)
		{
			videoGameDatabase.title = ((Game) temp.data).getName();
			videoGameDatabase.console = ((Game) temp.data).getConsole();
			if (((Game) temp.data).getName().toUpperCase().contains(name.toUpperCase()))
			{
				videoGameDatabase.addResults();
			}
			temp = temp.link;
		}
	}
	public void print()
	{
		ListNode temp = head;
		while (temp != null)
		{
			System.out.println(((Game) temp.data).toString());
			temp = temp.link;
		}
	}
	public void writeFile(String fileName, boolean append)
	{
		try
		{	//Overwrites or appends file based on boolean selector
			FileWriter fileWriter = new FileWriter(fileName, append);
			ListNode temp = head;
			while (temp != null)
			{	//Writes search results to file
				fileWriter.write(((Game)temp.data).toString() + "\n");
				temp = temp.link;
			}
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
