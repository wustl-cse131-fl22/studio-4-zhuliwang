package studio4;

import java.util.Scanner;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		System.out.print("Enter x:");
		double x = in.nextDouble();
		
		System.out.print("Enter y:");
		double y = in.nextDouble();
		
		System.out.print("Enter halfWidth:");
		double halfWidth = in.nextDouble();
		
		System.out.print("Enter halfHeight:");
		double halfHeight = in.nextDouble();
		
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledRectangle(.75, .75, .1, .1);
	}
}
