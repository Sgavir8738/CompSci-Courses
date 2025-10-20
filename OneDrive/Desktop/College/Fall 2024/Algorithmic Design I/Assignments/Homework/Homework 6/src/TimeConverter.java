
public class TimeConverter {

	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM;
	
	//default constructor
	public TimeConverter() 
	{
		hours = 0;
		minutes = 0;
		seconds = 0;
		notPM = true;
	}
	
	//parameterized constructor
	public TimeConverter(int xHours, int xMinutes, int xSeconds)
	{
		this.setHours(xHours);
		this.setMinutes(xMinutes);
		this.setSeconds(xSeconds);
	}
	
	//accessors
	public int getHours()
	{
		return this.hours;
	}
	
	public int getMinutes()
	{
		return this.minutes;
	}
	
	public int getSeconds()
	{
		return this.seconds;
	}
	
	public boolean getNotPM()
	{
		return this.notPM;
	}
	
	//mutators
	public void setHours(int xHours)
	{
		if (xHours > 0 && xHours <= 24)
		{
			this.hours = xHours;
			
			if (xHours > 12)
			{
				this.hours -= 12;
			}
			
		}
	}
	
	public void setMinutes(int xMinutes)
	{
		if (xMinutes >= 0 && xMinutes <= 59)
		{
			this.minutes = xMinutes;
		}
	}
	
	public void setSeconds(int xSeconds)
	{
		if (xSeconds >= 0 && xSeconds <= 59)
		{
			this.seconds = xSeconds;
		}
	}
	
	//other methods
	public String updateTime(int xHours, int xMinutes, int xSeconds) throws TimeException
	{	
		String timeOfDay;
		
		if (xHours >= 12)
		{
			notPM = false;
		}
		else
		{
			notPM = true;
		}
		
		if (notPM)
		{
			timeOfDay = " AM";
		}
		else
		{
			timeOfDay = " PM";
		}
			
		if (xHours > 24 || xHours <= 0
				|| xMinutes >= 60 || xMinutes < 0
				|| xSeconds >= 60 || xSeconds < 0)
		{
			throw new TimeException();
		}
		else
		{
			String strHours = "" + this.hours;
			String strMinutes = "" + this.minutes;
			String strSeconds = "" + this.seconds;
			
			if (String.valueOf(this.minutes).length() < 2)
			{
				strMinutes = "0" + this.minutes;
			}
			if (String.valueOf(this.seconds).length() < 2)
			{
				strSeconds = "0" + this.seconds;
			}
			
			String timeResult = strHours + ":" + strMinutes + ":" + strSeconds + timeOfDay;
			return timeResult;
		}
	}
	
	//overloaded method
	public String updateTime(String xTime) throws TimeException, Exception
	{
		String timeHours;
		String timeMinutes;
		String timeSeconds;
		
		if (xTime.length() > 7)
		{
			timeHours = xTime.substring(0, 2);
			timeMinutes = xTime.substring(3, 5);
			timeSeconds = xTime.substring(6);
		}
		else
		{
			timeHours = xTime.substring(0, 1);
			timeMinutes = xTime.substring(2, 4);
			timeSeconds = xTime.substring(5);
		}
		
		int xHours = Integer.parseInt(timeHours);
		int xMinutes = Integer.parseInt(timeMinutes);
		int xSeconds = Integer.parseInt(timeSeconds);
		
		this.setHours(xHours);
		this.setMinutes(xMinutes);
		this.setSeconds(xSeconds);
		
		String timeOfDay;
		
		if (xHours >= 12)
		{
			notPM = false;
		}
		else
		{
			notPM = true;
		}
		
		if (notPM)
		{
			timeOfDay = " AM";
		}
		else
		{
			timeOfDay = " PM";
		}
			
		if (xHours > 24 || xHours <= 0
				|| xMinutes >= 60 || xMinutes < 0
				|| xSeconds >= 60 || xSeconds < 0)
		{
			throw new TimeException();
		}
		else
		{
			String strHours = "" + this.hours;
			String strMinutes = "" + this.minutes;
			String strSeconds = "" + this.seconds;
			
			if (String.valueOf(this.minutes).length() < 2)
			{
				strMinutes = "0" + this.minutes;
			}
			if (String.valueOf(this.seconds).length() < 2)
			{
				strSeconds = "0" + this.seconds;
			}
			
			String timeResult = strHours + ":" + strMinutes + ":" + strSeconds + timeOfDay;
			return timeResult;
		}
	}
	
	public String displayTime(String xResult)
	{
		return xResult;
	}
}
