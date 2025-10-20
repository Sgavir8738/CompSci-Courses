
public class Car extends Vehicle {

	private double mileage;
	private int passengers;
	
	public Car()
	{
		super();
		this.mileage = 0;
		this.passengers = 0;
	}
	
	public Car(String xManuName, int xCylinders, String xOwnersName,  double xMileage, int xPassengers)
	{
		super(xManuName, xCylinders, xOwnersName);
		this.setMileage(xMileage);
		this.setPassengers(xPassengers);
	}
	
	public double getMileage()
	{
		return this.mileage;
	}
	
	public int getPassengers()
	{
		return this.passengers;
	}
	
	public void setMileage(double xMileage)
	{
		if (xMileage > 0)
		{
			this.mileage = xMileage;
		}
		else
		{
			System.out.println("\nInvalid mileage.");
		}
	}
	
	public void setPassengers(int xPassengers)
	{
		if (xPassengers > 0)
		{
			this.passengers = xPassengers;
		}
		else
		{
			System.out.println("\nInvalid number of passengers");
		}
	}
	
	public boolean equals(Car c)
	{
		return super.equals(c)
				&& c.getMileage() == this.mileage
				&& c.getPassengers() == this.passengers;
	}
	
	public String toString()
	{
		return super.toString() 
				+ "\nGas Mileage: " + this.mileage
				+ "\nNumber of Passengers: " + this.passengers;
	}
}
