import java.util.Scanner;
import java.io.*;
public class FileIOSolutions {
	//Sebastian Gaviria
	
	public static final String DELIM = "\t";
	public static final int BODY_FIELD_AMT = 3;
	
	public static void pastTense(String fileInput, String fileOutput)
	{	try
		{
			Scanner fileScanner = new Scanner(new File(fileInput)); 
			PrintWriter fileWriter = new PrintWriter(new File(fileOutput));
			//Read body
			while (fileScanner.hasNext())
			{
				String next = fileScanner.next();
				if (next.toUpperCase().equalsIgnoreCase("is"))
				{
					//Swaps instance of "is" to "was
					next = "was";
				}
					
				System.out.println(next);
				try
				{
					//Writes to a newly created file
					fileWriter.println(next);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			//Close file scanner and writer	
			fileScanner.close();
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static double totalTubeVolume(String fileInput)
	{
		double volume = 0;
		try
		{	
			Scanner fileScanner = new Scanner(new File(fileInput));
			//Read body
			while (fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if (splitLines.length == BODY_FIELD_AMT)
				{	//Separates string values to process into double
					double radius = Double.parseDouble(splitLines[1]);
					double height = Double.parseDouble(splitLines[2]);
					
					volume += Math.pow(radius, 2) * Math.PI * height;
				}
			}
			//Close the file scanner
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return volume;
	}
}
