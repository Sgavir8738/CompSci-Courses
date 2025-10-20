import java.awt.*;
import javax.swing.*;
import java.util.*;
public class SierpinskisTriangle extends Canvas {
	//Sebastian Gaviria
	public static void main(String[] args) {
		//Initialize display window
		JFrame frame = new JFrame ("Sierpinski's Triangle");
		frame.setSize(900, 900);
		SierpinskisTriangle st = new SierpinskisTriangle();
		frame.add(st);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{	//Initial shape creation
		int sub = this.getSize().height / 2;
		g.setColor(new Color(255, 255, 0));
		g.fillPolygon(new int[] {0, sub, sub * 2}, new int[] {sub * 2, 0, sub * 2}, 3);
		g.setColor(new Color(0, 0, 0));
		//Recursive method call with initial values
		drawTriangle(sub / 2, sub, 3 * sub / 2, sub, sub * 2, sub, sub * 2, g);
	}
	public void drawTriangle(int a, int b, int c, int d , int e, int f, int side, Graphics g)
	{
		int sub = side / 2;
		g.fillPolygon(new int[] {a, b, c}, new int[] {d, e, f}, 3);
		if (sub >= 4) //Halting condition
		{	//Recursive calls
			//Top
			drawTriangle(a + sub / 4, b, c - sub / 4, d - sub / 2, e - sub, f - sub / 2, sub, g);
			//Left
			drawTriangle(a - sub / 4, b - sub / 2, c - (3 * sub / 4), d + sub / 2, e, f + sub / 2, sub, g);
			//Right
			drawTriangle(a + (3 * sub / 4), b + sub / 2, c + sub / 4, d + sub / 2, e, f + sub / 2, sub, g);
		}
	}
}
