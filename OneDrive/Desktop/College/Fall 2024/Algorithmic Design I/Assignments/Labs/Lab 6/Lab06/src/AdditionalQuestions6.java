import java.util.Scanner;
public class AdditionalQuestions6 {

	public static void main(String[] args) {
		// Sebastian Gaviria
		
		// create a Scanner object
		Scanner key = new Scanner(System.in);
		
		// number 1
		int n = key.nextInt();
		
		double sum = 0;
		
		for (double i = 0; i <= n; i ++)
		{
			sum = sum + Math.pow(i, 2);
		}
		
		System.out.println(sum);
		
		// number 3
		for (int x = 0; x < 50; x ++)
		{
			System.out.println(x);
		}
		
		// int y = x + 9;
		
		// number 6
		for (int i = 0; i < 3; i ++)
		{
			for (int j = 1; j < 5; j ++)
			{
				System.out.println(i + j);
			}
		}
	}

}
