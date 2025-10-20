import java.util.Scanner;

public class OutdoorExcercise {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the temperature outside (in Fahrenheit): ");
		
		int temperature = key.nextInt();
		
		if (temperature < -144 || temperature > 134)
		{
			System.out.print("Invalid tempeature entered. Closing the program.");
			System.exit(0);
		}
		else if (temperature >= 40 && temperature < 71)
		{
			System.out.println("It's too cold!");
		}
		else if (temperature >= 71 && temperature < 77)
		{
			System.out.println("It's the perfect temperature for some excercise!");
		}
		else if (temperature >= 98 && temperature < 111)
		{
			System.out.println("It's too hot!");
		}
		else
		{
			System.out.println("Inoptimal temperature for excercise");
		}
	}

}
