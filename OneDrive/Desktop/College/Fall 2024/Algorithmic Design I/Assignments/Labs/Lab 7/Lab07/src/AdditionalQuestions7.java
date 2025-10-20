import java.util.Scanner;
public class AdditionalQuestions7 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int[] arrayA = new int[10];
		
		int[] arrayB = new int[10];

		for (int i = 0; i < arrayA.length; i ++)
		{
			System.out.print("What is the value of arrayA at position " + i + "? ");
			arrayA[i] = key.nextInt();
		}
		
		for (int i = 0; i < arrayB.length; i ++)
		{
			System.out.print("What is the value of arrayB at position " + i + "? ");
			arrayB[i] = key.nextInt();
		}
		
		for (int i = 0; i < arrayB.length; i ++)
		{
			if (arrayA[i] != arrayB[i])
			{
				System.out.println("The arrays are unequal.");
				System.exit(0);
			}
		}
		
		System.out.println("The arrays are equal!");
	}

}
