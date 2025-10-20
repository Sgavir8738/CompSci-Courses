import java.util.Scanner;

public class WhatsForLunch {

	public static void main(String[] args) {
		
		// single line comment
		
		/*
		 * Multi-line
		 * comment
		 */
		
		//print a message on the console
		System.out.println("Welcome to my first Java Program!!!");
		
		/*
		 * Escape Characters
		 * 		\n - new line
		 * 		\" - double quote
		 */
		
		System.out.print("\"JAVA\" is fun!\n");
		
		
		//create a Scanner object
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("What's for lunch today? Enter entree:");
		
		String entree;		//declare new variable
		
		entree = key.nextLine();
		
		// + concatenation(join) operator
		// = assignment operator
		
		System.out.println("Enter side and drink:");
		
		String side = key.next();
		key.nextLine();			//reads the remainder of the current line
		
		String drink = key.nextLine();
		
		System.out.println("Enter entree: " + entree);
		
		System.out.println("Side: " + side);
		
		System.out.println("Drink: " + drink);
		
		// .next reads one word
		// .nextLine reads one line
	}

}

