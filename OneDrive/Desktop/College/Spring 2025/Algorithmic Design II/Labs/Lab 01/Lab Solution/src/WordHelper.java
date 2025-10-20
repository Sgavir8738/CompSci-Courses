
public class WordHelper {
	
	//Sebastian Gaviria
	
	public static String[] sortByVowels(String[] words)
	{	 
		String[] vowelSorted = new String[words.length];
		//Creates int array for number of vowels in each word
		int[] numVowels = new int[words.length];
	
		for (int i = 0; i < words.length; i++)
		{	//Copies String array values to new array
			vowelSorted[i] = words[i];
			
			int vowels = 0; 
			
			for (int j = 0; j < vowelSorted[i].length(); j++)
			{
				if (vowelSorted[i].substring(j, j + 1).equals("a") ||
						vowelSorted[i].substring(j, j + 1).equals("e") ||
						vowelSorted[i].substring(j, j + 1).equals("i") ||
						vowelSorted[i].substring(j, j + 1).equals("o") ||
						vowelSorted[i].substring(j, j + 1).equals("u") ||
						vowelSorted[i].substring(j, j + 1).equals("y"))
				{
					vowels++;
				}
			}
			
			//Stores number values for use in sorting
			numVowels[i] = vowels;
		}
		
		for (int i = 0; i < vowelSorted.length; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < vowelSorted.length; j++)
			{	
				if (numVowels[j] < numVowels[minIndex])
				{
					minIndex = j;
				}
			}
			
			if (minIndex != 1)
			{	//Sorts based on number of vowels in each word
				String temp = vowelSorted[i];
				int intTemp = numVowels[i];
				vowelSorted[i] = vowelSorted[minIndex];
				vowelSorted[minIndex] = temp;
				numVowels[minIndex] = intTemp;
			}
		}
		
		return vowelSorted;
	}
	
	public static String[] sortByConsonants(String[] words)
	{
		String[] conSorted = new String[words.length];
		int[] numConsonants = new int[words.length];
		
		for (int i = 0; i < conSorted.length; i++)
		{
			conSorted[i] = words[i];
			
			int consonants = 0; 
			
			for (int j = 0; j < conSorted[i].length(); j++)
			{	//Executes if character is not a vowel
				if (!conSorted[i].substring(j, j + 1).equals("a") &&
						!conSorted[i].substring(j, j + 1).equals("e") &&
						!conSorted[i].substring(j, j + 1).equals("i") &&
						!conSorted[i].substring(j, j + 1).equals("o") &&
						!conSorted[i].substring(j, j + 1).equals("u") &&
						!conSorted[i].substring(j, j + 1).equals("y"))
				{
					consonants++;
				}
			}
			
			numConsonants[i] = consonants;
		}
		
		for (int i = 0; i < conSorted.length; i++)
		{
			int minIndex = i;
			
			for (int j = i + 1; j < conSorted.length; j++)
			{	
				if (numConsonants[j] < numConsonants[minIndex])
				{
					minIndex = j;
				}
			}
			
			if (minIndex != 1)
			{	//Sorts based on number of consonants in each word
				String temp = conSorted[i];
				int intTemp = numConsonants[i];
				conSorted[i] = conSorted[minIndex];
				conSorted[minIndex] = temp;
				numConsonants[minIndex] = intTemp;
			}
		}
				
		return conSorted;
	}
	
	public static String[] sortByLength(String[] words)
	{
		String[] lenSorted = new String[words.length];
		
		for (int i = 0; i < lenSorted.length; i++)
		{
			lenSorted[i] = words[i];
		}
		
		for (int i = 0; i < lenSorted.length; i++)	
		{
			int minIndex = i;
			
			for (int j = i + 1; j < lenSorted.length; j++)
			{
				if (lenSorted[j].length() < lenSorted[minIndex].length())
				{
					minIndex = j;
				}
			}
			
			if (minIndex != 1)
			{	//Sorts based on length of each word
				String temp = lenSorted[i];
				lenSorted[i] = lenSorted[minIndex];
				lenSorted[minIndex] = temp;
			}
		}
		
		return lenSorted;
	}
}


