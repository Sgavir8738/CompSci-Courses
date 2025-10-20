import java.util.Scanner;
public class VolumeOfARightCylinder {
	
	public static final double PI = 3.14;

	public static void main(String[] args) {
		
		//creating a Scanner object
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the radius (in inches) of the cylinder:");
		
		double radius = key.nextDouble();
		
		System.out.println("Enter the height (in inches) of the cylinder:");
		
		double height = key.nextDouble();
		
		double volume = PI * Math.pow(radius, 2) * height; 
		
		System.out.println("Volume of the right cylinder = " + volume + " cubic inches");
		
		
	}

}
