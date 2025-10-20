import java.util.Scanner;
public class SortSorter {
	//Sebastian Gaviria
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the sort sorter");
		boolean isSorting = true;
		while (isSorting)
		{
			System.out.println("Enter number of strings to sort:");
			int num = key.nextInt();
			String[] array = new String[num+1];
			System.out.println("Type strings to sort");
			for (int i = 0; i < array.length; i++)
			{	
				String word = key.nextLine();
				array[i] = word;
			}
			mergeSort(array);
			for (String word : array)
			{
				System.out.println(word);
			}
			System.out.println("Sort again? (true/false)");
			isSorting = key.nextBoolean();
		}
	}
	public static void mergeSort(String[] a)
	{
		int size = a.length;
		if (size < 2)
		{
			return;
		}
		//Split array by its middle index
		int mid = size / 2;
		int leftSize = mid; 
		int rightSize = size - mid;
		String[] left = new String[leftSize];
		String[] right = new String[rightSize];
		for (int i = 0; i < mid; i++)
		{
			left[i] = a[i];
		}
		for (int i = mid; i < size; i++)
		{
			right[i-mid] = a[i];
		}
		//Split each array recursively
		mergeSort(left);
		mergeSort(right);
		//Sort and merge the split arrays
		merge(left, right, a);
	}
	public static void merge(String[] left, String[] right, String[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//Left array's index
		int j = 0;//Right array's index
		int k = 0;//Merged array's index
		while (i < leftSize && j < rightSize)
		{
			if (countSortAmt(left, i) <= countSortAmt(right, j))
			{	//Sort arrays by amount of times 'sort' has been found
				a[k] = left[i];
				i++;
				k++;
			}
			else 
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	public static int countSortAmt(String[] a, int index)
	{
		int sortAmt = 0;
		String arrayStr = a[index].toString();//String to be iterated
		for (int i = 0; i <= arrayStr.length() - 4; i++)
		{
			if (arrayStr.substring(i, i + 4).equalsIgnoreCase("sort"))
			{	
				sortAmt++;
			}
		}
		return sortAmt;
	}
}
