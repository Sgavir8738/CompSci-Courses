import java.util.Scanner;
public class MazeGameFE {

	public static Scanner key = new Scanner(System.in);
	public static MazeGame game = new MazeGame();
	public static final String GIVE_UP = "Give Up";
	public static void main(String[] args) {
		
		boolean isPlaying = true;
		while (isPlaying)
		{
			System.out.println("Welcome to the Maze in the Dark");
			game.reset();
			boolean gameOver = false;
			while (!gameOver)
			{
				game.printMoveOptions();
				System.out.println(GIVE_UP);
				String input = key.nextLine();
				if (input.equalsIgnoreCase(GIVE_UP))
				{
					gameOver = true;
					game.printFullMaze();
				}
				else
				{
					game.move(input);
				}
				if (game.getWin())
				{
					System.out.println("You're winner");
					game.printFullMazeWithPath();
					gameOver = true;
				}
			}
			System.out.println("Play again? (y/n)");
			isPlaying = key.nextLine().equalsIgnoreCase("y");
		}
	}

}
