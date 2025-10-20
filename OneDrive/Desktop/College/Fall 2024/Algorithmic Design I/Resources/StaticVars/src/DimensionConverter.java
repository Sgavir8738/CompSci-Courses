
public class DimensionConverter {

	public static final int FEET2INCHES = 12;
	
	public static double FeetToInches(double feet)
	{
		
		return feet * FEET2INCHES;
	}
	
	public static double InchesToFeet(double inches)
	{
		return inches / FEET2INCHES;
	}

}
