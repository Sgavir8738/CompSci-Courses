import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class FruitTreeTester {
	//Sebastian Gaviria

	private static final LinkedBST<Fruit> fBST = new LinkedBST<Fruit>();
	private static final String DELIM = "\t";
	private static final int FIELD_AMT = 2;
	public static boolean chosen = false;
	public static Fruit remove;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a fruit file:");
		readFile(key.nextLine());
		//Print fruit tree traversals
		System.out.println("\nPrinting pre-order");
		fBST.printPreorder();
		System.out.println("\nPrinting in-order");
		fBST.printInorder();
		System.out.println("\nPrinting post-order");
		fBST.printPostorder();
		//Remove fruit from tree
		System.out.println("\nRemoving " + remove.toString());
		fBST.remove(remove);
		//Print new fruit tree
		System.out.println("\nPrinting in-order");
		fBST.printInorder();
		
	}
	public static void readFile(String fileName)
	{
		Random r = new Random();
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if (splitLines.length == FIELD_AMT)
				{
					String type = splitLines[0];
					double weight = Double.parseDouble(splitLines[1]);
					Fruit aFruit = new Fruit(type, weight);
					fBST.add(aFruit);
					if (r.nextInt(15) == 1 && !chosen)
					{	//Pick random fruit to remove
						remove = aFruit;
						chosen = true;
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
}
