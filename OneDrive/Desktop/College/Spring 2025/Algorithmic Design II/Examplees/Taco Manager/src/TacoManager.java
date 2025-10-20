import java.util.Scanner;
import java.io.*;
public class TacoManager {
	
	private Taco[] tacos;
	public static final int DEF_SIZE = 10;
	public static final String DELIM = "\t";
	public static final int BODY_FIELD_AMT = 3;
	public static final int HEADER_FIELD_AMT = 2;
	
	public TacoManager()
	{
		init(DEF_SIZE);
	}
	
	public TacoManager(int size)
	{
		init(size);
	}
	
	public void init(int size)
	{
		if (size >= 1)
		{
			tacos = new Taco[size];
		}
		else
		{
			tacos = new Taco[DEF_SIZE];
		}
	}
	
	public void addTaco (Taco t)
	{
		if (tacos[tacos.length - 1] != null)
		{
			return;
		}
		for (int i = 0; i < tacos.length - 1; i++)
		{
			if (tacos[i] == null)
			{
				tacos[i] = t;
				break;
			}
			
			this.sortTacos();
		}
	}
	
	public void removeTaco(String name)
	{
		int removeIndex = -1;
		
		for (int i = 0; i < tacos.length; i++)
		{
			if (tacos[i] != null && tacos[i].getName().equals(name))
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
			for (int i = removeIndex; i < tacos.length - 1; i++)
			{
				tacos[i] = tacos[i+1];
			}
			
			tacos[tacos.length - 1] = null;
		}
	}
	
	private void sortTacos()
	{
		boolean hasSwapped = true;
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < tacos.length - 1; i++)
			{
				if (tacos[i+1] == null)
				{
					break;
				}
				
				if (tacos[i].getPrice() > tacos[i+1].getPrice())
				{
					Taco temp = tacos[i];
					tacos[i] = tacos[i+1];
					tacos[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	
	public void writeTacoFile(String name) 
	{
		try 
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(name));
			//Header
			fileWriter.println("Taco Amt:" + DELIM + tacos.length);
			//Body
			for (Taco taco : tacos)
			{
				if (taco == null)
				{
					break;
				}
				
				fileWriter.println(taco.getName()+ DELIM + taco.getLocation() + DELIM + taco.getPrice());
			}
			
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readTacoFile(String name)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(name));
			//Read header
			String fileLine = fileScanner.nextLine();
			String[] splitLines = fileLine.split(DELIM);
			if (splitLines.length == HEADER_FIELD_AMT)
			{
				int size = Integer.parseInt(splitLines[1]);
				init(size);
			}
			else
			{
				return;
			}
			
			//Read body
			while (fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLines = fileLine.split(DELIM);
				if (splitLines.length == BODY_FIELD_AMT)
				{
					String tacoName = splitLines[0];
					String tacoLocation = splitLines[1];
					double tacoPrice = Double.parseDouble(splitLines[2]);
					Taco t = new Taco(tacoName, tacoLocation, tacoPrice);
					this.addTaco(t);
				}
			}
			
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void printTacos()
	{
		for (Taco taco : tacos)
		{
			if (taco == null)
			{
				break;
			}
			
			System.out.println(taco);
		}
	}
}
