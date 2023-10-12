package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color pinky = new Color(233, 141, 130);
		StdDraw.setPenColor(pinky);
		StdDraw.filledRectangle(0.7,0.4, 1, 0.5);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.45,0.6,0.15);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.7,0.2,0.15);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(0.2,0.2,0.15);
		
	 
		
	}
}