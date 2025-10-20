
public class Truck extends Vehicle {
	
	private double loadCap;
	private double towCap;
	
	public Truck()
	{
		super();
		this.loadCap = 0;
		this.towCap = 0;
	}
	
	public Truck(String xManuName, int xCylinders, String xOwnersName,  double xLoadCap, double xTowCap)
	{
		super(xManuName, xCylinders, xOwnersName);
		this.setLoadCap(xLoadCap);
		this.setTowCap(xTowCap);
	}
	
	public double getLoadCap()
	{
		return this.loadCap;
	}
	
	public double getTowCap()
	{
		return this.towCap;
	}
	
	public void setLoadCap(double xLoadCap)
	{
		if (xLoadCap > 0)
		{
			this.loadCap = xLoadCap;
		}
		else
		{
			System.out.println("\nInvalid load capacity.");
		}
	}

	public void setTowCap(double xTowCap)
	{
		if (xTowCap > 0)
		{
			this.towCap = xTowCap;
		}
		else
		{
			System.out.println("\nInvalid tow capacity.");
		}
	}
	
	public boolean equals(Truck t)
	{
		return super.equals(t)
				&& t.getLoadCap() == this.loadCap
				&& t.getTowCap() == this.towCap;
	}
	
	public String toString()
	{
		return super.toString()
				+ "\nLoad Capacity: " + this.loadCap
				+ "\nTow Capacity: " + this.towCap;
	}
}
