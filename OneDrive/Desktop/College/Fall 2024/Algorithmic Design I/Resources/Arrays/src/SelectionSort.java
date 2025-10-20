import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		
		//create a Scanner object
		Scanner key = new Scanner(System.in);
		
		
		System.out.print("What is the length of your array? ");
		int size = key.nextInt();
		
		int[] myArray = new int[size];
		
		//storing user input
		for (int i = 0; i < myArray.length; i ++)
		{
			System.out.print("Enter the value of the array at index " + i + ": ");
			myArray[i] = key.nextInt();
		}
		
		//selection sort
		for (int i = 0; i < myArray.length; i ++)
		{
			int minIndex = i;
			int smallest = myArray[i];
			
			for (int j = i + 1; j < myArray.length; j ++)
			{
				if (myArray[j] < smallest)
				{
					smallest = myArray[j];
					minIndex = j;
				}
			}
			
			if (smallest < myArray[i])
			{
				int temp = myArray[i];
				myArray[i] = myArray[minIndex];
				myArray[minIndex] = temp;
			}
		}
		
		//print the contents of the array
		for (int i = 0; i < myArray.length; i ++)
		{
			System.out.print(myArray[i] + " ");
		}

	}

}
