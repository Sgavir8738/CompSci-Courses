import java.util.Scanner;
import java.util.InputMismatchException;
public class Homework04 {

	public static void main(String[] args) {
		// Sebastian Gaviria

		// create a Scanner object
		Scanner key = new Scanner(System.in);
		
		// initialize the size variable
		int size = 0;
		
		System.out.print("How many circles will be stored in the array? ");
		
		//input validation
		while (true)
		{
			try 
			{
				size = key.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input. Exiting program");
				System.exit(0);
			}

			if (size > 0)
			{
				break;
			}
		}
		
		
		
		// initialize the array
		double circleAreas[] = new double[size];
		
		
		
		for (int i = 0; i < circleAreas.length; i ++)
		{
			System.out.print("Enter the radius of circle " + (i + 1) + ". ");
			double radius = key.nextDouble();
			circleAreas[i] = Math.pow(radius, 2) * 3.14;
			System.out.println("Area: " + circleAreas[i]);
			System.out.println();
		}
		
		// selection sort
		for (int i = 0; i < circleAreas.length; i ++)
		{
			int minIndex = i;
			double smallest = circleAreas[i];
			
			for (int j = i + 1; j < circleAreas.length; j ++)
			{
				if (circleAreas[j] < smallest)
				{
					smallest = circleAreas[j];
					minIndex = j;
				}
			}
			
			if (smallest < circleAreas[i])
			{
				double temp = circleAreas[i];
				circleAreas[i] = circleAreas[minIndex];
				circleAreas[minIndex] = temp;
			}
		}
		
		System.out.print("Area of the circles from smallest to largest: ");
		
		for (int i = 0; i < circleAreas.length; i ++)
		{	 
			if (i > 0)
			{
				// check for duplicate values
				if (circleAreas[i - 1] != circleAreas[i])
				{
					System.out.print(circleAreas[i] + ", ");
				}
				
			}
			else
			{
				System.out.print(circleAreas[i] + ", ");
			}
		}
		
		System.out.println();
		System.out.print("Area of the circles from largest to smallest: ");
		
		for (int i = size; i > 0; i --)
		{	 
			if (i < size)
			{
				// check for duplicate values
				if (circleAreas[i - 1] != circleAreas[i])
				{
					System.out.print(circleAreas[i - 1] + ", ");
				}
				
			}
			else
			{
				System.out.print(circleAreas[i - 1] + ", ");
			}
		}
	}

}
