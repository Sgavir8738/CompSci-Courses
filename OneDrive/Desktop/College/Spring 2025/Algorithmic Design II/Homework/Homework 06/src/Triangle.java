public class Triangle extends Shape {
	//Sebastian Gaviria
	
	private double base;
	private double height;
	
	public Triangle()
	{
		super();
		this.base = 0;
		this.height = 0;
	}
	public Triangle(double xBase, double xHeight)
	{
		super("Right Triangle");
		this.setBase(xBase);
		this.setHeight(xHeight);
		this.setArea(xBase, xHeight);
	}
	public double getBase()
	{
		return this.base;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getArea()
	{
		return super.getArea();
	}
	public void setBase(double xBase)
	{
		if (xBase >= 0)
		{
			this.base = xBase;
		}
		else
		{
			this.base = 0;
		}
	}
	public void setHeight(double xHeight)
	{
		if (xHeight >= 0)
		{
			this.height = xHeight;
		}
		else
		{
			this.height = 0;
		}
	}
	public void setArea(double xBase, double xHeight)
	{
		if (xBase >= 0 && xHeight >= 0)
		{
			super.setArea(xBase * xHeight * 0.5);
		}
		else
		{
			super.setArea(0);
		}
	}
	public String toString()
	{
		return super.getType() +
			" Base: " + this.base +
			" Height: " + this.height +
			" Area: " + this.getArea();

	}
	public String toFile()
	{
		return super.getType() + "\t" + this.base + "\t" + this.height;
	}
}
