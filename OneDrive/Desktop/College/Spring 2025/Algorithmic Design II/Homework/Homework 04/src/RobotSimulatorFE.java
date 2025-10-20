import java.util.Scanner;
public class RobotSimulatorFE {
	//Sebastian Gaviria
	
	public static Scanner key = new Scanner(System.in); 
	public static RobotSimulator roboSim;
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Robot Simulator\n");
		boolean isPlaying = true;
		while (isPlaying)
		{
			//Reinitializes simulator every time it is ran 
			roboSim = new RobotSimulator();
			enterBoardFile();
			enterCommandFile();
			roboSim.printBoard();
			runSimulation();
			System.out.println("\nEnd of simulation");
			isPlaying = playAgain();
		}
	}
	
	public static void enterBoardFile()
	{
		System.out.println("Enter board file");
		String file = key.nextLine();
		roboSim.readBoardFile(file);
	}
	public static void enterCommandFile()
	{
		System.out.println("Enter robot command file");
		String file = key.nextLine();
		roboSim.readCommandFile(file);
		System.out.println();
	}
	public static void runSimulation()
	{
		System.out.println("\nSimulation start");
		int numCommand = 1;
		while (roboSim.activeCommand != null)
		{
			System.out.println("\nCommand " + numCommand);
			if(!roboSim.runNextCommand())
			{	//Informs user of robot crash and ends the simulation
				System.out.println("CRASH!!");
				return;
			}
			roboSim.printBoard();
			numCommand++;
		}
	}
	public static boolean playAgain()
	{
		System.out.println("Run another simulation? (y/n)");
		String playAgain = key.next();
		key.nextLine();
		if (playAgain.equals("y"))
		{
			System.out.println();
			return true;
		}
		else
		{
			return false;
		}
	}

}
