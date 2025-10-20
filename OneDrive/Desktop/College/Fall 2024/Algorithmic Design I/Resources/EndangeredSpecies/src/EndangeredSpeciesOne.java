import java.util.Scanner;
public class EndangeredSpeciesOne {

		public String name;
		public int population;
		public double growthRate;
		
		// method - prompts user for input
		public void readInput()
		{
			Scanner key = new Scanner(System.in);
			
			System.out.print("Enter the name of the species: ");
			
			name = key.nextLine();
			
			System.out.print("Enter the population of the species: ");
			
			population = key.nextInt();
			
			System.out.print("Enter the growth rate of the species: ");
			
			growthRate = key.nextDouble();
		}
		
		// method definition
		public void writeOutput()
		{
			System.out.println("Species: " + name);
			System.out.println("Population: " + population);
			System.out.println("Growth Rate: " + growthRate + "%");
		}
		
		// method with a return type - int
		// computes the population growth in 10 years
		public int getPopulationIn10()
		{
			int count = 10;
			
			double populationAmount = population;
			
			int result = 0; 
			
			while (count > 0 && populationAmount > 0)
			{
				populationAmount += populationAmount * (growthRate / 100);
				
				count --;
			}
				
			if (populationAmount > 0)
			{
				result = (int) populationAmount;
			}
			
			return result;
			
		}
}


