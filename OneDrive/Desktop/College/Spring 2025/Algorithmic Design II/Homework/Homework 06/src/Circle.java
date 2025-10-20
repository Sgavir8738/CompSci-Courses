public class Circle extends Shape {
	//Sebastian Gaviria
	
	private double radius;
	
	public Circle()
	{
		super();
		this.radius = 0;
	}
	public Circle(double xRadius)
	{
		super("Circle");
		this.setRadius(xRadius);
		this.setArea(xRadius);
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getArea()
	{
		return super.getArea();
	}
	public void setRadius(double xRadius)
	{
		if (xRadius >= 0)
		{
			this.radius = xRadius;
		}
		else
		{
			this.radius = 0;
		}
	}
	public void setArea(double xRadius)
	{
		if (xRadius >= 0)
		{
			super.setArea(Math.pow(xRadius, 2) * Math.PI);
		}
		else
		{
			super.setArea(0);
		}
	}
	public String toString()
	{
		return super.getType() +
			" Radius: " + this.radius +
			" Area: " + this.getArea();
	}
	public String toFile()
	{
		return super.getType() + "\t" + this.radius;
	}
}
