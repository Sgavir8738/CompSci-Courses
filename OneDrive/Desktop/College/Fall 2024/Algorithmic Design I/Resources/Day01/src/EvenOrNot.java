import java.util.Scanner;
public class EvenOrNot {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		//type casting
		int number = (int) key.nextDouble();
		
		if (number % 2 == 0)
		{
			System.out.println("Number entered is even");
		}
		else
		{
			System.out.println("Number entered is odd");
		}
		
		int a = 10;
		
		System.out.println(a);
		
		
	}

}
