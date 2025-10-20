import java.io.*;
import java.util.Scanner;

public class VideoGameDatabase {
	//Sebastian Gaviria
	
	private static Scanner key = new Scanner(System.in);
	public static String console;
	public static String title;
	public static final String DELIM = "\t";
	public static final int FIELD_AMT = 2;
	
	public void readDatabase(String inputFile)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(inputFile));
			while (fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if (splitLines.length == FIELD_AMT)
				{
					title = splitLines[0];
					console = splitLines[1];
					Game g = new Game(title, console);
					VideoGameDatabaseFE.gamesList.add(g);	
				}
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void searchConsole()
	{	//Searches game list for console name input by user
		console = key.nextLine();
		VideoGameDatabaseFE.gamesList.searchConsole(console);
	}
	public void searchGame()
	{
		title = key.nextLine();
		VideoGameDatabaseFE.consoleList.searchGame(title);
	}
	public void addConsole()
	{	
		Game g = new Game(title, console);
		VideoGameDatabaseFE.consoleList.add(g);
	}
	public void addResults()
	{	
		Game g = new Game(title, console);
		VideoGameDatabaseFE.searchList.add(g);
	}
	public void printResults()
	{
		VideoGameDatabaseFE.searchList.print();
	}
	public void writeFile(String fileName, String choice)
	{
		boolean append = false;
		if (choice.equals("y"))
		{
			append = true;
		}
		else if (choice.equals("n"))
		{
			append = false;
		}
		VideoGameDatabaseFE.searchList.writeFile(fileName, append);
	}
}
