
public class Student extends Person {

	private int studentID;
	private double gpa;
	private String major;
	
	//default constructor
	public Student()
	{
		super();		//calls the Person's default constructor
		this.studentID = 1234;
		this.gpa = 1;
		this.major = "no major selected";
	}
	
	//parameterized constructor
	public Student(String xName, int xAge, int xID, double xGpa, String xMajor)
	{
		super(xName, xAge);		//calls Person's parameterized constructor
		this.setStudentID(xID);
		this.setGpa(xGpa);
		this.setMajor(xMajor);
	}
	
	//accessors
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public double getGpa()
	{
		return this.gpa;
	}
	
	public String getMajor()
	{
		return this.major;
	}
	
	//mutators
	public void setStudentID(int xID)
	{
		if (xID > 0)
		{
			this.studentID = xID;
		}
		else
		{
			System.out.println("Invalid ID.");
		}
	}
	
	public void setGpa(double xGpa)
	{
		if (xGpa >= 1 && xGpa <= 4)
		{
			this.gpa = xGpa;
		}
		else
		{
			System.out.println("Invalid Gpa.");
		}
	}
	
	public void setMajor(String xMajor)
	{
		if (xMajor.equalsIgnoreCase("Computer Science")
				|| xMajor.equalsIgnoreCase("Computer Information Systems")
				|| xMajor.equalsIgnoreCase("Computer Engineering")
				|| xMajor.equalsIgnoreCase("Nursing")
				|| xMajor.equalsIgnoreCase("Psychology"))
		{
			this.major = xMajor;
		}
		else
		{
			System.out.println("Invalid major.");
		}
	}
	
	//method overriding - same method signature but different methodality
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Student ID: " + this.studentID
				+ "\nGPA: " + this.gpa 
				+ "\nMajor: " + this.major);
		
	}
}
