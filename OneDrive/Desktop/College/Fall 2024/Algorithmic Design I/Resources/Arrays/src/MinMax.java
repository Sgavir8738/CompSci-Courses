import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		
		int size = key.nextInt();
		
		//create an array
		int [] myArray = new int[size];
		
		for (int i = 0; i < myArray.length; i ++)
		{
			System.out.print("Enter the value of the array at index " + i + ": ");
			
			myArray[i] = key.nextInt();
		}
		
		double sum = 0;
		int min = myArray[0];
		int max = myArray[0];
		
		for (int i = 0; i < myArray.length; i ++)
		{
			if (myArray[i] < min)
			{
				min = myArray[i];
			}
			
			if (myArray[i] > max)
			{
				max = myArray[i];
			}
			
			sum += myArray[i];
		}
		
		double average = sum / size;
		
		System.out.println("Minimum value = " + min);
		System.out.println("Maximum value = " + max);
		System.out.println("Average value = " + average);
	}

}
