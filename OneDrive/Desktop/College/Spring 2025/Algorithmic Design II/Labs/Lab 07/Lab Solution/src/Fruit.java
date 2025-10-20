public class Fruit implements Comparable<Fruit> {
	//Sebastian Gaviria
	
	String type;
	double weight;
	public Fruit()
	{
		this.type = "apple";
		this.weight = 1.0;
	}
	public Fruit(String xType, double xWeight)
	{
		this.setType(xType);
		this.setWeight(xWeight);
	}
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public void setType(String xType)
	{
		if (xType != null)
		{
			this.type = xType;
		}
		else
		{
			this.type = "apple";
		}
	}
	public void setWeight(double xWeight)
	{
		if (xWeight > 0)
		{
			this.weight = xWeight;
		}
		else
		{
			this.weight = 1.0;
		}
	}
	public String toString()
	{
		return this.type + ": " + this.weight;
	}
	public int compareTo(Fruit f)
	{
		if (f != null)
		{
			if (this.weight > f.getWeight())
			{
				return 1;
			}
			else if (this.weight < f.getWeight())
			{
				return -1;
			}
			else
			{
				if (this.type.compareTo(f.getType()) == 0)
				{	//Fruits are equal
					return 0;
				}
				else
				{
					return -1;
				}
			}
		}
		//Fruit doesn't exist
		return -1;
	}
}
