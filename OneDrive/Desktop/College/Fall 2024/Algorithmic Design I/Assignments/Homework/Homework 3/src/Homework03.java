import java.util.Scanner;
import java.util.Random;

public class Homework03 {
	
	public static final int MAX = 3;

	public static void main(String[] args) {
		// Sebastian Gaviria
		
		//declares empty variable to use for do-while loop later
		String replay;
		
		// create a Scanner object
		Scanner key = new Scanner(System.in);
		
		//create a Random object
		Random r = new Random();
		do {
				System.out.println("Let's play rock, paper, scissors! Best 2 out of 3 wins!");
				
				int round = 1;
				int playerScore = 0;
				int computerScore = 0;
				
				for (int i = round; i <= 3; i ++)
				{
					System.out.println("\nRound " + i);
					
					System.out.print("Rock, paper, or scissors? ");
					
					// loops for invalid inputs
					while (true)
					{
						String playerMove = key.next().toLowerCase();
					
						int computerRandom = r.nextInt(MAX);
						
						// 0 corresponds to rock, 1 to paper, and 2 to scissors
						if (computerRandom == 0)
						{	
							String computerMove = "Rock";
							
							if (playerMove.equals("rock"))
							{
								System.out.println("Rock vs " + computerMove + " = Draw");
								break;
							}
							else if (playerMove.equals("paper"))
							{
								System.out.println("Paper vs " + computerMove + " = Paper wins");
								playerScore ++;
								break;
							}
							else if (playerMove.equals("scissors"))
							{
								System.out.println("Scissors vs " + computerMove + " = Rock wins");
								computerScore ++;
								break;
							}
						
						}
						if (computerRandom == 1)
						{	
							String computerMove = "Paper";
							
							if (playerMove.equals("paper"))
							{
								System.out.println("Paper vs " + computerMove + " = Draw");
								break;
							}
							else if (playerMove.equals("rock"))
							{
								System.out.println("Rock vs " + computerMove + " = Paper wins");
								computerScore ++;
								break;
							}
							else if (playerMove.equals("scissors"))
							{
								System.out.println("Scissors vs " + computerMove + " = Scissors wins");
								playerScore ++;
								break;
							}
						}
						if (computerRandom == 2)
						{	
							String computerMove = "Scissors";
							
							if (playerMove.equals("scissors"))
							{
								System.out.println("Scissors vs " + computerMove + " = Draw");
								break;
							}
							else if (playerMove.equals("paper"))
							{
								System.out.println("Paper vs " + computerMove + " = Scissors wins");
								computerScore ++;
								break;
							}
							else if (playerMove.equals("rock"))
							{
								System.out.println("Rock vs " + computerMove + " = Rock wins");
								playerScore ++;
								break;
							}
						}
						
					}
					
					System.out.println("\nYour Score = " + playerScore);
					System.out.println("Computer Score = " + computerScore);
					
				}
				
				if (playerScore > computerScore)
				{
					System.out.println("\nYou won!");
				}
				else if (computerScore > playerScore)
				{
					System.out.print("\nThe computer won!");
				}
				else
				{
					System.out.println("\nYou tied!");
				}
				
				System.out.print("\nPlay again? (y/n) ");
				while (true)
				{
					replay = key.next().toLowerCase();
					
					if (replay.equals("y") || replay.equals("n"))
					{
						break;
					}
				}
				
				System.out.println("");
				
		} while (replay.equals("y"));
		
		System.out.println("Thanks for playing!");
		System.exit(0);
	}

}
