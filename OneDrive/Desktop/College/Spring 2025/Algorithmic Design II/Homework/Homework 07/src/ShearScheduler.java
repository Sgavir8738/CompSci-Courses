import java.util.Scanner;
import java.io.*;
public class ShearScheduler {
	//Sebastian Gaviria 
	
	private MinHeap<Sheep> sheep;
	private Sheep currSheep;
	private final int BODY_AMT = 3;
	private final String DELIM = "\t";
	
	public ShearScheduler()
	{
		init();
	}
	public void init()
	{
		sheep = new MinHeap<Sheep>();
	}
	public void addSheep(Sheep s)
	{
		if (currSheep != null)
		{	//Sheep waits to be sheared
			sheep.add(s);
		}
		else
		{	//Sheep can be sheared now
			currSheep = s;
		}
		
	}
	public Sheep[] readSheepFile(String fileName)
	{	
		Sheep[] sheep = new Sheep[60];
		int numSheep = 0;
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine())
			{
				String fileLines = fileScanner.nextLine();
				String[] splitLine = fileLines.split(DELIM);
				if (splitLine.length == BODY_AMT)
				{
					String name = splitLine[0];
					int shearingTime = Integer.parseInt(splitLine[1]);
					int arrivalTime = Integer.parseInt(splitLine[2]);
					Sheep s = new Sheep(name, shearingTime, arrivalTime);		
					sheep[numSheep] = s;
					numSheep++;
				}
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		for (int i = 0; i < sheep.length; i++)
		{	//Sort sheep by their arrival times
			int smallestIndex = i;
			for (int j = i + 1; j < sheep.length; j++)
			{
				if (sheep[j].getArrivalTime() < sheep[smallestIndex].getArrivalTime())
				{
					smallestIndex = j;
				}
			}
			if (smallestIndex != i)
			{
				Sheep temp = sheep[i];
				sheep[i] = sheep[smallestIndex];
				sheep[smallestIndex] = temp;
			}
		}
		return sheep;
	}
	public void advanceOneMinute()
	{
		currSheep.shearForOneMinute();
		if (currSheep.isDone())
		{
			System.out.println(getCurrentSheep());
			//Allow a new current sheep to be set for shearing
			currSheep = null;
			this.addSheep(sheep.remove());
		}
	}
	public boolean isDone()
	{
		return currSheep == null;
	}
	public String getCurrentSheep()
	{
		return currSheep.toString();
	}
}
