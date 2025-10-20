import java.util.Scanner;
public class PrizeShowcaseFE {
	//Sebastian Gaviria
	
	private static Scanner key = new Scanner(System.in);
	private static PrizeShowcase prizeShowcase = new PrizeShowcase();
	public static void main(String[] args) {
		
		System.out.println("Welcome to the prize showcase game show!");
		boolean isPlaying = true;
		while (isPlaying)
		{
			readPrizeFile();
			printPrizes();
			guessCost();
			String playAgain = playAgain();
			if (playAgain.equalsIgnoreCase("y"))
			{
				isPlaying = true;
			}
			else if (playAgain.equalsIgnoreCase("n"))
			{
				isPlaying = false;
			}
		}
	}
	
	public static String playAgain()
	{
		System.out.println("Would you like to play again? (y/n)");
		return key.next();
	}
	
	public static void readPrizeFile()
	{
		prizeShowcase.readPrizeFile("prizeList.txt");
	}
	public static void printPrizes()
	{
		prizeShowcase.randomPrizes();
		prizeShowcase.printPrizes();
	}
	public static void guessCost()
	{
		double totalCost = prizeShowcase.totalCost();
		System.out.println("Try to guess the total cost of the prizes. Anything within $1300 below the total cost will be correct.");
		double guess = key.nextDouble();
		System.out.println("The actual was $" + totalCost);
		if (guess == totalCost || guess + 1300 >= totalCost && guess < totalCost)
		{	//User wins if guess is within $1300 below or equal to the total cost of the prizes
			System.out.println("You win!!");
		}
		else
		{
			System.out.println("You lose.");
		}
	}

}
