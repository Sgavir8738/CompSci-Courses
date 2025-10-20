import java.util.Scanner;
import java.util.InputMismatchException;
public class Lab06 {

	public static void main(String[] args) {
		// Sebastian Gaviria
		
		// create a Scanner object
		Scanner key = new Scanner(System.in);
		
		System.out.print("What would you like the height of your triangle to be? ");
		
		// initialize variable for height of the triangle
		int height = 0;
		
		// input validation
		while (true)
		{	
			try
			{
				height = key.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input. Exiting program.");
				System.exit(0);
			}
			
			if (height > 0)
			{
				break;
			}
		}
		
		
		// draw the triangle using the height provided by the user
		for (int i = 0; i <= height; i ++)
		{
			for (int j = 0; j < i; j ++)
			{
				System.out.print("*");
			}
			
			if (i < height)
			{
				System.out.println();
			}
		}
		
		System.out.println();
		
		for (int i = height - 1; i >= 0; i --)
		{
			for (int j = 0; j < i; j ++)
			{
				System.out.print("*");
			}
			
			if (i > 0)
			{
				System.out.println();
			}
		}

	}

}
