import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab05 {

	public static void main(String[] args) {
		// Sebastian Gaviria
		
		// create a Scanner object
		Scanner key = new Scanner(System.in);
		
		System.out.println("You come across a vending machine that dispenses chocolate bars!");
		System.out.print("How many dollars would you to to spend at the machine? ");
		
		// initializes variable for # of dollars spent
		int dollars = 0;
		
		// input validation
		while (true)
		{	
			try
			{
				dollars = key.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input. Exiting program.");
				System.exit(0);
			}
			
			if (dollars >= 0)
			{
				break;
			}
		}
		
		int chocolateBars = 0;
		int coupons = 0;
		
		// one chocolate bar costs $1
		for (int i = 0; i < dollars; i ++)
		{
			chocolateBars ++;
			coupons ++;
			
			// redeems an additional chocolate bar for 6 coupons 
			if (coupons >= 6)
			{
				coupons -= 5;
				chocolateBars ++;
			}
		}
		
		System.out.println("You bought " + chocolateBars + " chocolate bars and are left with " + coupons + " coupons.");
		
	}

}
