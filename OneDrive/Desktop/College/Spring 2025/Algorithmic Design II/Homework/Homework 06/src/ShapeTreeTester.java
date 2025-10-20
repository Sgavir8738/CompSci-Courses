import java.util.Scanner;
public class ShapeTreeTester {
	//Sebastian Gaviria
	
	public static ShapeTree shapeTree = new ShapeTree();
	public static Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Shape Tree");
		boolean isRunning = true;
		while (isRunning)
		{	
			printChoices();
			
			int choice = key.nextInt();
			key.nextLine();
			switch (choice)
			{
				case 1:
					readFile();
					break;
				case 2:
					printTree();
					break;
				case 3:
					addShape();
					break;
				case 4:
					removeShape();
					break;
				case 5:
					searchTree();
					break;
				case 6:
					printLargest();
					break;
				case 7:
					removeGreaterThan();
					break;
				case 8:
					writeFile();
					break;
				case 0:
					isRunning = false;
			}
		}
	}
	public static void printChoices()
	{
		System.out.println("\nEnter 1 to read a shape file" +
				"\nEnter 2 to traverse the shape tree" +
				"\nEnter 3 to add a shape" +
				"\nEnter 4 to remove a shape" +
				"\nEnter 5 to search for a shape" +
				"\nEnter 6 to find the largest shape" +
				"\nEnter 7 to remove shapes greater than a specified area" +
				"\nEnter 8 to print the shape tree to a file" +
				"\nEnter 0 to quit");
	}
	public static void readFile()
	{
		System.out.println("\nEnter the name of the file to read");
		shapeTree.readShapeFile(key.nextLine());
	}
	public static void printTree()
	{
		System.out.println("\nWhich traversel?");
		System.out.println("Enter 1 for pre-order" +
				"\nEnter 2 for in-order" +
				"\nEnter 3 for post-order");
		shapeTree.printShapeTree(key.nextInt());
	}
	public static void addShape()
	{
		System.out.print("\nType of shape to add? ");
		switch (key.nextLine().toUpperCase())
		{	//Initialize shape from user input and adds it to tree
			case "RIGHT TRIANGLE":
				System.out.print("\nEnter the base: ");
				double base = key.nextDouble();
				System.out.print("\nEnter the height: ");
				double height = key.nextDouble();
				ShapeTree.sBST.add(new Triangle(base, height));
				break;
			case "CIRCLE":
				System.out.print("\nEnter the radius: ");
				double radius = key.nextDouble();
				ShapeTree.sBST.add(new Circle(radius));
				break;
			case "RECTANGLE":
				System.out.print("\nEnter the length: ");
				double length = key.nextDouble();
				System.out.print("\nEnter the width: ");
				double width = key.nextDouble();
				ShapeTree.sBST.add(new Rectangle(length, width));
				break;
			default:
				System.out.println("Invalid shape");
		}
	}
	public static void removeShape()
	{
		System.out.print("\nType of shape to remove? ");
		switch (key.nextLine().toUpperCase())
		{	//Remove shape that matches user input from tree
			case "RIGHT TRIANGLE":
				System.out.print("\nEnter the base: ");
				double base = key.nextDouble();
				System.out.print("\nEnter the height: ");
				double height = key.nextDouble();
				ShapeTree.sBST.remove(new Triangle(base, height));
				break;
			case "CIRCLE":
				System.out.print("\nEnter the radius: ");
				double radius = key.nextDouble();
				ShapeTree.sBST.remove(new Circle(radius));
				break;
			case "RECTANGLE":
				System.out.print("\nEnter the length: ");
				double length = key.nextDouble();
				System.out.print("\nEnter the width: ");
				double width = key.nextDouble();
				ShapeTree.sBST.remove(new Rectangle(length, width));
				break;
			default:
				System.out.println("Invalid shape");
		}
	}
	public static void searchTree()
	{	//Method determines whether shape is found in tree
		boolean found = false;;
		System.out.print("\nType of shape to search? ");
		switch (key.nextLine().toUpperCase())
		{
			case "RIGHT TRIANGLE":
				System.out.print("\nEnter the base: ");
				double base = key.nextDouble();
				System.out.print("\nEnter the height: ");
				double height = key.nextDouble();
				found = ShapeTree.sBST.search(new Triangle(base, height));
				break;
			case "CIRCLE":
				System.out.print("\nEnter the radius: ");
				double radius = key.nextDouble();
				found = ShapeTree.sBST.search(new Circle(radius));
				break;
			case "RECTANGLE":
				System.out.print("\nEnter the length: ");
				double length = key.nextDouble();
				System.out.print("\nEnter the width: ");
				double width = key.nextDouble();
				found = ShapeTree.sBST.search(new Rectangle(length, width));
				break;
			default:
				System.out.println("Invalid shape");
				return;
		}
		if (found)
		{
			System.out.println("Shape was found in the tree");
		}
		else
		{
			System.out.println("Shape was not found in the tree");
		}
	}
	public static void printLargest()
	{	//Print shape with the largest area
		System.out.println("\nFinding the largest shape...");
		ShapeTree.sBST.printLargest();
	}
	public static void removeGreaterThan()
	{
		System.out.println("\nEnter the maximum area");
		ShapeTree.sBST.removeGreaterThan(key.nextDouble());
	}
	public static void writeFile()
	{
		System.out.println("\nEnter the name of a file to write");
		ShapeTree.sBST.writeShapeFile(key.nextLine());
	}
}
