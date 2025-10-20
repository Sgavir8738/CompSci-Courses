
public class CargoShip extends Ship {

	private int tonnage;
	private double speed;
	
	public CargoShip()
	{
		super();
		tonnage = 0;
		speed = 0;
	}
	
	public CargoShip(String xName, String xDate, int xTonnage, double xSpeed) throws Exception
	{
		super(xName, xDate);
		this.setTonnage(xTonnage);
		this.setSpeed(xSpeed);
	}
	
	public int getTonnage()
	{
		return this.tonnage;
	}
	
	public double getSpeed()
	{
		return this.speed;
	}
	
	public void setTonnage(int xTonnage)
	{
		if (xTonnage > 0)
		{
			this.tonnage = xTonnage;
		}
		else
		{
			
		}
	}
	
	public void setSpeed(double xSpeed)
	{
		if (xSpeed > 0)
		{
			this.speed = xSpeed;
		}
		else
		{
			
		}
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Tonnage: " + this.tonnage + " DWT"
				+ "\nMaximum Speed: " + this.speed + " mph");
	}
}
