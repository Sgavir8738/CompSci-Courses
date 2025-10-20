import java.util.Scanner;
public class VectorMathFE {
	// Sebastian Gaviria
	
	public static Scanner key = new Scanner(System.in);
	public static int size;
	public static Vector v1;
	public static Vector v2;
	private static VectorMath vectorMath;
	public static void main(String[] args) {
		
		printGreeting();
		boolean isRunning = true;
		while (isRunning)
		{
			System.out.println("\nEnter 1. Add 2 vectors\n" +
					"Enter 2. Subtract 2 vectors\n" +
					"Enter 3. Find vector magnitude\n" +
					"Enter 0. Exit");
			int choice = key.nextInt();
			key.nextLine();
			switch (choice)
			{
			case 1:
				System.out.println("\nEnter vector size");
				size = key.nextInt();
				key.nextLine();
				if (size <= 0)
				{	// Check valid vector size
					System.out.println("\nInvalid vector size.");
					break;
				}
				createVectors(size);	
				addVectors();
				break;
			case 2:
				System.out.println("\nEnter vector size");
				size = key.nextInt();
				key.nextLine();
				if (size <= 0)
				{
					System.out.println("\nInvalid vector size.");
					break;
				}
				createVectors(size);	
				subtractVectors();
				break;
			case 3:
				System.out.println("\nEnter vector size");
				size = key.nextInt();
				key.nextLine();
				if (size <= 0)
				{
					System.out.println("\nInvalid vector size.");
					break;
				}
				createVectorMagnify(size);	
				magnifyVector();
				break;
			case 0:
				isRunning = false;
				break;
			}
		}
	}
	
	public static void printGreeting()
	{
		System.out.println("Welcome to the Vector Operations Program");
	}
	public static void createVectors(int size)
	{	// Initialize vectors according to size input by user
		vectorMath = new VectorMath(size);
		System.out.println("\nEnter values for the first vector");
		v1 = new Vector(size, vectorMath.createVector());
		System.out.println("\nEnter values for the second vector");
		v2 = new Vector(size, vectorMath.createVector());
	}
	public static void createVectorMagnify(int size)
	{
		vectorMath = new VectorMath(size);
		System.out.println("\nEnter values for the vector");
		v1 = new Vector(size, vectorMath.createVector());
	}
	public static void addVectors()
	{	// Computes operation and prints result to console
		System.out.println("\nVector 1: \n"
				+ v1.toString());
		System.out.println("Vector 2: \n"
				+ v2.toString());
		System.out.println("Result: \n"
				+ vectorMath.addVectors(v1.getNums(), v2.getNums()));
	}
	public static void subtractVectors()
	{
		System.out.println("\nVector 1: \n"
				+ v1.toString());
		System.out.println("Vector 2: \n"
				+ v2.toString());
		System.out.println("Result: \n"
				+ vectorMath.subtractVectors(v1.getNums(), v2.getNums()));
	}
	public static void magnifyVector()
	{
		System.out.println("\nVector: \n"
				+ v1.toString());
		System.out.println("Result: \n"
				+ vectorMath.magnifyVector(v1.getNums()));
	}

}
