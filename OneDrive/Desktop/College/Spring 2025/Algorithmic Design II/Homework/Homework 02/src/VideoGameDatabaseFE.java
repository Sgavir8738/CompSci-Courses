import java.util.Scanner;
import java.io.*;
public class VideoGameDatabaseFE {
	//Sebastian Gaviria
	
	private static VideoGameDatabase videoGameDatabase = new VideoGameDatabase();
	public static GameLL<Object> gamesList;
	public static GameLL<Object> consoleList;
	public static GameLL<Object> searchList;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Video Game Database!");
		boolean isRunning = true;
		while (isRunning)
		{
			System.out.println("\nEnter 1 to load a database\n"
					+ "Enter 2 to search the database\n"
					+ "Enter 3 to print search results to the console\n"
					+ "Enter 4 to print search results to a file\n"
					+ "Enter 0 to quit");
			int choice = key.nextInt();
			switch (choice)
			{
				case 1: 
					readDatabase();
					break;
				case 2:
					searchDatabase();
					printResults();
					break;
				case 3:
					printResults();
					break;
				case 4:
					writeFile();
					break;
				case 0:
					isRunning = false;
					key.close();
					break;
			}
		}
	}
	
	public static void readDatabase()
	{
		Scanner key = new Scanner(System.in);
		gamesList = new GameLL<Object>();
		System.out.println("Enter the file name");
		String inputFile = key.nextLine();
		videoGameDatabase.readDatabase(inputFile);
	}
	public static void searchDatabase()
	{
		consoleList = new GameLL<Object>();
		searchList = new GameLL<Object>();
		System.out.println("Enter the name of the console or '*' for all");
		videoGameDatabase.searchConsole();
		System.out.println("Enter the name of the game or '*' for all");
		videoGameDatabase.searchGame();
	}
	public static void printResults()
	{
		videoGameDatabase.printResults();
	}
	public static void writeFile()
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName = key.nextLine();
		System.out.println("Would you like to append? (y/n)");
		String append = key.next();
		videoGameDatabase.writeFile(fileName, append);
	}
}
