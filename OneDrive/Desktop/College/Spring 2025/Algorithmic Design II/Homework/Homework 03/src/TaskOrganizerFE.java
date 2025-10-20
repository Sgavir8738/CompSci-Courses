import java.util.Scanner;
public class TaskOrganizerFE {
	//Sebastian Gaviria
	
	private static Scanner key = new Scanner(System.in);
	private static TaskOrganizer taskOrganizer = new TaskOrganizer();
	
	public static void main(String[] args) {
		
		printGreeting();
		boolean quit = false;
		while (!quit)
		{
			printChoices();
			int choice = key.nextInt();
			key.nextLine();
			switch (choice)
			{
			case 1:
				addTask();
				break;
			case 2:
				removeTask();
				break;
			case 3:
				taskOrganizer.printTasks();
				break;
			case 4:
				readTaskFile();
				break;
			case 5:
				writeTaskFile();
				break;
			case 0:
				quit = true;
				break;
			default:
				System.out.println("Invalid input.");
			}
			
		}
	}
	
	public static void printGreeting()
	{
		System.out.println("Welcome to the Task Organizer");
	}
	public static void printChoices()
	{
		System.out.println("\nEnter 1 to add a task\n"
				+ "Enter 2 to remove a task\n"
				+ "Enter 3 to print tasks to console\n"
				+ "Enter 4 to read from a task file\n"
				+ "Enter 5 to write to a task file\n"
				+ "Enter 0 to quit");
	}
	public static void addTask()
	{
		System.out.println("Enter the task's priority");
		int priority = key.nextInt();
		System.out.println("Enter the task's action");
		//Buffer to circumvent skipped code
		key.nextLine();
		String task = key.nextLine();
		taskOrganizer.addTask(new Task(priority, task));
	}
	
	public static void removeTask()
	{
		System.out.println("Enter the task's priority");
		int priority = key.nextInt();
		System.out.println("Enter the task's action");
		key.nextLine();
		String task = key.nextLine();
		taskOrganizer.removeTask(new Task(priority, task));
	}
	
	public static void readTaskFile()
	{
		System.out.println("Enter the file name");
		String fileName = key.nextLine();
		taskOrganizer.readTaskFile(fileName);
	}
	
	public static void writeTaskFile()
	{
		System.out.println("Enter the file name");
		String fileName = key.nextLine();
		taskOrganizer.writeTaskFile(fileName);
	}
}
