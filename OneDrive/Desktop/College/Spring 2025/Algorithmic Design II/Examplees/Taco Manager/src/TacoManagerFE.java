import java.util.Scanner;
public class TacoManagerFE {

	private static Scanner key = new Scanner(System.in);
	private static TacoManager tacoManager = new TacoManager();
	
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
				addTaco();
				break;
			case 2:
				removeTaco();
				break;
			case 3:
				readTacoFile();
				break;
			case 4:
				writeTacoFile();
				break;
			case 0:
				quit = true;
				break;
			default:
				System.out.println("Invalid input.");
			}
			
			tacoManager.printTacos();
		}
	}

	public static void printGreeting()
	{
		System.out.println("Welcome to the Taco Manager");
	}
	
	public static void printChoices()
	{
		System.out.println("Enter 1 to add a taco\n"
				+ "Enter 2 to remove a taco\n"
				+ "Enter 3 to read a taco database file\n"
				+ "Enter 4 to write to a databse file\n"
				+ "Enter 0 to quit");
	}
	
	public static void addTaco()
	{
		System.out.println("Enter the name of the taco");
		String name = key.nextLine();
		System.out.println("Enter the location of the taco");
		String location = key.nextLine();
		System.out.println("Enter the price of the taco");
		double price = key.nextDouble();
		tacoManager.addTaco(new Taco(name, location, price));
	}
	
	public static void removeTaco()
	{
		System.out.println("Enter the name of the taco to remove");
		String name = key.nextLine();
		tacoManager.removeTaco(name);
	}
	
	public static void readTacoFile()
	{
		System.out.println("Enter the file name to read a TacoDB");
		String fileName = key.nextLine();
		tacoManager.readTacoFile(fileName);
	}
	
	public static void writeTacoFile()
	{
		System.out.println("Enter the file name to write a TacoDB file");
		String fileName = key.nextLine();
		tacoManager.writeTacoFile(fileName);
	}
}
