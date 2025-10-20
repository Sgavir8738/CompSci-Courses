import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class PrizeShowcase {
	//Sebastian Gaviria
	
	private Prize[] prizes;
	private Prize[] prizePool;
	public static final int DEF_SIZE = 10;
	public static final String DELIM = "\t";
	public static final int BODY_FIELD_AMT = 2;
	
	public PrizeShowcase()
	{
		init(DEF_SIZE);
	}
	public PrizeShowcase(int size)
	{
		init(size);
	}
	public void init(int size)
	{
		if (size >= 1)
		{
			prizes = new Prize[size];
		}
		else
		{
			prizes = new Prize[DEF_SIZE];
		}
		//Initialize array for randomized prizes
		prizePool = new Prize[5];
	}
	public void addPrize(Prize p)
	{
		if (prizes[prizes.length - 1] != null)
		{
			return;
		}
		for (int i = 0; i < prizes.length - 1; i++)
		{
			if (prizes[i] == null)
			{
				prizes[i] = p;
				break;
			}
		}
	}
	public void removePrize(String name)
	{
		int removeIndex = -1;
		for (int i = 0; i < prizes.length; i++)
		{
			if (prizes[i] != null && prizes[i].getName().equals(name))
			{
				removeIndex = i;
				break;
			}
		}
		
		if (removeIndex == -1)
		{
			return;
		}
		else
		{
			for (int i = removeIndex; i < prizes.length - 1; i++)
			{
				prizes[i] = prizes[i+1];
			}
			prizes[prizes.length - 1] = null;
		}
	}
	public void getSize(String inputFile)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(inputFile));
			int prizeAmount = 0;
			//Reads the number of lines to initialize size of array
			while (fileScanner.hasNextLine())
			{
				prizeAmount++;
				fileScanner.nextLine();
			}
			init(prizeAmount);
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readPrizeFile(String inputFile)
	{
		getSize(inputFile);
		try
		{
			Scanner fileScanner = new Scanner(new File(inputFile));
			while (fileScanner.hasNextLine())
			{	
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if (splitLines.length == BODY_FIELD_AMT)
				{
					String prizeName = splitLines[0];
					double prizePrice = Double.parseDouble(splitLines[1]);
					Prize p = new Prize(prizeName, prizePrice);
					this.addPrize(p);
				}
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void randomPrizes()
	{
		Random random = new Random();
		for (int i = 0; i < prizePool.length; i++)
		{
			int r = random.nextInt(prizes.length);
			if (prizes[r] != null)
			{
				prizePool[i] = prizes[r];
				//Removes each selected object from prize list
				this.removePrize(prizes[r].getName());
			}
			else 
			{	//Omits prize object if it has been removed
				i--;
			}
		}
	}
	public double totalCost()
	{
		double totalCost = 0;
		for (Prize prize : prizePool)
		{
			if (prize == null)
			{
				break;
			}
			totalCost += prize.getPrice();
		}
		return totalCost;
	}
	public void printPrizes()
	{
		for (Prize prize : prizePool)
		{
			if (prize == null)
			{
				break;
			}
			System.out.println(prize.getName());
		}
	}
}
