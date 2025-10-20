import java.util.Scanner; 
public class Lab03 {
	public static int quantity = 0;
	public static double discount = 0;
	public static final int RETAIL = 99;
	public static void main(String[] args) {

		// Sebastian Gaviria
		
		// Create scanner object to write user memory to memory
		Scanner key = new Scanner(System.in);
		
		
		// Asks the user for number of packages bought
		System.out.print("How many packages are you looking to buy today? ");

		// Input validation for quantity of packages bought
		try {
			quantity = key.nextInt();
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.print("Invalid input. Exiting program.");
			System.exit(0);
		}
		
		if (quantity < 0)
		{
			System.out.print("Invalid input. Exiting program.");
			System.exit(0);
		}
		
		
		// Determine discount amount, if any		
		if (quantity >= 10 && quantity <= 19)
		{
			discount = 0.20;
		}
		else if (quantity >= 20 && quantity <= 49)
		{
			discount = 0.30;
		}
		else if (quantity >= 50 && quantity <= 99)
		{
			discount = 0.40;
		}
		
		else if (quantity >= 100)
		{
			discount = 0.50;
		}
		else
		{
			discount = 0;
		}
		
		
		// Compute discount amount, retail price, and discounted price of packages
		double retailPrice = quantity * RETAIL;
		double totalDiscount = retailPrice * discount;
		double finalPrice = retailPrice - totalDiscount;
		
		System.out.println("Total retail price: $" + retailPrice);
		System.out.println("Total discounted: $" + totalDiscount);
		System.out.println("Total price after discount: $" + finalPrice);
	}

}
