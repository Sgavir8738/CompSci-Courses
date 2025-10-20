import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {

		// Sebastian Gaviria

		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);
		
		String playAgain = "";
		do
		{	
			System.out.print("Enter the name of the ship: ");
			String name = key.nextLine();
			
			System.out.print("Enter its launch date (mm/dd/yyyy): ");
			String date = key.nextLine();
			
			System.out.print("Is it a cruise ship or a cargo ship? ");
			String ship = key.nextLine().toLowerCase();
			
			if (ship.contains("cruise"))
			{
				CruiseShip cr1 = new CruiseShip();
				
				cr1.setName(name);
				
				System.out.print("Enter the ship's passenger capacity: ");
				cr1.setCapacity(key.nextInt());
				
				System.out.print("Enter the number of crew member: ");
				cr1.setCrew(key.nextInt());
				
				try
				{
					cr1.setDate(date);
				}
				catch (Exception e)
				{
					System.out.println("EXCEPTION: Invalid date.");
				}
				
				System.out.println();
				cr1.writeOutput();
			}
			else if (ship.contains("cargo"))
			{
				CargoShip ca1 = new CargoShip();
				
				ca1.setName(name);
				
				System.out.print("Enter the ship's tonnage (DWT): ");
				ca1.setTonnage(key.nextInt());
				
				System.out.print("Enter the ship's maximum speed (in mph): ");
				ca1.setSpeed(key.nextInt());
				
				try
				{
					ca1.setDate(date);
				}
				catch (Exception e)
				{
					System.out.println("EXCEPTION: Invalid date.");
				}
				
				System.out.println();
				ca1.writeOutput();
			}
			else
			{
				System.out.println("Invalid ship.");
			}
			
			System.out.println();
			System.out.print("Create more ships? (y/n) ");
			playAgain = key2.nextLine().toLowerCase();
			
		} while (playAgain.contains("y"));
	}

}
