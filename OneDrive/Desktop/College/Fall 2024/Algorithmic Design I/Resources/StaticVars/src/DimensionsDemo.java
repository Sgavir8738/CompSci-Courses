import java.util.Scanner;
public class DimensionsDemo {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter a value in feet: ");
		
		double feet = key.nextDouble();
		
		System.out.println(feet + " feet = " + DimensionConverter.FeetToInches(feet) + " inches");
		
		System.out.print("Enter a value in inches: ");
		
		double inches = key.nextDouble();
		
		System.out.println(inches + " inches = " + DimensionConverter.InchesToFeet(inches) + " feet");

	}

}
