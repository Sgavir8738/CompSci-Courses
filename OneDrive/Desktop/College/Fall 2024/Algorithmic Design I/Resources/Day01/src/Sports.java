import java.util.Random;
public class Sports {
	
	public static final int MAX = 5;
	
	public static void main(String[] args) {

		Random r = new Random();
		
		int choice = r.nextInt(MAX);
		
		String sports = "";
		
		switch (choice)
		{
		case 0:
			sports = "Soccer";
			break;	
		case 1:
			sports = "Basketball";
			break;
		case 2:
			sports = "Throwball";
			break;	
		case 3:
			sports = "Tennis";
			break;
		case 4:
			sports = "Baseball";
			break;
		default:
			System.out.println("Error.");
			break;
		}
		
		System.out.println(sports + " was chosen");
		
		
	}

}
