import java.util.Scanner;
import java.io.*;
public class BasicFileIO {

	public static void main(String[] args) {

		try 
		{
			//writing to a file
			Scanner key = new Scanner(System.in);
			
			System.out.println("Standard write out to a file: ");
			
			PrintWriter output = new PrintWriter(new FileOutputStream("file01.txt", true));
			
			System.out.println("Enter 3 sentences: ");
			
			for (int i = 0; i < 3; i ++)
			{
				output.println(key.nextLine());
			}
			
			System.out.println();
			
			output.close();
			
			key.close();
			
			//reading from a file
			Scanner fileScanner = new Scanner(new File("file01.txt"));
			
			while (fileScanner.hasNextLine())
			{
				System.out.println(fileScanner.nextLine());
			}
			
			fileScanner.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
