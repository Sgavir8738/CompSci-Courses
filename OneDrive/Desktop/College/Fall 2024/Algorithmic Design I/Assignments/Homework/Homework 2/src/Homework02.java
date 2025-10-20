import java.util.Scanner; 
import java.util.Random;
public class Homework02 {
	
	public static final int MAX = 6;
	
	public static void main(String[] args) {
		// Sebastian Gaviria
		
		// Create a Scanner object
		Scanner key = new Scanner(System.in);
		
		
		// create a randomizer object
		Random r = new Random();
		
		System.out.println("You wake up in a room not knowing who you are or how you got there.");
		System.out.println("You are confronted by three doors. Which one will you go through?\n");
		System.out.println("Left\nMiddle\nRight\n");
	
		// loops for invalid inputs
		while (true)
		{
			String door = key.next().toLowerCase();
		 
			if (door.equals("left"))
			{
				System.out.println("You open the leftmost door and see a girl standing at the end of a hallway. Her "
						+ "face is obscured. What do you do?\n");
				System.out.println("Approach her\nTurn around\nNothing\n");
				
				while (true)
				{
					String girl = key.nextLine().toLowerCase();
					
					if (girl.equals("approach her"))
					{
						System.out.println("She notices you walking towards her and turns around to face you. "
								+ "\"Oh? Hey there, I'm Hatsune Miku!! \nThe show's about to start, do you want to join me?\"\n ");
						System.out.println("Yes\nNo\n");
						
						while (true)
						{
							String show = key.next().toLowerCase();
							
							if (show.equals("yes"))
							{
								System.out.println("\"Great!! Let's have some fun! ^o^\"\n ");
								System.out.println("The stage - now made visible to you - lights up, a sea of colors illuminates the audience, "
										+ "and the show begins! \nYou keep up with the virtual singer's movements as best "
										+ "you can as you both sing your hearts out for the crowd!");
								break;
							}
							else if (show.equals("no"))
							{
								System.out.println("\"That's okay! You can still watch if you want. \nMiku sings for everyone "
										+ "after all!\"\n");
								System.out.println("You joined the audience as Miku reappears on q stage to begin the show. \n"
										+ "You find yourself unable to look away as her singing and dancing mesmerzies you.");
								break;
							}
							
						}
						break;
					}
					else if (girl.equals("turn around"))
					{
						System.out.println("You try to go back through the door, but you realize that it is no longer there.");
						System.out.println("You are caught off guard by a sudden array of lights and music in the distance.");
						System.out.println("The sounds are in the direction of the girl, who is no longer there. You decide to check it out.");
						System.out.println("You peek around a corner and see that there is a live show being held by Hatsune Miku!!");
						System.out.println("You regret not having gone up to her earlier, but stil enjoy the show nonetheless.");
						break;
					}
					
					else if (girl.equals("nothing"))
					{	
						System.out.println("You decide not to approach the mysterious girl. You are now bored. What will you "
								+ "do?\n");
						System.out.println("Play dice\nNothing\n");
						
						while (true)
						{
							String bored = key.nextLine().toLowerCase();
							
							if (bored.equals("play dice"))
							{	
								// randomizes six different dice rolls
								int d1 = r.nextInt(MAX) + 1;
								int d2 = r.nextInt(MAX) + 1;
								int d3 = r.nextInt(MAX) + 1;
								int d4 = r.nextInt(MAX) + 1;
								int d5 = r.nextInt(MAX) + 1;
								int d6 = r.nextInt(MAX) + 1;
								int roll = d1 + d2 + d3 + d4 + d5 + d6;
								
								String exclaim;
								if (roll >= 20)
								{
									exclaim = "nice!";
								}
								else if (roll >= 10 && roll < 20)
								{
									exclaim = "cool.";
								}
								else
								{
									exclaim = "sheesh.";
								}
								
								System.out.println("You realize you happen to have some dice on you, so you "
										+ "roll them to pass the time. You rolled 6 dice and rolled a " + roll + ", " + exclaim);
								break;
							}
							else if (bored.equals("nothing"))
							{
								System.out.println("You decide to still not do anything? Sure.");
								System.out.println("You grow tired and eventually drift off into the world of dreams...");
								break;
							}
						}	
						
						break;
					}

				}
				
				break;
			}
			else if (door.equals("middle"))
			{
				System.out.println("You open the door in front of you. Beyond it lies an open field full of different kinds of"
						+ " flowers.");
				System.out.println("You can immediately spot a dandelion, rose, and sunflower which all capture your eye. "
						+ "Which one do you want to pick up?\n");
				System.out.println("Dandelion\nRose\nSunflower\n");
				
				while (true)
				{
					String flower = key.next().toLowerCase();
					
					if (flower.equals("dandelion"))
					{
						System.out.print("You picked up the dandelion. \nYou softly blow it away, watching as the wind"
								+ " carries it further into the sky.");
						break;
					}
					else if (flower.equals("rose"))
					{
						System.out.println("You picked up the rose. \nYou gaze upon its crimson beauty as a warm feeling "
								+ " enters your heart.");
						break;
					}
					else if (flower.equals("sunflower"))
					{
						System.out.println("You picked up the sunflower. \nIts petals bask petals in the resplendent "
								+ "illumination of the daylight as you lay on the grass and take in the breeze.");
						break;
					}
				}
				break;
			}
			else if (door.equals("right"))
			{
				System.out.println("You open the rightmost door and are greeted by an empty room except for a box labeled "
						+ "\"for you <3\"");
				System.out.println("Should you open it?\n");
				System.out.println("Yes\nNo\n");
				
				while (true)
				{
					String box = key.next().toLowerCase();
					
					if (box.equals("yes"))
					{
						System.out.println("You open the box.....and there was a slice of cheese inside! "
								+ "You eat the cheese and feel strangely content.");
						break;
					}
					else if (box.equals("no"))
					{
						System.out.println("You decide not to open the box. I guess you'll never know what's in there...");
						break;
					}
				}
				break;
			}
			
		}
		 
		// ending message for all paths once they exit their respective loops
		System.out.println("\nTHE END");
	}

}
