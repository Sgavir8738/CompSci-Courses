public class Rectangle extends Shape  {
	//Sebastian Gaviria
	
	private double length;
	private double width;
	
	public Rectangle()
	{
		super();
		this.length = 0;
		this.width = 0;
	}
	public Rectangle(double xLength, double xWidth)
	{
		super("Rectangle");
		this.setLength(xLength);
		this.setWidth(xWidth);
		this.setArea(xLength, xWidth);
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getArea()
	{
		return super.getArea();
	}
	public void setLength(double xLength)
	{
		if (xLength >= 0)
		{
			this.length = xLength;
		}
		else
		{
			this.length = 0;
		}
	}
	public void setWidth(double xWidth)
	{
		if (xWidth >= 0)
		{
			this.width = xWidth;
		}
		else
		{
			this.width = 0;
		}
	}
	public void setArea(double xLength, double xWidth)
	{
		if (xLength >= 0 && xWidth >= 0)
		{
			super.setArea(xLength * xWidth);
		}
		else
		{
			super.setArea(0);
		}
	}
	public String toString()
	{
		return super.getType() +
				" Length: " + this.length +
				" Width: " + this.width +
				" Area: " + this.getArea();
	}
	public String toFile()
	{
		return super.getType() + "\t" + this.length + "\t" + this.width;
	}
}
