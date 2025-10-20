import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Apple a1 = new Apple();
		
		System.out.println("First apple: \n" + a1.WriteOutput());
		
		System.out.println();
		
		System.out.print("What is the type of apple? ");
		
		String type = key.nextLine();
		
		System.out.print("What is the weight of the apple? ");
		
		double weight = key.nextDouble();
		
		System.out.print("What is the price of the apple? ");
		
		double price = key.nextDouble();
		
		System.out.println();
		
		Apple a2 = new Apple(type, weight, price);
		
		System.out.println("Second apple: \n" + a2.WriteOutput());
	}

}
