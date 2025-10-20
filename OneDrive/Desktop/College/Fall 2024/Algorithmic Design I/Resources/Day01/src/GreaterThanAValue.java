import java.util.Scanner;
public class GreaterThanAValue {
	public static final int VALUE = 500;
	public static void main(String[] args) {
		
		//package - a library of classes that have been pre-defined
		//eg; Scanner
		
		//creating a Scanner object
		Scanner key = new Scanner(System.in);
		
		//asks the user for an input value
		System.out.print("Enter an integer: ");
		
		int number = key.nextInt();
		
		if (number > VALUE)
		{
			//if-block
			System.out.println("The number " + number + " is greater than " + VALUE + "!");
		}
		else
		{
			//else-block
			System.out.println("The number " + number + " is not greater than " + VALUE);
		}
		
	

	}

}
