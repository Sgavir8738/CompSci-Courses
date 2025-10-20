import java.util.Scanner;
import java.io.*;
public class ShearSchedulerSimulator {
	
	public static void main(String[] args) {
		//Sebastian Gaviria
		
		Scanner key = new Scanner(System.in);
		ShearScheduler shearScheduler = new ShearScheduler();
		 
		System.out.println("Enter a sheep file:");
		Sheep[] sheep = shearScheduler.readSheepFile(key.nextLine());
		System.out.println();
		int currSheep = 0;
		int count = 0;
		while (true)
		{
			if (currSheep < sheep.length && count == sheep[currSheep].getArrivalTime())
			{	
				shearScheduler.addSheep(sheep[currSheep]);
				currSheep++;
				//Check if another sheep arrives at the same time
				continue;
			}
			if (shearScheduler.isDone())
			{
				//All shearing has been completed
				break;
			}
			shearScheduler.advanceOneMinute();
			count++;
		}
	}

}
