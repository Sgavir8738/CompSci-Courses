
public class Concert {

	private String bandName;
	private int capacity;
	private int numTicketsSoldByPhone;
	private int numTicketsSoldAtVenue;
	private double priceByPhone;
	private double priceAtVenue;
	
	public Concert()
	{
		this.bandName = "No name yet";
		this.capacity = 0;
		this.numTicketsSoldByPhone = 0;
		this.numTicketsSoldAtVenue = 0;
		this.priceByPhone = 0;
		this.priceAtVenue = 0;
	}
	
	public Concert(String xBandName, int xCapacity, double xPriceByPhone, double xPriceAtVenue)
	{
		this.setBandName(xBandName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceAtVenue);
	}
	
	public String getBandName()
	{
		return this.bandName;
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public int getNumTicketsSoldByPhone()
	{
		return this.numTicketsSoldByPhone;
	}
	
	public int getNumTicketsSoldAtVenue()
	{
		return this.numTicketsSoldAtVenue;
	}
	
	public void setBandName(String xBandName)
	{
		this.bandName = xBandName;
	}
	
	public void setCapacity(int xCapacity)
	{
		if (xCapacity > 0)
		{
			this.capacity = xCapacity;
		}
		else
		{
			System.out.println("Invalid capacity.");
		}
	}
	
	public void setPriceByPhone(double xPriceByPhone)
	{
		if (xPriceByPhone > 0)
		{
			this.priceByPhone = xPriceByPhone;
		}
		else
		{
			System.out.println("Invalid price by phone.");
		}
	}
	
	public void setPriceAtVenue(double xPriceAtVenue)
	{
		if (xPriceAtVenue > 0)
		{
			this.priceAtVenue = xPriceAtVenue;
		}
		else
		{
			System.out.println("Invalid price at venue");
		}
	}
	
	public int totalNumberOfTicketsSold()
	{
		return this.numTicketsSoldByPhone + this.numTicketsSoldAtVenue;
	}
	
	public int ticketsRemaining()
	{
		return this.capacity - this.totalNumberOfTicketsSold();
	}
	
	public void buyTicketsByPhone(int xNumTicketsSoldByPhone)
	{
		if (this.ticketsRemaining() >= xNumTicketsSoldByPhone)
		{
			this.numTicketsSoldByPhone += xNumTicketsSoldByPhone;
		}
		else 
		{
			System.out.println("The concert is sold out.");
		}
	}
	
	public void buyTicketsAtVenue(int xNumTicketsSoldAtVenue)
	{
		if (this.ticketsRemaining() >= xNumTicketsSoldAtVenue)
		{
			this.numTicketsSoldAtVenue += xNumTicketsSoldAtVenue;
		}
		else
		{
			System.out.println("The concert is sold out.");
		}
	}
	
	public double totalSales()
	{
		return (this.priceByPhone * this.numTicketsSoldByPhone)
				+ (this.priceAtVenue * this.numTicketsSoldAtVenue);
	}
}
