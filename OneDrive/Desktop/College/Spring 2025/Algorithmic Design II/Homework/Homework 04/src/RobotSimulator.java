import java.util.Scanner;
import java.io.*;
public class RobotSimulator {
	//Sebastian Gaviria
	
	QueueI<Command> commands;
	String[][] board;
	Command activeCommand;
	String robo = "O";
	
	public RobotSimulator()
	{
		commands = new LLQueue();
		board = new String[10][10];
	}
	public void addCommand(Command c)
	{
		if (activeCommand == null || 
				activeCommand.getName().equals(""))
		{
			activeCommand = c;
		}
		else
		{
			commands.enqueue(c);;
		}
	}
	public void readBoardFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			for (int i = 0; fileScanner.hasNextLine(); i++)
			{
				String fileLine = fileScanner.nextLine();
				for (int j = 0; j < 10; j++)
				{
					board[i][j] = fileLine.substring(j, j + 1);
				}
			}
			board[0][0] = robo;
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readCommandFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				Command c = new Command(fileLine);
				if (!c.getName().equals(""))
				{
					this.addCommand(c);
				}
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printBoard()
	{
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	public boolean runNextCommand()
	{
		if (findRobo() == null)
		{
			System.out.println("Robot could not be found");
			return false;
		}
		int i = findRobo()[0];
		int j = findRobo()[1];
		board[i][j] = "_";
		switch (activeCommand.getName())
		{
			case "Move Up":
				i--;
				break;
			case "Move Down":
				i++;
				break;
			case "Move Left":
				j--;
				break;
			case "Move Right":
				j++;
				break;
			default:
				break;
		}
		if (i < 0 || i > 99 || j < 0 || j > 99 ||
				board[i][j].equals("X"))
		{	//Checks if robot is out of bounds or has hit an obstacle
			return false;
		}
		board[i][j] = robo;
		activeCommand = commands.dequeue();
		return true;
	}
	public int[] findRobo()
	{
		int i;
		int j;
		for (i = 0; i < board.length; i++)
		{
			for (j = 0; j < board[i].length; j++)
			{
				if (board[i][j] == robo)
				{	//Return location of robot if found
					int[] roboLoc = {i, j};
					return roboLoc;
				}
			}
		}
		return null;
	}
}
