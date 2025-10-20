import java.util.Scanner;
import java.io.*;
public class ShrekAnalyzer {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Welccome to the Shrek Analyzer\nEner a word and we will count the number of times it appears.");
		String word = key.nextLine();
		System.out.println("The word " + word + " was found " + lookForWord(word) + " times.");
	}
	
	public static int lookForWord(String word)
	{
		int ret = 0;
		try
		{
			Scanner fileScanner = new Scanner(new File("Shrek.txt"));
			while (fileScanner.hasNext())
			{
				String next = fileScanner.next();
				//if (next.equalsIgnoreCase(word))
				if (next.toUpperCase().contains(word.toUpperCase()))
				{
					ret++;
				}
			}
			
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return ret;
	}

}
