import java.util.Scanner;
public class Lab04 {

	public static int books = 0;
	
	public static void main(String[] args) {
		
		// Sebastian Gaviria
		
		// Creates a Scanner object
		Scanner key = new Scanner(System.in);
		
		
		System.out.print("How many books have you bought this month? ");
		
		// Input validation for number of books bought
		try {
			books = key.nextInt();
		}
		catch (java.util.InputMismatchException e)				{
			System.out.print("Invalid input. Exiting program.");
			System.exit(0);
		}
		
		if (books < 0)
		{
			System.out.print("Invalid input. Exiting program.");
			System.exit(0);
		}
		
		
		int points = 0;
		
		// Determine points awarded, if any
		switch (books)
		{
		case 0:
			points = 0;
			break;
		case 1:
			points = 5;
			break;
		case 2:
			points = 15;
			break;
		case 3:
			points = 30;
			break;
		default:
			points = 60;
			break;
		}

		
		if (points == 0)
		{
			System.out.println("You have not been awarded any points.\nBuy books this month to earn some.");
		}
		else
		{
			System.out.println("You have been awarded " + points + " points.");
		}
		
	}

}
