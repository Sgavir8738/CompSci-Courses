import java.util.Scanner;
import java.io.*;
public class ShapeTree {
	//Sebastian Gaviria
	
	public static ShapeBST sBST;
	private static int DEF_FIELD_AMT = 3;
	private static final String DELIM = "\t";
	
	public ShapeTree()
	{
		init();
	}
	private void init()
	{
		sBST = new ShapeBST();
	}
	public void readShapeFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				//Shapes are added in the order circle, rectangle, triangle if area values match
				if (splitLines.length < DEF_FIELD_AMT && splitLines.length != 1)
				{
					double var = Double.parseDouble(splitLines[1]);
					Circle c = new Circle(var);
					sBST.add(c);
				}
				else if (splitLines.length == DEF_FIELD_AMT)
				{
					String type = splitLines[0];
					double var1 = Double.parseDouble(splitLines[1]);
					double var2 = Double.parseDouble(splitLines[2]);
					if (type.equals("Rectangle"))
					{
						Rectangle r = new Rectangle(var1, var2);
						sBST.add(r);
					}
					else if (type.equals("Right Triangle"))
					{
						Triangle t = new Triangle(var1, var2);
						sBST.add(t);
					}
				}
				
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void printShapeTree(int choice)
	{
		System.out.println();
		switch (choice)
		{
			case 1:
				sBST.printPreorder();
				break;
			case 2:
				sBST.printInorder();
				break;
			case 3:
				sBST.printPostorder();
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}
