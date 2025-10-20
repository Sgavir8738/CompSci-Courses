import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
		// Sebastian Gaviria
		
		// Creating a Scanner object
		Scanner key = new Scanner(System.in);
		
		// Asks the user to input information
		System.out.print("Enter your first name: ");
		
		// Records the user's input and stores it as data to be used later
		String first = key.nextLine();
				
		System.out.print("Enter your last name: ");
		
		String last = key.nextLine();
		
		//parses first and last name variabkes into full name
		String fullName = first + " " + last;

		
		System.out.print("Enter your age (in years): ");
		
		String age = key.nextLine();
		
		
		System.out.print("Enter your phone number (without dashes/parentheses/space): ");
		
		String number = key.nextLine();
		
		// Create substrings from the phone number entered by the user
		String broadRegion = number.substring(0, 3);
		
		String narrowArea = number.substring(3, 6);
		
		String specificPhone = number.substring(6);
		
		// Uses substrings and special characters to correctly format user inputted phone number
		String phoneNumber = "(" + broadRegion + ") " + narrowArea + "-" + specificPhone;
		
		
		System.out.print("Enter your major: ");
		
		String major = key.nextLine();
		
		
		System.out.print("Enter your year in college: ");
		
		String year = key.nextLine();
		
		
		System.out.print("Enter your favorite music genre: ");
		
		String genre = key.nextLine();
		
		
		System.out.print("Enter your favorite food: ");
		
		String food = key.nextLine();
		
		
		System.out.print("Enter your favorite season: ");
		
		String season = key.nextLine();
		
		
		System.out.print("Enter today's date (in mm/dd/yyyy format): ");
		
		String date = key.nextLine();

		String month = date.substring(0, 2);
		
		String day = date.substring(3, 5);
		
		String calendarYear = date.substring(6);
		
		String dateEurope = day + "." + month + "." + calendarYear;
		
		
		//print message using all user-entered parameters
		System.out.println("Your name is " + fullName + ", a " + age + " year old " + year + " majoring in " + 
				major + " who loves "
				+ "listening to " + genre +". Your \nfavorite season is " + season + ", you can't get enough of "
				+ food + " and can be reached at " + phoneNumber + ".");
		
		System.out.println("Last modified: " + dateEurope);
	}

}
