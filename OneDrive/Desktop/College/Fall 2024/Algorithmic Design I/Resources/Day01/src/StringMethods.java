import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		
		String sentence = key.nextLine();
		
		int lettercount = sentence.length();
		
		System.out.println("Length of the sentence entered by the user is: " + lettercount);
		
		int ind = sentence.indexOf('c');
		
		System.out.println("Index of the letter \"c\" is: " + ind);
		
		String sub1 = sentence.substring(0, 4);
		
		System.out.println("Substring 1: " + sub1);
		
		String sub2 = sentence.substring(5, 7);
		
		System.out.println("Substring 2: " + sub2);
		
		//prints substring from index 12 until the end of the sentence
		String sub3 = sentence.substring(14);
		
		System.out.println("Substring 3: " + sub3);
		
		char ch = sentence.charAt(14);
		
		System.out.println("Character at index 14 is: " + ch);
		
		System.out.print("Enter the number of days in a week: ");
		
		int daysCount = key.nextInt();
		
		System.out.println("There are " + daysCount + " days in a week");
		
		System.out.print("Do you like ice cream? (True/False) ");
		
		boolean response = key.nextBoolean();
		
		System.out.println(response);
		
		
	}

}
