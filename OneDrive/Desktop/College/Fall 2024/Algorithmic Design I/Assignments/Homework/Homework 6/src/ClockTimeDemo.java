import java.util.Scanner;
import java.util.InputMismatchException;

public class ClockTimeDemo {

	public static void main(String[] args) {
		
		// Sebastian Gaviria
		
		String playAgain = "";
		
		do
		{	
			Scanner key = new Scanner(System.in);
			
			System.out.print("Enter the hours on the military clock: ");
			
			int hours = key.nextInt();
			
			System.out.print("Enter the minutes: ");
			
			int minutes = key.nextInt();
			
			System.out.print("Enter the seconds: ");
			
			int seconds = key.nextInt();
			
			TimeConverter c1 = new TimeConverter(hours, minutes, seconds);
			
			try
			{
				System.out.println("12-hour clock time → " + c1.displayTime(c1.updateTime(hours, minutes, seconds)));
			}
			catch (TimeException e)
			{
				System.out.println(e.getMessage());
			}
	
			System.out.println();
			
			Scanner key2 = new Scanner(System.in);
			
			System.out.print("Enter 24-hour clock time in the format \"hours:minutes:seconds\": ");
			
			String timeTwentyFour = key2.nextLine();
			
			TimeConverter c2 = new TimeConverter();
			
			try
			{
				System.out.println("12-hour clock time → " + c2.displayTime(c2.updateTime(timeTwentyFour)));
			}
			catch (TimeException e)
			{
				System.out.println(e.getMessage());
			}
			catch (Exception e)
			{
				System.out.println("EXCEPTION: Invalid time entered");
			}
			
			System.out.print("Enter more times? (y/n) "); 
			
			playAgain = key2.next();
			
			System.out.println();
			
		} while (playAgain.equals("y"));
		
		System.out.println("Exiting the program.");
	}

}
