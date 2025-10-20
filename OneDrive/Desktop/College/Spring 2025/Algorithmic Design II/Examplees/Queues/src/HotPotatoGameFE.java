import java.util.Scanner;
public class HotPotatoGameFE {

	public static Scanner key = new Scanner(System.in);
	public static HotPotatoGame hotPotatoGame = new HotPotatoGame();
	public static final int MIN_TIME = 1;
	public static final int MAX_TIME = 10;
	public static void main(String[] args) {
		
		greeting();
		boolean isPlaying = true;
		while (isPlaying)
		{
			hotPotatoGame.resetTime();
			int numPlayers = getNumberOfPlayers();
			addPlayers(numPlayers);
			
			boolean gameOver = false;
			while (!gameOver)
			{
				String player = hotPotatoGame.getCurrentPlayer();
				System.out.println(player + ": how long will you hold the potato? (" + MIN_TIME + " to " + MAX_TIME + " seconds)");
				int time = key.nextInt();
				key.nextLine();
				if (time < MIN_TIME || time > MAX_TIME)
				{
					System.out.println("Invalid value. Assuming time is " + MAX_TIME + " seconds");
					time = MAX_TIME;
				}
				if (hotPotatoGame.hasLost(time))
				{
					System.out.println(player + " has been eliminated");
					hotPotatoGame.resetTime();
				}
				else
				{
					hotPotatoGame.addPlayer(player);
				}
				gameOver = hotPotatoGame.getTwin();
			}
			System.out.println(hotPotatoGame.getCurrentPlayer() + " has won the game");
			System.out.println("Play again? (y/n)");
			String input = key.next();
			key.nextLine();
			if (input.equals("y"))
			{
				isPlaying = true;
			}
			else
			{
				isPlaying = false;
			}
		}
	}

	public static void greeting()
	{
		System.out.println("Welcome to the Hot Potato Game");
	}
	public static int getNumberOfPlayers()
	{
		int num = 0;
		System.out.println("Enter the number of players (> 1): ");
		while (num <= 1)
		{
			num = key.nextInt();
			key.nextLine();
		}
		return num;
	}
	public static void addPlayers(int num)
	{
		int i = 0;
		while (i < num)
		{
			System.out.println("Enter player " + i + "'s name");
			String name = key.nextLine();
			if (name == null || name.isEmpty())
			{
				System.out.println("Invalid input");
				continue;
			}
			else
			{
				hotPotatoGame.addPlayer(name);
			}
			i++;
		}
	}
}
