import java.util.Scanner;
public class CoffeeTester {
	
	public static void main(String[] args) {
		
		while (true)
		{
			Scanner key = new Scanner(System.in);
			
			System.out.print("What's the name of your first coffee? ");
			
			String c1Name = key.nextLine();
			
			System.out.print("How much caffeine? ");
			
			double c1Caffeine;
			
			while (true)
				{
					c1Caffeine = key.nextDouble();
					
					if (c1Caffeine >= 50 && c1Caffeine <= 300)
					{
						break;
					}
					else
					{
						System.out.print("Invalid amount. ");
					}
				}
			
			Coffee c1 = new Coffee(c1Name, c1Caffeine);
			System.out.println();
			
			System.out.println(c1.toString());
			System.out.println("It is only safe to drink " + c1.RiskyAmount(c1Caffeine) + " cups of " + c1.name);
			System.out.println();
			
			Scanner key2 = new Scanner(System.in)
					;
			System.out.print("What's the name of your second coffee? ");
			
			String c2Name = key2.nextLine();
			
			System.out.print("How much caffeine? ");
			
			double c2Caffeine;
			
			while (true)
				{
					c2Caffeine = key2.nextDouble();
					
					if (c2Caffeine >= 50 && c2Caffeine <= 300)
					{
						break;
					}
					else
					{
						System.out.print("Invalid amount. ");
					}
				}
			
			Coffee c2 = new Coffee(c2Name, c2Caffeine);
			System.out.println();
			
			System.out.println(c2.toString());
			System.out.println("It is only safe to drink " + c2.RiskyAmount(c2Caffeine) + " cups of " + c2.name);
			System.out.println();
			
			System.out.println("Are both coffees the same? " + c1.equals(c2));
			
			System.out.println();
			System.out.print("Would you like more coffee? (y/n) ");
			
			String playAgain = key2.next();
			
			if (playAgain.equalsIgnoreCase("y"))
			{
				
			}
			else
			{
				break;
			}
		}	
	}
	
}
