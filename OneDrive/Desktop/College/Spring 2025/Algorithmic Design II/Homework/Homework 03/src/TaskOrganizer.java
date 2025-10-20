import java.util.Scanner;
import java.io.*;

public class TaskOrganizer {

	private static Scanner key = new Scanner(System.in);
	private TaskLL<Task>[] tasks;
	public static final String DELIM = "\t";
	public static final int FIELD_AMT = 2;
	
	public TaskOrganizer()
	{	//Initialize priority lists
		tasks = new TaskLL[5];
		for (int i = 0; i < tasks.length; i++)
		{
			tasks[i] = new TaskLL<Task>();
		}
	}
	public void addTask(Task aTask)
	{
		for (int i = 0; i < tasks.length; i++)
		{
			if (aTask.getPriority() == i)
			{	//Add tasks sorted by priority
				if (tasks[i].contains(aTask))
				{
					System.out.println("Duplicate task not added");
				}
				else
				{
					tasks[i].add(aTask);
				}
				return;
			}
		}
	}
	public void removeTask(Task aTask)
	{
		for (int i = 0; i < tasks.length; i++)
		{
			if (aTask.getPriority() == i)
			{
				tasks[i].reset();
				while (tasks[i].hasMore())
				{
					if (tasks[i].getCurrent().equals(aTask))
					{	//Remove task if found in list
						tasks[i].removeCurrent();
					}
					tasks[i].goToNext();
				}
			}
		}
	}
	public void readTaskFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if (splitLines.length == FIELD_AMT)
				{
					int priority = Integer.parseInt(splitLines[0]);
					String task = splitLines[1];
					Task t = new Task(priority, task);
					this.addTask(t);
				}
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeTaskFile(String fileName)
	{	
		for (int i = 0; i < tasks.length; i++)
		{	//Print each list to file
			tasks[i].write(fileName);
		}
	}
	public void printTasks()
	{
		for (int i = 0; i < tasks.length; i++)
		{
			tasks[i].print();
		}
	}
}
