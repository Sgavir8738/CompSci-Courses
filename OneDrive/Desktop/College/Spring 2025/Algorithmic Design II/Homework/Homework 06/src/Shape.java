public abstract class Shape implements Comparable<Shape> {
	//Sebastian Gaviria
	
	private String type;
	private double area;
	
	public Shape()
	{
		this.type = "none";
		this.area = 0;
	}
	public Shape(String xType)
	{
		this.setType(xType);
	}
	public String getType()
	{
		return this.type;
	}
	public double getArea()
	{
		return this.area;
	}
	public void setType(String xType)
	{
		if (xType != null)
		{
			this.type = xType;
		}
		else
		{
			this.type = "none";
		}
	}
	public void setArea(double xArea)
	{
		if (xArea >= 0)
		{
			this.area = xArea;
		}
		else
		{
			xArea = 0;
		}
	}
	public boolean equals(Shape s)
	{
		return this.type.equals(s.getType())
				&& this.area == s.getArea();
	}
	public int compareTo(Shape s)
	{
		if (s != null)
		{
			if (this.area > s.getArea())
			{
				return 1;
			}
			else if (this.area < s.getArea())
			{
				return -1;
			}
			else
			{
				if (this.type.equals(s.type))
				{
					return 0;
				}
				return -1;
			}
		}
		return -1;
	}
	//Abstract methods call the subclass methods 
	public abstract String toString();
	public abstract String toFile();
}
