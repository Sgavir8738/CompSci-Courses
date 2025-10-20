
public class EndangeredSpeciesDemo {

	public static void main(String[] args) {
		
		EndangeredSpeciesOne sp1 = new EndangeredSpeciesOne();
		
		// method call
		sp1.readInput();
		
		sp1.writeOutput();
		
		int output = sp1.getPopulationIn10();
		
		System.out.println("The population of " + sp1.name + "s in the next 10 years is " + output + ".");
		
		EndangeredSpeciesOne sp2 = new EndangeredSpeciesOne();
		sp2.name = "Eagle";
		
		sp2.population = 1000;
		
		sp2.growthRate = 5;
		
		sp2.writeOutput();
		
		int output2 = sp2.getPopulationIn10();
		
		System.out.println("The population of " + sp1.name + "s in the next 10 years is " + output2 + ".");
	}

}
