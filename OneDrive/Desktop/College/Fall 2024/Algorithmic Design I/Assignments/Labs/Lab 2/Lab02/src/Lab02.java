import java.util.Scanner;
public class Lab02 {
	public static final double ACCEL = 9.8; 
	public static void main(String[] args) {
		//Sebastian Gaviria
		
		//creating a Scanner object
		Scanner key = new Scanner(System.in);

		System.out.print("Enter the inital velocity of the ball (in meters per second) at point A: ");
		
		double initial = key.nextDouble();
		
		System.out.print("How much time (in seconds) does the ball take to reach point B? ");
		
		double time = key.nextDouble();
		
		//input validation for time value
		if (time % 1 != 0)
		{
			System.out.println("Invalid input. Program halted.");
			System.exit(0);
		}
		
		double result = initial + ACCEL * time;
		
		double distance = initial * time + 0.5 * ACCEL * Math.pow(time, 2);
		
		System.out.println("Final velocity of the ball = " + result + " m/s");
		
		System.out.println("Distance traveled by the ball = " + distance + " meters");
		
		
		
	}

}
