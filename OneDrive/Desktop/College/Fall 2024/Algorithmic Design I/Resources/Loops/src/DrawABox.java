import java.util.Scanner;
public class DrawABox {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the height of the box: ");
		
		int height = key.nextInt();
		
		System.out.print("Enter the width of the box: ");
		
		int width = key.nextInt();
		
		for (int i = 0; i < height; i ++)
		{
			for (int j = 0; j < width; j ++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
