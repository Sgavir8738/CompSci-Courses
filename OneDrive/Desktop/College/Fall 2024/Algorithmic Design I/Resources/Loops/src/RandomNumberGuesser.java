import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuesser {

	public static final int MAX = 100;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Random r = new Random();
		
		// generate a value between 0 and 99
		int secretNumber = r.nextInt(MAX);
		
		System.out.println("I will pick a random number between 0 and 99. Can you guess it?");
		
		boolean correctGuess = false;
		
		while (correctGuess == false)
		{
			System.out.print("Enter you guess: ");
			
			int guess = key.nextInt();
			
			//input validation
			
			if (guess > 99 || guess < 0)
			{
				System.out.println("Invalid input. Exiting program.");
				System.exit(0);
			}
			
			if (guess == secretNumber)
			{
				System.out.println("Your guess is correct!");
				correctGuess = true;
			}
			else if (guess < secretNumber)
			{
				System.out.println("Your guess is too low! Pick a larger value.");
			}
			else if (guess > secretNumber)
			{
				System.out.println("Your guess is too high! Pick a smaller value.");
			}
		}
		

	}

}
