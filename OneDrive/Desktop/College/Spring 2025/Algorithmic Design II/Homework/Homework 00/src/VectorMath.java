import java.util.Scanner;
public class VectorMath {
	//Sebastian Gaviria
	
	public static Scanner key = new Scanner(System.in);
	private double[] vector;
	public final static int DEF_SIZE = 2;
	public VectorMath()
	{
		init(DEF_SIZE);
	}
	public VectorMath(int size)
	{
		init(size);
	}
	public void init(int size)
	{
		vector = new double[size];
	}
	public double[] createVector()
	{
		double[] nums = new double[vector.length];
		for (int i = 0; i < vector.length; i++)
		{	// Adds vector contents based on user input
			nums[i] = key.nextDouble();
		}
		return nums;
	}
	public String addVectors(double[] v1, double[] v2)
	{	
		double[] sums = new double[vector.length];
		
		String result = "";
		for (int i = 0; i < vector.length; i++)
		{
			sums[i] = v1[i] + v2[i];
			
			result += sums[i] + "\t";
		}
		
		return result;
	}
	public String subtractVectors(double[] v1, double[] v2)
	{	
		double[] differences = new double[vector.length];
		
		String result = "";
		for (int i = 0; i < vector.length; i++)
		{
			differences[i] = v1[i] - v2[i];
			
			result += differences[i] + "\t";
		}
		
		return result;
	}
	public double magnifyVector(double[] v)
	{	
		double[] squares = new double[vector.length];
		
		double result = 0;
		for (int i = 0; i < vector.length; i++)
		{	// Adds squared numbers together 
			squares[i] = Math.pow(v[i], 2);
			result += squares[i];
		}
		// Takes the square root of the initial sum
		result = Math.pow(result, 0.5);
		return result;
	}
}
